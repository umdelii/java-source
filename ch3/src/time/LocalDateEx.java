package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {
        // 날짜, 시간 데이터
        // java.util.Date
        // java.util.Calender 이제는 사용x

        // java.time.LocalDate : 날짜 정보
        // java.time.LocalDateTime : 날짜 + 시간정보
        // java.time.LocalTime : 시간 정보

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(now);

        // 년, 월, 일 가져오기 getXXX()
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        // 시, 분, 초
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        // 윤년, 평년
        System.out.println("윤년? " + date.isLeapYear());

        // 특정 날짜 지정
        LocalDate.of(2024, 1, 1);

        // 날짜 , 시간 조작 : 더하기 빼기
        LocalDateTime target = now.plusYears(1)
                .minusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .plusMinutes(3)
                .plusSeconds(5);
        System.out.println(target);

        // 날짜와 시간 비교
        // isBefore() : 이전 (boolean)
        // isAfter() : 이후 (boolean)
        LocalDateTime startDate = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 3, 11, 18, 0, 0);
        if (startDate.isBefore(endDate)) {
            System.out.println("과정 진행 중");
        } else if (startDate.isEqual(endDate)) {
            System.out.println("오늘 마감입니다");
        } else if (startDate.isAfter(endDate)) {
            System.out.println("마감일이 지났습니다");
        }
    }
}
