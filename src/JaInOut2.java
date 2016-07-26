import java.io.*;
/**
 * Created by Max on 2016/07/26.
 */
//自分で例外処理を書く場合
public class JaInOut2 {
    public static void main(String[] args) {
        String ss;

        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));

        try {
            ss = kbd.readLine();
            System.out.println(ss);
        }
        catch (IOException e){
            System.out.println("Err: " + e);
        }
    }
}
