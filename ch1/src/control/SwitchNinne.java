package control;

import java.util.Scanner;

public class SwitchNinne {
    public static void main(String[] args) {
        // if 범위로 가자

        Scanner sc = new Scanner(System.in);
        System.out.println("월 입력");
        int suu = Integer.parseInt(sc.nextLine());

        String month = " ";

        if (suu >= 3 && suu <= 5) {
            month = "봄";
        } else if (suu >= 6 && suu <= 8) {
            month = "여름";
        } else if (suu >= 9 && suu <= 11) {
            month = "가을";
        } else if (suu == 12 || suu == 1 || suu == 2) {
            month = "겨울";
        } else {
            month = "숫자를 다시 입력하시오";
        }
        System.out.println(month);
    }
}
