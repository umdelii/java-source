package control;

import java.util.Scanner;

public class ExamEx7Ans {
    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int balance = 0; // 잔액
        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 : ");
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    System.out.println("입금액을 입력하십시오.");
                    balance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("출금액을 입력하십시오.");
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.println("귀하의 잔고는 " + balance + "입니다.");
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    break;
            }
            break;
        }
        sc.close();
    }
}
