/**
 * Created by Max on 2016/07/26.
 */
public class practice6 {
    public static void main(String[] args) {
        int year;

        for (year=1900; year<=2000; year++){
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                System.out.print(year + " ");
        }
        System.out.println();
    }
}
