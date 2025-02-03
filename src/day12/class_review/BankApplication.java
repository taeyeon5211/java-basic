package day12.class_review;

import java.util.Scanner;

public class BankApplication {
    static Scanner sc = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static int index = 0;
    static boolean quit = false;


    public static void main(String[] args) {

        while (!quit) {
            System.out.println("-".repeat(50));
            System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 |");
            System.out.println("-".repeat(50));
            System.out.print("선택 > ");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    makeAccount();
                    break;
                case 2:
                    showAccounts();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdrawal();
                    break;
                case 5:
                    isQuit();
                    break;
            }
        }
    }

    private static void withdrawal() {
        System.out.println("-".repeat(3));
        System.out.println("출금");
        System.out.println("-".repeat(3));
        System.out.print("계좌 번호 : ");
        String balanceNumber = sc.next();
        System.out.print("출금액 : ");
        int balance = sc.nextInt();
        for (Account account : accounts) {
            if (account == null) {
                break;
            }
            if (balanceNumber.equals(account.getBalanceNumber())) {
                if (balance < 0) {
                    System.out.println("출금액은 0보다 커야 됩니다.");
                } else {
                    if (balance > account.getBalance()) {
                        System.out.println("계좌에 잔액이 부족합니다.");
                        break;
                    } else {
                        account.minusBalance(balance);
                        System.out.println("출금이 성공되었습니다.");
                    }
                }
            }
        }
    }

    private static boolean isQuit() {
        System.out.print("프로그램 종료");
        quit = true;
        return quit;
    }

    private static void deposit() {
        System.out.println("-".repeat(3));
        System.out.println("예금");
        System.out.println("-".repeat(3));
        System.out.print("계좌 번호 : ");
        String balanceNumber = sc.next();
        System.out.print("예금액 : ");
        int balance = sc.nextInt();
        for (Account account : accounts) {
            if (account == null) {
                break;
            }
            if (balanceNumber.equals(account.getBalanceNumber())) {
                account.plusBalance(balance);
            }
        }
    }

    private static void showAccounts() {
        System.out.println("-".repeat(6));
        System.out.println("계좌목록");
        System.out.println("-".repeat(6));
        for (Account account : accounts) {
            if (account == null) {
                break;
            }
            System.out.println(account.getBalanceNumber() + " " + account.getName() + " " + account.getBalance());
        }
    }

    private static void makeAccount() {
        System.out.println("-".repeat(6));
        System.out.println("계좌생성");
        System.out.println("-".repeat(6));
        System.out.print("계좌번호 : ");
        String balanceNumber = sc.next();
        for (Account account : accounts) {
            if (account != null) {
                if (balanceNumber.equals(account.getBalanceNumber())) {
                    System.out.println("이미 존재하는 계좌번호 입니다.");
                    return;
                }
            }
        }
        System.out.print("계좌주 : ");
        String name = sc.next();
        System.out.print("초기입금액 : ");
        int balance = sc.nextInt();
        accounts[index++] = new Account(balanceNumber, name, balance);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }
}
