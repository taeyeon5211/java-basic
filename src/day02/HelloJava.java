package day02;

import java.util.Scanner;

public class HelloJava {
    /*
    * 1. "Hello Java" 문자열을 출력하는 HelloJava 클래스를 작성하세요.
    * 2. "Hello Java" 출력한 후 사용자에게 이름을 입력받아 "Hello 구댕이" 출력하세요
    */
    public static void main(String[] args) {
        System.out.println("Hello Java");
        callName();

        System.out.print("당신의 이름을 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        callName();

        String eat = callString();
        System.out.println(eat);

        eat = eat + " 맛있다. 냠냠";
        System.out.println(eat);

        callStringParam(eat);
    }

    public static void callName() {
        System.out.println("내 이름을 불러죠...아하하");
    }

    public static String callString() {
        String name = "라면";
        return name;
    }

    public static void callStringParam(String eat) {
        System.out.println(eat + " callStringParam 처리 완료");
    }
}
