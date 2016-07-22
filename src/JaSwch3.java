/**
 * Created by Max on 2016/07/22.
 */
public class JaSwch3 {
    public static void main(String[] args) {
        char ch[] = {'Y','N','A','y','n'};
        int n;

        for (n=0; n<5; n++){
            System.out.println("-----------------"+ch[n]);
            switch (ch[n]){
                case 'Y':
                case 'y':
                    System.out.println("yes");
                    break;
                case 'N':
                case 'n':
                    System.out.println("no");
                    break;
                default:
                    System.out.println("?");
            }
        }
    }
}
