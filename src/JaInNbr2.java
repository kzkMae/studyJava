/**
 * Created by Max on 2016/07/26.
 */
import java.io.*;

public class JaInNbr2 {
    public static void main(String[] args) throws IOException {
        String ss;
        double ddt;

        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("浮動小数点を入力:");
        ss = kbd.readLine();
        ddt = Double.parseDouble(ss);
        System.out.println("数値 = " + ddt);
    }
}
