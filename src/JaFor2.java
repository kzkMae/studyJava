/**
 * Created by Max on 2016/07/22.
 */
public class JaFor2 {
    public static void main(String[] args) {
        for (int a = 1; a<=5; a++)
            System.out.println();

        for (int sum=0,mul=1, i= 1; i<=5; i++){
            sum = sum + i;
            mul = mul * i;
            System.out.println("sum=" + sum + " mul=" + mul);
        }

        for (int a=0,b=5; a<=5; a++, b--)
            System.out.println("a=" + a + " b=" + b + " a*b=" + a*b);
    }

}
