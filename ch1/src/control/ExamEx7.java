package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {

        //

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------------------------");
            System.out.println("1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 : ");
            int num = Integer.parseInt(sc.nextLine());
            int num1 = 0; // 잔액
            if (num == 1) {
                System.out.println("입금할 금액을 입력하십시오.");
                num1 += Integer.parseInt(sc.nextLine());
                break;
            }
            if (num == 2) {
                System.out.println("출금할 금액을 입력하십시오.");
                num1 -= Integer.parseInt(sc.nextLine());
                break;
            }
            if (num == 3) {
                System.out.printf("귀하의 잔고는 %d원 입니다.\n", num1);
                break;
            }
            if (num == 4) {
                System.out.println("종료");
                break;
            }
            sc.close();
        }
    }
}
