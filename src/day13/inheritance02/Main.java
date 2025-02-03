package day13.inheritance02;

public class Main {

    public static void main(String[] args) {
        //Phone 타입으로 유선전화를 생성하여
        //1.전화를 건다
        //2.전화를 받는다
        //3.메세지를 전송한다.
        //4.메세지를 수신한다.
        //5.전화를 끊는다.

        Phone p = new Phone();
        p.sendVoice("aaa");
        p.bell();
        p.hangOn();
        p.receiveVoice("bbb");
        p.hangUp();

        SmartPhone sp = new SmartPhone();
        sp.setWifi(true);
        sp.sendVoice("ccc");
        sp.receiveVoice("ddd");
        sp.bell();
        sp.hangOn();
        sp.hangUp();

        SmartPhone sp1 = new SmartPhone("apple", "apple pro 15", "white");
        sp1.setWifi(true);
        sp1.sendVoice("eee");
        sp1.receiveVoice("fff");
        sp1.bell();
        sp1.hangOn();
        sp1.hangUp();
    }
}
