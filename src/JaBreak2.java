/**
 * Created by Max on 2016/07/25.
 */
public class JaBreak2 {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("----------------- tas1");
        for (a=1; a<=4; a++){
            System.out.println("start a = " + a);
            for (b = 10 ; b<=40; b+=10){
                System.out.println("\t b = " + b);
                if (b == 20) break;
            }
            System.out.println("end");
        }

        System.out.println("------------- tas2");
        for_break: for (a=1; a<=4; a++){
            System.out.println("start a = " + a);
            for (b = 10 ; b<=40; b+=10){
                System.out.println("\t b = " + b);
                if (b == 20) break for_break;
            }
            System.out.println("end");
        }

        System.out.println("-------------- tas3");
        a = 30;
        if_break1: if (a >= 10){
            System.out.println("aaaaa");
            if (a >= 20){
                System.out.println("bbbbbbb");
                if (a == 30) break if_break1;
                System.out.println("ccccccc");
            }
            System.out.println("dddddd");
        }

        System.out.println("--------------- tstend");
    }
}
