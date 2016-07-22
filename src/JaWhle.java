/**
 * Created by Max on 2016/07/22.
 */
public class JaWhle {
    public static void main(String[] args) {
        int i, sum;
        int dt[] = {10, 20, 30, -1, 50};

        System.out.println("------------(1) １～５の和を計算");
        i = 1;
        sum = 0;
        while (i <=5){
            sum = sum +i;
            i++;
        }
        System.out.println("sum=" + sum);

        System.out.println("----------(2) -1にであうまでの配列値を表示");
        i=0;
        while (dt[i] != -1){
            System.out.println("i=" + i+ " dt[i]=" + dt[i]);
            i++;
        }

    }
}
