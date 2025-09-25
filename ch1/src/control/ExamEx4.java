package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받아 결과 산출

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 입력");
        double s1 = Double.parseDouble(sc.nextLine());
        System.out.println("연산 입력");
        String ren = sc.nextLine();
        System.out.println("두 번째 숫자 입력");
        double s2 = Double.parseDouble(sc.nextLine());

        // }if (ren == "+") { << 오류본
        if (ren.equals("+")) {
            System.out.println(s1 + s2);
        } else if (ren.equals("-")) {
            System.out.println(s1 - s2);
        } else if (ren.equals("*")) {
            System.out.println(s1 * s2);
        } else if (ren.equals("/")) {
            System.out.println(s1 / s2);
        } else {
            System.out.println("입력 오류");
        }
        sc.close();
    }
}
