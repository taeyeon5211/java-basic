package day12.cal;

public class CalMain {

    public static void main(String[] args) {
        Inheritance01 childCal = new Inheritance01(10, 20);

        int addition = childCal.addition(childCal.x, childCal.y);
        System.out.println(addition);
        int subtraction = childCal.subtraction(childCal.x, childCal.y);
        System.out.println(subtraction);
        int multiplication = childCal.multiplication(childCal.x, childCal.y);
        System.out.println(multiplication);
    }
}
