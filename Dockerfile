FROM maven:3.6.3-jdk-8 as maven_build
WORKDIR /build
COPY pom.xml .

COPY src/ /build/src
RUN mvn install

FROM openjdk:8-jre
COPY arguments.txt .
COPY --from=maven_build /build/target/spe_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar .

CMD java -jar spe_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar < ./arguments.txt