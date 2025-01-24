package day12.class_review;

public class Printer {
    private int intValue;
    private String stringValue;
    private double doubleValue;
    private boolean booleanValue;

    public void println(int intValue) {
        System.out.println(intValue);
    }
    public void println(String stringValue) {
        System.out.println(stringValue);
    }
    public void println(double doubleValue) {
        System.out.println(doubleValue);
    }
    public void println(boolean booleanValue) {
        System.out.println(booleanValue);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
