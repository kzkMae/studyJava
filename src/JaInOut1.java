import java.io.*;

/**
 * Created by Max on 2016/07/26.
 */
public class JaInOut1 {
    public static void main(String[] args) throws IOException {
        String ss;

        //InputStreamReaderオブジェクトを生成
        //入力先を指定
        InputStreamReader isr = new InputStreamReader(System.in);

        //BufferedReaderオブジェクトを作成
        //isrをバッファ入力機能に結び付ける
        BufferedReader kbd = new BufferedReader(isr);

        /*
        上記２つを１つにすると
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.In))
         */

        ss = kbd.readLine();
        System.out.println(ss);
    }
}
