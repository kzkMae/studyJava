/**
 * Created by Max on 2016/07/20.
 */
public class StringEqual {
    public static void main(String[] args) {
        String s1 = "aaaa", s2 = "bbbbb";
        if (s1 == s2){  //参照（アドレス）を比較しているので，文字列そのものを比較しているわけではない
            System.out.println(s1 == s2);
        }
        //文字列比較を行う場合
        if (s1.equals(s2))
            System.out.println("answer");
        if (s1.equals("aaaa"))
            System.out.println("文字列.equals(文字列)");
    }
}
