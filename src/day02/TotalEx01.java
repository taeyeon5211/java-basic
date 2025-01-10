package day02;

import java.util.Scanner;

public class TotalEx01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        FourArithmetic.four();
        Operator.avg();
        four();
        avg();
    }

    private static void four() {
        System.out.print("a의 값을 입력하세요:");
        int a = sc.nextInt();
        System.out.print("b의 값을 입력하세요:");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    private static void avg() {
        System.out.print("국어 점수를 입력하세요:");
        int kor = sc.nextInt();
        System.out.print("수학 점수를 입력하세요:");
        int eng = sc.nextInt();

        System.out.println("총점:" + (kor + eng));
        System.out.println("평균:" + (double) (kor + eng) / 2);
        double average = (kor + eng) / 2;
        System.out.printf("평균: %.2f\n", average);
    }
}
