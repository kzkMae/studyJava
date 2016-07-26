/**
 * Created by Max on 2016/07/26.
 */
public class JtAry2 {
    public static void main(String[] args) {
        int dt[] = {10,20,-30,40,-50,60};
        int sum=0,i;

        for (i=0; i < dt.length; i++){
            if (dt[i] > 0)
                sum += dt[i];
        }
        System.out.println("合計値 = " + sum);

    }
}
