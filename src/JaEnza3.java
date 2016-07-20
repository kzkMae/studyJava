/**
 * Created by Max on 2016/07/20.
 */
public class JaEnza3 {
    public static void main(String[] args) {
        int a;

        for (a=1; a<=5; a++){
            System.out.println("----------"+a);
            if (a>=2 && a<=4)
                System.out.println("2以上かつ4以下");
            if (a<2 || a>4)
                System.out.println("２未満または４よりも大");
            if (!(a==1 || a==3))
                System.out.println("１または３、ではない");
        }
    }
}
