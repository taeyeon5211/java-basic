package day09;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("당신의 연락처를 입력하세요 : ");
        String userMobile = sc.nextLine();
        while (true) {
            System.out.println("*************************************************");
            System.out.println("\t\t\t" + "Welcome to Shopping Mall");
            System.out.println("\t\t\t" + "Welcome to Book Market!!!");
            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            int cmd = sc.nextInt();
            if (cmd == 1) {
                menuGuestInfo(userName, userMobile);
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
        }
    }

    private static void menuGuestInfo(String userName, String userMobile) {
        System.out.println("고객 정보 : ");
        System.out.println("이름 : " + userName + " 연락처 : " + userMobile);
    }

    private static void menuIntroduction() {
        System.out.println("*************************************************");
        System.out.println("1. 고객정보 확인하기\t\t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항복 수량 줄이기");
        System.out.println("3. 장바구니 비우기\t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기\t\t\t8. 바구니에 항목 추가하기");
        System.out.println("*************************************************");
    }



    public static void BookList(String[][] book) {
        book[0][0] = "ISBM1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT 전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBM1235";
        book[1][1] = "안드로이드 프로그래";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT 전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBM1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨터 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터 입문";
        book[2][6] = "2019/06/10";

    }
}
