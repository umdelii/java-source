package control;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        // 사용자한테 계속 숫자를 받아들여서 합계를 출력

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        while (flag) {
            System.out.print("덧셈 하고 싶은 숫자를 입력하시오(0 입력 시 종료) : ");
            int num = Integer.parseInt(sc.nextLine());
            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
