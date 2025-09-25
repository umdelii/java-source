package control;

import java.util.Scanner;

public class ExamEx2Ans {
    public static void main(String[] args) {
        // 세 개의 정수를 입력받아 가장 작은 값 구하기

        // 선생님의 답안

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하시오");
        int s1 = Integer.parseInt(sc.nextLine());
        System.out.println("두 번째 숫자를 입력하시오");
        int s2 = Integer.parseInt(sc.nextLine());
        System.out.println("세 번째 숫자를 입력하시오");
        int s3 = Integer.parseInt(sc.nextLine());

        int S = s1;

        if (S > s2) {
            S = s2;
        }
        if (S > s3) {
            S = s3;
        }
        System.out.println(S);

        // 가장 큰 수 구하기

        if (S < s2) {
            S = s2;
        }
        if (S < s3) {
            S = s3;
        }
        System.out.println(S);
        sc.close();
    }
}
