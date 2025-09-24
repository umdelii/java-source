package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // input한 숫자가 양수 or 음수인지 출력하기

        // 나의 답
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        int input = sc.nextInt();

        // String bun = input > 0 ? "양수" : (input < 0 ? "음수" : "zero");
        // System.out.println(bun);
        // sc.close(); ----> 첫 번째 답안

        System.out.println(input > 0 ? "양수" : (input < 0 ? "음수" : "zero"));
        sc.close();
        // 수정 답안 (String 변수를 만들 필요없이 바로 수식을 출력식에 넣으면 된다)

        // 선생님의 답
        Scanner sc1 = new Scanner(System.in);
        System.out.println("input2");
        int ex = Integer.parseInt(sc.nextLine());
        System.out.println(ex > 0 ? "양수" : "음수");
        sc1.close();
    }
}
