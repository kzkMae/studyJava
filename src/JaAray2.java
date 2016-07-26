/**
 * Created by Max on 2016/07/26.
 */
public class JaAray2 {
    public static void main(String[] args) {
        int i,j;
        int a[] = {10,20,30,40,50};
        int b[][] = {{10,11,12,13},{20,21,22,23},{30,31,32,33}};

        System.out.print("a.length = " + a.length + "\t");
        for (i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.println("b.length = " + b.length);
        for (i = 0; i<b.length; i++){
            System.out.print("b[" + i + "].length = " + b[i].length + " ");
            for (j = 0; j<b[i].length; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}
