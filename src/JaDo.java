/**
 * Created by Max on 2016/07/22.
 */
public class JaDo {
    public static void main(String[] args) {
        int i;
        int d1[] = {10, 20,30,-1, 50};
        int d2[] = {0,0,0,0,0};

        i = -1;

        do {
            ++i;
            d2[i] = d1[i];
        } while (d2[i] != -1);

        for (i=0; i<5; i++)
            System.out.print(d2[i] + " ");
        System.out.println();
    }
}
