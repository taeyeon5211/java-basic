package day02;

public class IntegerLiteralEx1 {
    public static void main(String[] args) {
        /*
        * 11    => 2진수   var1
        * 134   => 8진수   var2
        * 365   => 10진수  var3
        * 179   => 16진수  var4
        * 리터럴 처리하여 출력은 10진수로*/
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xb3;
        System.out.printf("%d %d %d %d", var1, var2, var3, var4);
    }
}
