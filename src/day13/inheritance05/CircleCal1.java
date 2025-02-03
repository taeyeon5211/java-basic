package day13.inheritance05;

public class CircleCal1 extends CircleCal{

//    public double areaCircle(double radius) {
//        System.out.println("나는 Circle1의 areaCircle 메소드야");
//        super.areaCircle(20);
//        return Math.PI * radius * radius;
//    }

    @Override
    public double areaCircle(double radius) {
        System.out.println("나는 Circle1의 areaCircle 메소드야");
        super.areaCircle(20); //자식 메소드와 부모메소드의 공동 작업처리 기법
        //부모 메소드를 재사용함으로써 자식메소드의 중복 작업을 최소화 할 수 있다.
        return Math.PI * radius * radius;
    }
    //오버라이딩(메소드의 재정의)은 부모 메소드는 숨겨지고
    //자식 메소드만 사용되기 때문에 부모메소드의 일부만 변경되더라도
    //중복된 내용을 자식 메소드도 가질 수 있다. 간혹, 부모 메소드도 호출
    //해야할 경우가 있다 super 키워드를 사용 super (부모 클래스의 객체값을 저장한 특수 키워드
    //this 키워드 현재 자신의 객체주소값을 저자한 특수 키워드

    public static void main(String[] args) {
        CircleCal c1 = new CircleCal();
        double result = c1.areaCircle(10);
        System.out.printf("원의 면적: %.1f%n", result);

        System.out.println("=".repeat(30));
        CircleCal1 c2 = new CircleCal1();
        result = c2.areaCircle(10);
        System.out.printf("원의 면적: %.1f%n", result);

        System.out.println("=".repeat(30));
        CircleCal c3 = new CircleCal1();
        result = c3.areaCircle(10);
        System.out.printf("원의 면적: %.1f", result);
    }
}
