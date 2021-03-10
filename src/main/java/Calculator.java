import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your operation: \n");
        System.out.println("Type 1 for square root " + "\n" + "Type 2 for factorial" + "\n" + "Type 3 for natural logarithm" + "\n" + "Type 4 for power function");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                double x;
                System.out.println("Enter the number(float) ");
                x = sc.nextDouble();
                if (x < 0) throw new IllegalArgumentException("Enter a proper number");
                System.out.println(sq_root(x));
        }
    }

    public static double sq_root(double x){
        double y = Math.sqrt(x);
        return y;
    }
}
