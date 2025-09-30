package object;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    // 시,분,초는 >=0
    // 시의 범위 0~23, 분의 범위 0~59, 초의 범위 0~59
    public void setHour(int hour) {
        // 범위에 들어오는지 확인해야지 if문
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59)
            return;
        this.second = second;
    }
}
