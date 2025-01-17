package day07;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("당신의 연락처를 입력하세요 : ");
        String number = sc.nextLine();
        while (true) {
            System.out.println("******************************************************");
            System.out.println("Welcome to Shopping Mall");
            System.out.println("Welcome to Book Mall");
            System.out.println("******************************************************");
            System.out.println("1. 고객정보 확인하기          4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기     5. 장바구니의 항복 수량 줄이기");
            System.out.println("3. 장바구니 비우기           6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기           8. 바구니에 항목 추가하기");
            System.out.println("******************************************************");
            System.out.print("메뉴 번호를 선택해주세요 ");
            int cmd = sc.nextInt();
            if (cmd == 1) {
                System.out.println("1선택");
            } else if (cmd == 2) {
                System.out.println("2선택");
            } else if (cmd == 3) {
                System.out.println("3선택");
            } else if (cmd == 4) {
                System.out.println("4선택");
            } else if (cmd == 5) {
                System.out.println("5선택");
            } else if (cmd == 6) {
                System.out.println("6선택");
            } else if (cmd == 7) {
                System.out.println("7선택");
            } else if (cmd == 8) {
                break;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
            System.out.println("현재 고객 정보 : ");
            System.out.printf("이름 : %s  연락처 : %s%n", name, number);
        }
    }
}
