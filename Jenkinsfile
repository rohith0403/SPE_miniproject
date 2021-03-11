pipeline {
    environment{
        registry = "rohith0000/spe_calculator"
        registryCredential = 'dockerhub'
        dockerImage = ''
    }
    agent any
    stages {
        stage('Git clone'){
            steps{
                git 'https://github.com/rohith0403/SPE_miniproject'
            }
        }
        stage('Clean the target folder'){
            steps{
                sh 'mvn clean'            
            }
        }
        stage('Run the files'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Testing'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Building docker image'){
            steps{
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Deploying docker image to docker hub'){
            steps{
                script{
                    docker.withRegistry('',registryCredential){
                        dockerImage.push('latest')
                    }
                }
           }
        }
        stage('Remove docker images that we dont need'){
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }
        	stage('Rundeck Deploy') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck server",
          options: """
            BUILD_VERSION=$BUILD_NUMBER
          """,
          jobId: "91235dae-0528-402d-a29e-fa4303626a36"])
        }
      }
    }
  }
}
