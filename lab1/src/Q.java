import static java.lang.Math.*;
public class Q {

    public static void Q(double a,double b,double x)
    {
        double e = 2.71828;
        double Q = 0;
        Q = b*Math.pow(x,2)*a/Math.pow(e,a*x)-1;
        System.out.println(" x = "+x+" b = "+b+" a = "+a+" Q = "+Q);
    }
}
