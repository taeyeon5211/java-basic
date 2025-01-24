package day12.threeinherent;

public class SubSon extends SubFather{

    public void printSon() {
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로 부터 상속 받습니다.");
        System.out.println("나의 아버지는 " + super.familyName);
        System.out.println("나의 집은 " + super.houseAddress);
    }
}
