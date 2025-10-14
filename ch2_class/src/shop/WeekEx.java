package shop;

import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {
        Week today = null;

        // 시스템 날짜 가져오기
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek().getValue()); // getValue() -> 월~일을 1~7로 치환

        int week = date.getDayOfWeek().getValue();
        switch (week) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNESDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;
            default:
                break;
        }
        System.out.println("오늘 요일은 " + today);
    }
}
