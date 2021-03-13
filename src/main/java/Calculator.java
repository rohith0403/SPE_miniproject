import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {
    private final static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your operation: \n");
        int operation = 1;
        while(operation != 0){
            System.out.println("Type 1 for square root " + "\n" + "Type 2 for factorial" + "\n" + "Type 3 for natural logarithm" + "\n" + "Type 4 for power function" + "Type 0 to exit");
            operation = sc.nextInt();
            switch (operation) {
                case 1:
                    double x;
                    System.out.println("Enter the number(double) ");
                    x = sc.nextDouble();
                    if (x < 0) throw new IllegalArgumentException("Enter a proper number");
                    System.out.println(sq_root(x));
                    break;
                case 2:
                    int n;
                    System.out.println("Enter the number(integer) ");
                    n = sc.nextInt();
                    if (n < 0) throw new IllegalArgumentException("Enter a proper number");
                    System.out.println(factorial(n));
                    break;
                case 3:
                    double l;
                    System.out.println("Enter the number(double) ");
                    l = sc.nextDouble();
                    if (l < 0) throw new IllegalArgumentException("Enter a proper number");
                    System.out.println(logarithm(l));
                    break;
                case 4:
                    double b; int e;
                    System.out.println("Enter the base(double) and the exponent(integer): ");
                    b = sc.nextDouble(); e = sc.nextInt();
                    System.out.println(power(b, e));
                    break;

            }
        }
    }

    public static double sq_root(double x){
        logger.info("FUNCTION : SQUARE ROOT");
        double y = Math.sqrt(x);
        logger.info("INPUT : " + x + " RESULT : " +y);
        return y;
    }
    public static int factorial(int n){
        logger.info("FUNCTION : FACTORIAL");
        int res =1;
        for(int i = 1; i <= n; i++){
            res = res * i;
        }
        logger.info("INPUT : " + n + " RESULT : " + res);
        return res;
    }
    public static double logarithm(double x){
        logger.info("FUNCTION : LOGARITHM");
        double y = Math.log(x);
        logger.info("INPUT : " + x + " RESULT : " +y);
        return y;
    }
    public static double power(double x, int b){
        logger.info("FUNCTION : POWER");
        double y = Math.pow(x, b);
        logger.info("INPUT : BASE : " + x + " EXPONENT : " + b + " RESULT : " +y);
        return y;
    }
}
