package day12;

import java.util.Calendar;

public class WeekMain {

    public static void main(String[] args) {
        Week today = null;

        //자바 Calendar 클래스 : 컴퓨터에서 제공하는 요일 날짜, 요일, 시간을 얻어올때 사용한.
        Calendar now = Calendar.getInstance(); //Calendar 객체 얻기
        int year = now.get(Calendar.YEAR);//연
        int week = now.get(Calendar.DAY_OF_WEEK);
        int month = now.get(Calendar.MONTH) + 1;
        int date = now.get(Calendar.DATE);
        int hour = now.get(Calendar.HOUR);
        int minutes = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        //요일은 1~7 사이의 숫자 입니다. 코드 가독성을 위해 열거 상수로 변환해서 Week 변수에 대입해서 오늘이 무슨요일인지 알고싶다.

        switch (week) {
            case 1 : today = Week.SUNDAY; break;
            case 2 : today = Week.MONDAY; break;
            case 3 : today = Week.TUESDAY; break;
            case 4 : today = Week.WEDNESDAY; break;
            case 5 : today = Week.THURSDAY; break;
            case 6 : today = Week.FRIDAY; break;
            case 7 : today = Week.SATURDAY; break;
        }
        System.out.println("(" + today + ")");
        System.out.printf("%d-%d-%d %d:%d:%d%n", year, month, date, hour, minutes, second);

        if (today == Week.THURSDAY) {
            System.out.println("조별 스터디 있는 날");
        } else {
            System.out.println("매일매일 자바 혼공");
        }
    }
}
