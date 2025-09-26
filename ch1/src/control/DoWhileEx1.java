package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // dowhile => 구문을 먼저 실행하고 조건을 검사함 つまり false여도 한 번은 실행한다

        // int i = 10;
        // do {
        // System.out.println(i);
        // } while (i < 10);

        // 1 ~ 100 사이의 정수 input
        // 컴퓨터도 1~100 사이의 임의의 정수를 하나 생성
        // 컴퓨터가 생각한 숫자를 맞추는 로직을 짜라 (up & down gogo)

        Scanner sc = new Scanner(System.in);
        int answer = (int) ((Math.random() * 100) + 1);
        int kotae = 0;
        do {
            System.out.print("1 ~ 100 사이의 정수를 입력하시오 : ");
            kotae = Integer.parseInt(sc.nextLine());
            if (answer < kotae) {
                System.out.println("DOWN");
            } else if (answer > kotae) {
                System.out.println("UP");
            }
        } while (answer != kotae);
        // answer == kotae가 아니면 반복 (==면 끝내)
        System.out.println("정답");
        sc.close();

    }
}
