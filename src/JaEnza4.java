/**
 * Created by Max on 2016/07/20.
 */
//インクリメントとデクリメント演算子
public class JaEnza4 {
    public static void main(String[] args) {
        int dt[] = {100,200,300};
        int n;

        n = 0;
        System.out.println(dt[n]);
        n = n + 1;
        System.out.println(dt[n]);
        n = n + 1;
        System.out.println(dt[n]);

        n = 0;
        System.out.println(dt[n++]);
        System.out.println(dt[n++]);
        System.out.println(dt[n++]);

        n = 5;
        while (--n >= 0){
            System.out.println("n = " + n);
        }
    }
}
