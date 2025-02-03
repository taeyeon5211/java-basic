package day13.inheritance04;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = (Child) p;
        c.childMethod(); // 다운 캐스팅의 주의점
    }
}
