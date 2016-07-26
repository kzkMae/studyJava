/**
 * Created by Max on 2016/07/26.
 */
import java.io.*;

public class JaInOut3 {
    public static void main(String[] args) throws IOException {
        String ss;

        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));

        while ((ss = kbd.readLine()) != null){
            System.out.println("ss = " + ss);
        }
    }
}
