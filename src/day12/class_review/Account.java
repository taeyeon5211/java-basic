package day12.class_review;

public class Account {

    private String balanceNumber;
    private String name;
    private int balance;

    public Account(String balanceNumber, String name, int balance) {
        this.balanceNumber = balanceNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void plusBalance(int balance) {
        this.balance += balance;
    }

    public void minusBalance(int balance) {
        this.balance -= balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalanceNumber() {
        return balanceNumber;
    }

    public void setBalanceNumber(String balanceNumber) {
        this.balanceNumber = balanceNumber;
    }
}
