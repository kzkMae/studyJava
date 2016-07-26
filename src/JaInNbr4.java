import java.io.*;

/**
 * Created by Max on 2016/07/26.
 */
//全ての例外をtry-catchで処理
public class JaInNbr4 {
    public static void main(String[] args) {
        String ss;
        int idt;

        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("整数入力：");
            ss = kbd.readLine();
            idt = Integer.parseInt(ss);
            System.out.println("数値 = " + idt);
        } catch (IOException e){
            System.out.println("入出力エラーである");
        } catch (NumberFormatException e){
            System.out.println("入力誤りです");
        }
    }
}
