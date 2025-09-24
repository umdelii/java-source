package operator;

import java.util.Scanner;

public class OperatorEx8 {
    public static void main(String[] args) {
        // input한 숫자가 양수 or 음수인지 출력하기

        // 선생님의 답
        Scanner sc = new Scanner(System.in);
        System.out.println("input2");
        int ex = Integer.parseInt(sc.nextLine());
        System.out.println(ex > 0 ? "양수" : "음수");
        sc.close();

        // 입력받은 숫자가 짝수 or 홀수인지 출력
        System.out.println(ex % 2 == 0 ? "짝수" : "홀수");
    }
}
