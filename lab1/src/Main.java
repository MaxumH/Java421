import java.util.InputMismatchException;
import java.util.Date;
import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("If you want output defalt values press 1");
        System.out.println("if you want to enter your values press 2\n");
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        switch (q)
        {
            case 1:
                double a = 16.5;
                double b = 3.4;
                double x = 0.61;
                First obj = new First();
                obj.s(a,b,x);
                Q obj1 = new Q();
                obj1.Q(a,b,x);
            break;
            case 2:
                System.out.println("Enter a,b,x");
                Scanner f = new Scanner(System.in);
                a = f.nextDouble();
                Scanner w = new Scanner(System.in);
                b = w.nextDouble();
                Scanner e = new Scanner(System.in);
                x = e.nextDouble();
                First obj2 = new First();
                obj2.s(a,b,x);
                Q obj3 = new Q();
                obj3.Q(a,b,x);
            break;
        }
    }
}