import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your operation: \n");
        System.out.println("Type 1 for square root " + "\n" + "Type 2 for factorial" + "\n" + "Type 3 for natural logarithm" + "\n" + "Type 4 for power function");
        int operation = sc.nextInt();
        switch (operation){
            case 1:
                while(true){
                    System.out.println("Enter the number(float) " );
                    float x = sc.nextFloat();
                    if(x < 0) throw new IllegalArgumentException("Enter a proper number");
                    else break;
                }
                    System.out.println(Math.sqrt(x));
            case 2:
                while(true){
                    System.out.println("Enter the number(int) " );
                    int x = sc.nextInt();
                    if(x < 0) throw new IllegalArgumentException("Enter a proper number");
                    else break;
                }
                System.out.println(factorial(x));
            case 3:
                while(true){
                    System.out.println("Enter the number(float) " );
                    float x = sc.nextFloat();
                    if(x < 0) throw new IllegalArgumentException("Enter a proper number");
                    else break;
                }
                System.out.println(Math.log(x));
            case 4:
                while(true){
                    System.out.println("Enter the number(float) " );
                    float x = sc.nextFloat();
                    if(x < 0) throw new IllegalArgumentException("Enter a proper number");
                    else break;
                }
        }
    }
}
