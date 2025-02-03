package day13.inheritance05;
//산술연산계산기
public class Calculator {

    private int row;
    private int column;

    public Calculator() {

    }

    public Calculator(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void areaCompute() {
        System.out.println("사격형 면적을 계산하는 기능을 수행합니다.");
        int result = this.row * this.column;
        System.out.println("계산이 끝났습니다. 면적은 " + result);
    }
}
