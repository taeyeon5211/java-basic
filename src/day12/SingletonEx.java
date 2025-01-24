package day12;

class Singleton {
    private static Singleton st = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return st;
    }
}

public class SingletonEx {

    public static void main(String[] args) {
        //Singleton obj = new Singleton();

        //정적 메서드 getInstance()로 Singleton 객체 얻음
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();

        //동일한 객체를 참조하는 지 확인
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st1 == st2);
    }
}
