/**
 * Created by Max on 2016/07/20.
 */
public class JaFor1 {
    public static void main(String[] args) {
        int i, sum, mul;

        sum = 0;
        mul = 1;
        for (i=1; i<=5; i++){
            sum += i;
            mul *= i;
        }
        System.out.println("和 = "+ sum);
        System.out.println("籍 = " + mul);

        for (i=40; i>=20; i -= 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
