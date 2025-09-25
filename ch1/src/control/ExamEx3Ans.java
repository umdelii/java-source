package control;

import java.util.Scanner;

public class ExamEx3Ans {
    public static void main(String[] args) {
        // 하루 일당 산출
        // ~8시간 : 시급 10,030원, 초과근무 수당 1.5배
        // 근무시간을 입력받아 일당 산출
        // 일당은 정수형

        // 선생님의 답안

        Scanner sc = new Scanner(System.in);
        System.out.println("근무시간을 입력하시오");
        int hour = Integer.parseInt(sc.nextLine());
        int jk = 10030, pay = 0;
        if (hour > 8) {
            pay = (jk * 8) + (int) ((hour - 8) * (jk * 1.5));
        } else {
            pay = jk * hour;
        }
        System.out.println(pay);
        sc.close();
    }
}
