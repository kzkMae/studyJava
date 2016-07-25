/**
 * Created by Max on 2016/07/22.
 */
public class JaBreak {
    public static void main(String[] args) {
        int i, sum;
        int dt[] = {5,9,6,-1,2,3,4,7,1,8};

        sum = 0;
        for (i=0; i<10; i++){
            System.out.println("dt[i] = " + dt[i]);
            if (dt[i] == -1) break;
            sum = sum + dt[i];
        }
        System.out.println("sum = " + sum);

        i = sum = 0;
        while (i<10){
            System.out.println("dt[i] = " + dt[i]);
            if (dt[i] == -1) break;
            sum = sum + dt[i];
            ++i;
        }
        System.out.println("sum2 = " + sum);
    }
}
