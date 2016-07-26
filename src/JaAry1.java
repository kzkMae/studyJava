/**
 * Created by Max on 2016/07/26.
 */
/*
配列の宣言方法
int a[] = new int[10];
int[] a = new int[10];
int[] a;
a = new int[10];

配列の長さ
変数.length
 */


public class JaAry1 {
    public static void main(String[] args) {
        int i;
        int a[] = new int[10];

        for (i=0; i<=9; i++)
            a[i] = i*i;

        for (i=0; i<10; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
