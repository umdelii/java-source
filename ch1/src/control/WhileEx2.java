package control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력 받아 각 자리의 합 구하기 ex) 345 : 3 + 4 + 5

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num = Integer.parseInt(sc.nextLine());

        int sum = 0;
        // num이 0이 될 때까지 반복
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
