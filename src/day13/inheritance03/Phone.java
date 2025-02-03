package day13.inheritance03;

public class Phone {

    //멤버 변수
    private String bander;
    private String model;
    private String color;

    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
