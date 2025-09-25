package control;

import java.util.Scanner;

public class ExamEx4Ans {
    public static void main(String[] args) {
        // 사칙연산 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받아 결과 산출

        // 선생님의 답안

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 입력");
        int s1 = Integer.parseInt(sc.nextLine());
        System.out.println("연산 입력");
        String ren = sc.nextLine();
        System.out.println("두 번째 숫자 입력");
        int s2 = Integer.parseInt(sc.nextLine());
        int result = 0;

        switch (ren) {
            case "+":
                result = s1 + s2;
                break;
            case "-":
                result = s1 - s2;
                break;
            case "*":
                result = s1 * s2;
                break;
            case "/":
                result = s1 / s2;
                break;
        }
        System.out.println(result);
        sc.close();
    }
}
