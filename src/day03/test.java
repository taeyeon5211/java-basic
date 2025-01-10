package day03;

public class test {
    public static void main(String[] args) {
/*
        byte a = 127;
        //int a = 127;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
*/
        String str = "나는 자바 \"J2SE\"";
        System.out.println(str);
        String str1 = "나는 \t자바\n \\J2SE\\";
        System.out.println(str1);

        System.out.println("서식 문자로 출력하는 방법입니다.\n이것은 문자열을 나타냅니다.");
        System.out.println("수를 출력할 때는 따옴표를 생략합니다.\n123\n6.500000");
        System.out.println("수식을 출력하면 계산 결과가 출력됩니다.\n10 + 5 = 15\n내 생일은 2005년 6월 17일 입니다.");
        String str2 = """
                 subject score
                ==============
                  korean    90
                 english   100
                computer    80
                김진수 학생의 점수는 \
                최우수로 졸업하였습니다.""";
        System.out.println(str2);

        byte bb = 10;
        int cc = bb;
        long dd = cc;
        float ff = dd;
        double doub = ff;
        System.out.println(doub);

        char charValue = 'A';
        int intValue = charValue;
        System.out.println(charValue);
        System.out.println(intValue);

        byte byteValue = 65;
        int charValue2 = byteValue;
    }
}
