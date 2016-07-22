/**
 * Created by Max on 2016/07/22.
 */
public class JaAry1b {
    public static void main(String[] args) {
        int i;
        int a[] = new int[10];

        for (i=0; i<=9; i++)
            a[i] = i * i;

        for (int dt : a)
            System.out.print(dt + " ");
        System.out.println("\n");
    }
}
