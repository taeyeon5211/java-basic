package day02;

import java.util.Scanner;

public class AddSum {
    /*
    * 정수형 변수 value 선언
    * value 변수에 10을 할당
    * value 변수에 사용자에게 숫자를 입력받아 해당 숫자를 더한 후 result 변수에 저장
    * result 출력하는 addSum.java*/

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int value = 10;
        sum += value;
        add(sum);
    }

    private static void add(int sum) {
        int value = sc.nextInt();
        sum += value;
        System.out.println(sum);
    }
}