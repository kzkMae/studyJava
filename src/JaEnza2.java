/**
 * Created by Max on 2016/07/20.
 */
public class JaEnza2 {
    public static void main(String[] args) {
        //演算の優先順位
        int a;
        a = 10+20*30;
        System.out.println("10+20*30="+ a);
        a= (10+20)*30;
        System.out.println("(10+20)*30="+a);
        a = 100/20/5;
        System.out.println("100/20/5="+a);
        a=100/(20/5);
        System.out.println("100/(20/5)="+a);
        a=100/20*5;
        System.out.println("100/20*5="+a);
        a=100/(20*5);
        System.out.println("100/(20*5)="+a);
        a= 100+20/5;
        System.out.println("100+20/5="+a);

        for (a=1; a<=5; a++){
            System.out.println("---------------" + a);
            if (a < 2) System.out.println("2未満");
            if (a >= 4) System.out.println("4以上");
            if (a == 3) System.out.println("3である");
            if (a != 3) System.out.println("3ではない");
        }
    }
}
