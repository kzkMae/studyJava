/**
 * Created by Max on 2016/07/19.
 */
//enum型を使用する
enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}
public class dataType {
    public static void main(String[] args) {
        /*
        boolean
            １ビット真偽値
            trueまたはfalse
        char
            16ビットUnicode文字
                \u0000～\uFFFF
         byte
            ８ビット符号付整数
                -128    127
         short
            16ビット符号付整数
                -32768  32767
         int
            32ビット符号付整数
         long
            64ビット符号付整数  1234567890Lとかく（L）
         float
            32ビット浮動小数点　123.456Fとかく（F）
         double
            64ビット浮動小数点
         */
        /*
        配列の宣言
        int a[] = new int[10];

         */
        Suit card;
        String ss = "";
        card = Suit.SPADES;
        if (card == Suit.SPADES) ss = "スペードです";
        else if (card == Suit.CLUBS) ss="クラブです";
        else if (card == Suit.DIAMONDS) ss = "ダイヤです";
        else if (card == Suit.HEARTS) ss = "ハートでっす";
        System.out.println("カードは、" + ss);
        /*
        エスケープ文字
        \b  :バックスペース
        \f  :改ページ
        \n  :改行
        \r  :復帰
        \t  :水平タブ
        \\  :￥
        \'  :’
        \"  :”
        \ooo    :３ケタの８進数
        \uffff  :４ケタの16進数
        */
    }
}
