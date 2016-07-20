/**
 * Created by Max on 2016/07/20.
 */
public class JaIf1 {
    public static void main(String[] args) {
        int a,b,c;

        a = 100;
        b = 100;

        System.out.println("a = " + a + ", b = " + b);

        if (a > 50)
            System.out.println("aは50より大きい");

        if (a%2 == 0)
            System.out.println("aは偶数");
        else
            System.out.println("aは奇数");

        if (a > b)
            System.out.println("aはbよりも大きい");
        else if (a < b)
            System.out.println("aはbよりも小さい");
        else
            System.out.println("a = b");

        if (a > 80){
            b = 10;
            c = 20;
        }
        else {
            b = 30;
            c = 40;
        }

        System.out.println("a="+a+" b="+b+" c="+c);
    }
}
