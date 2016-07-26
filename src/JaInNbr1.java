/**
 * Created by Max on 2016/07/26.
 */
import java.io.*;
import java.nio.Buffer;

public class JaInNbr1 {
    public static void main(String[] args) throws IOException {
        String ss;
        int idt;

        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("整数入力：");
        ss = kbd.readLine();
        idt = Integer.parseInt(ss);
        System.out.println("数値 = " + idt);
    }
}
