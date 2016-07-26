/**
 * Created by Max on 2016/07/26.
 */
public class practice5 {
    public static void main(String[] args) {
        int i,sum;

        System.out.println("---------------------(1) for");
        sum = 0;
        for(i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);

        System.out.println("---------------------(2) while");
        sum = 0;
        i = 1;
        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);

        System.out.println("---------------------(3) do-while");
        sum = 0;
        i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("sum = " + sum);
    }
}
