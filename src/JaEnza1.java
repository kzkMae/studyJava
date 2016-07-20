/**
 * Created by Max on 2016/07/19.
 */
public class JaEnza1 {
    public static void main(String[] args) {
        int a,b,c;
        double f,g,h;

        a = 100;
        System.out.println("a   = " + a);
        b = 30;
        System.out.println("b   = " + b);
        c = a + b;
        System.out.println("a+b = " + c);
        c = a - b;
        System.out.println("a-b = " + c);
        c = a * b;
        System.out.println("a*b = " + c);
        c = a / b;
        System.out.println("a/b = " + c);
        c = a % b;
        System.out.println("a%b = " + c);

        f = 90.0;
        System.out.println("f   = " + f);
        g = 40.0;
        System.out.println("g   = " + g);
        h = f / g;
        System.out.println("f/g = " + h);

        System.out.println("10と４の計算");
        System.out.println("int / int = " + (10/4));
        System.out.println("double / double = " + (10.0/4.0));
        System.out.println("double / int = " + (10.0/4));
        System.out.println("int / double = " + (10/4.0));
    }
}
