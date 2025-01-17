package day05;

public class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'Z';

        char lowerCase = ch >= 65 && ch <= 122 ? (char) (97 + (ch - 65)) : ch;

        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase : " + lowerCase);
    }
}
