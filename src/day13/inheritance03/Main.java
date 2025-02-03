package day13.inheritance03;

public class Main {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        Phone p = new Phone();
        SmartPhone sp1 = (SmartPhone) p;
        sp1.getModel();
    }
}
