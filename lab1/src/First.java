import java.util.Date;
import static java.lang.Math.*;
public class First {
    public void s(double a,double b,double x)
    {
        double s = 0;
        s = Math.pow(x,3)*Math.pow(Math.tan(a),2)*Math.pow((x+b),2)+a/Math.sqrt(x+b);
        System.out.println(" x = "+x+" b = "+b+" a = "+a+" s = "+s);
    }
}
