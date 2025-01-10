package day02;

import java.util.Scanner;

public class Operator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        avg();
    }

    protected static void avg() {
        System.out.print("국어 점수를 입력하세요:");
        int kor = sc.nextInt();
        System.out.print("수학 점수를 입력하세요:");
        int eng = sc.nextInt();

        System.out.println("총점:" + (kor + eng));
        System.out.println("평균:" + (kor + eng) / 2);
    }
}
