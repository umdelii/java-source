package control;

import java.util.Scanner;

public class BreakEx2 {
    public static void main(String[] args) {
        // break;랑 continue; 섞는 연습
        // 메뉴를 보여준 후 선택
        // 메뉴 번호 1~3번 사이, 다른 번호 입력 시 다시 메뉴활성화, 0번일 시 프로그램 종료

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1번 square");
            System.out.println("2번 square.root");
            System.out.println("3번 log");
            System.out.print("원하는 메뉴(1~3)을 선택하시오. (종료 : 0번 입력) : ");

            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("번호를 다시 입력하십시오");
                continue;
            }
            if (1 <= menu && menu <= 3) {

                System.out.printf("선택한 메뉴는 %d 입니다.", menu);
                break;
            }
        }
        sc.close();
    }
}
