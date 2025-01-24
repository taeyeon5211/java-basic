package day12.cal;

public class Inheritance01 extends Calculation{
    int x;
    int y;

    Inheritance01(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }
}
