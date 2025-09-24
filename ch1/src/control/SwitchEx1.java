package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        // 現在の月をinput
        // 3，4，5月の場合 : 현재 계절은 봄입니다.
        // 6,7,8(여름) / ~~

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 월입니까");
        int month = Integer.parseInt(sc.nextLine());

        String tuki = " ";
        // if (month == 3 || month == 4 || month == 5) {
        // tuki = "봄";
        // } else if (month == 6 || month == 7 || month == 8) {
        // tuki = "여름";
        // } else if (month == 9 || month == 10 || month == 11) {
        // tuki = "가을";
        // } else if (month == 12 || month == 1 || month == 2) {
        // tuki = "겨울";
        // } else {
        // tuki = "숫자를 다시 입력하시오";
        // }
        // System.out.println(tuki);

        // month 계속 치기 귀찮네... switch 사용하자

        switch (month) {
            case 3:
            case 4:
            case 5:
                tuki = "봄";
            case 6:
            case 7:
            case 8:
                tuki = "여름";
            case 9:
            case 10:
            case 11:
                tuki = "가을";
            case 12:
            case 1:
            case 2:
                tuki = "겨울";

            default:
                System.out.println(tuki);
                break;
        }
    }
}
