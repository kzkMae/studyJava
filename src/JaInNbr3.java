/**
 * Created by Max on 2016/07/26.
 */
import java.io.*;

public class JaInNbr3 {
    public static void main(String[] args) throws IOException {
        String ss;
        int idt;

        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("整数入力：");
        ss = kbd.readLine();

        try {
            idt = Integer.parseInt(ss);
            System.out.println("数値 = " + idt);
        } catch (NumberFormatException e){
            System.out.println("入力誤りです");
            System.out.println("e = " + e);
        }
    }
}
