package day02;

import java.util.Scanner;

public class FourArithmetic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        four();
    }

    public static void four() {
        System.out.print("a의 값을 입력하세요:");
        int a = sc.nextInt();
        System.out.print("b의 값을 입력하세요:");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
