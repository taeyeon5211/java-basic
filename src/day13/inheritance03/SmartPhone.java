package day13.inheritance03;

public class SmartPhone extends Phone {

    public SmartPhone() {

    }

    public SmartPhone(String model, String color) {
        super();
        System.out.println("SmartPhone model 과 color" + super.getModel() + " " + super.getColor());
    }
}
