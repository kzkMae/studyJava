/**
 * Created by Max on 2016/07/25.
 */
public class JaCont {
    public static void main(String[] args) {
        int a, b;

        System.out.println("--------------(1) break test");
        for (a=1; a<=3; a++){
            System.out.println("start a = " + a);
            if (a == 2) break;
            System.out.println("end");
        }

        System.out.println("-------------(2) continue tst");
        for (a = 1; a<=3; a++){
            System.out.println("start a = " + a);
            if (a == 2) continue;
            System.out.println("end");
        }

        System.out.println("-----------(3) continue(with label) test");
        for_cont: for (a=1; a<=3; a++){
            System.out.println("a_start a = " + a);
            for (b = 1; b <=3; b++){
                System.out.println("\t b_start b = " + b);
                if (b == 2) continue for_cont;
                System.out.println("\tb_end");
            }
            System.out.println("a_end");
        }
    }
}
