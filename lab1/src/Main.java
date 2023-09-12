import java.util.InputMismatchException;
import java.util.Date;
import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void S(double a,double b,double x)
    {
        double s = 0;
        s = Math.pow(x,3)*Math.pow(Math.tan(a),2)*Math.pow((x+b),2)+a/Math.sqrt(x+b);
        System.out.println(" x = "+x+" b = "+b+" a = "+a+" s = "+s);
    }
    public static void Q(double a,double b,double x)
    {
        double e = 2.71828;
        double Q = 0;
        Q = b*Math.pow(x,2)*a/Math.pow(e,a*x)-1;
        System.out.println(" x = "+x+" b = "+b+" a = "+a+" Q = "+Q);
    }
    public static void main(String[] args) {
        double a = 16.5;
        double b = 3.4;
        double x = 0.61;
        System.out.println("If you want output defalt values press 1");
        System.out.println("if you want to enter your values press 2\n");
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        switch (q)
        {
            case 1:

                S(a,b,x);
                Q(a,b,x);
            break;
            case 2:
                System.out.println("Enter a,b,x");
                Scanner f = new Scanner(System.in);
                a = f.nextDouble();
                Scanner w = new Scanner(System.in);
                b = w.nextDouble();
                Scanner e = new Scanner(System.in);
                x = e.nextDouble();
                S(a,b,x);
                Q(a,b,x);
            break;
        }
    }
}