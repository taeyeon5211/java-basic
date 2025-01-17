package day05;

public class Exercise3_9 {
    public static void main(String[] args) {
        char c = 'z';
        boolean b = c >= 48 || c <= 57 || c >= 65 || c <= 90 || c >= 97 || c <= 122 ? true : false;
        System.out.println(b);
    }
}
