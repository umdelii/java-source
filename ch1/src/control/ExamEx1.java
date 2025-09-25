package control;

import java.util.Scanner;

public class ExamEx1 {
    public static void main(String[] args) {
        // 년도를 입력받아 윤년, 평년 출력하기
        // 윤년 : 년도가 4로 나눠떨어지고, 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0일 경우

        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요");
        int year = Integer.parseInt(sc.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
        sc.close();
    }
}
