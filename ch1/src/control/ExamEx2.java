package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 세 개의 정수를 입력받아 가장 작은 값 구하기

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하시오");
        int s1 = Integer.parseInt(sc.nextLine());
        System.out.println("두 번째 숫자를 입력하시오");
        int s2 = Integer.parseInt(sc.nextLine());
        System.out.println("세 번째 숫자를 입력하시오");
        int s3 = Integer.parseInt(sc.nextLine());

        if (s1 <= s2 && s1 <= s3) {
            System.out.println(s1);
        } else if (s2 <= s1 && s2 <= s3) {
            System.out.println(s2);
        } else if (s3 <= s1 && s3 <= s2) {
            System.out.println(s3);
        } else
            System.out.println("입력 오류");
        sc.close();
    }
}
