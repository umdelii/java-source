package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // ~8시간 : 시급 10,030원, 초과근무 수당 1.5배
        // 근무시간을 입력받아 일당 산출
        // 일당은 정수형

        Scanner sc = new Scanner(System.in);
        System.out.println("근무시간을 입력하시오");
        double hour = Double.parseDouble(sc.nextLine());

        if (hour - 8 <= 0) {
            System.out.println(hour * 10030);
        } else if (hour - 8 > 0) {
            System.out.println((hour * 10030) + ((hour - 8) * 10030 * 1.5));
        } else {
            System.out.println("입력 오류");
        }
        sc.close();
    }
}
