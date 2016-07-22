/**
 * Created by Max on 2016/07/22.
 */
public class JaSwch2 {
    public static void main(String[] args) {
        //意図的にbreak文を記述しない場合
        int a;

        for (a=1; a<=5; a++){
            System.out.println("----------------" +a);
            switch (a){
                case 1:
                    System.out.println("真っ赤な");
                case 2:
                    System.out.println("血");
                    break;
                case 3:
                    System.out.println("床に広がる");
                case 4:
                    System.out.println("赤黒い何か");
                    break;
                case 5:
                    System.out.println("該当なし");
            }
        }
    }
}
