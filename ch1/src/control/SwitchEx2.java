package control;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        // じゃんけん

        System.out.println("가위(1),바위(2),보(3) 중 하나를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int janken = Integer.parseInt(sc.nextLine());
        System.out
                .println(janken == 1 ? "俺 : 가위" : (janken == 2 ? "俺 : 바위" : (janken == 3 ? "俺 : 보" : "숫자를 다시 입력하십시오")));

        // Math.random -> 0~1 사이의 난수(임의의 수) 추출
        int com = (int) (Math.random() * 3) + 1;
        String com1 = (String) (com == 1 ? "君 : 가위" : (com == 2 ? "君 : 바위" : "君 : 보"));
        // Ln 12 & 16은 내가 임의로 입력한(or 랜덤) 숫자를 가독성 좋게 텍스트로 다시 추출한거임(배운거 x)
        System.out.println(com1);
        // System.out.println(com == 1 ? "가위" : (com == 2 ? "바위" : "보")); << 이거는 String
        // com1 변수를 만들지 않아도 되는, 짧게 끝내는 방법 (셀프피드백)

        switch (janken - com) {
            case 2:
            case -1:
                System.out.println("패배");
                break;
            case -2:
            case 1:
                System.out.println("승리");
                break;
            case 0:
                System.out.println("무승부");
                break;
            default:
                System.out.println("입력 오류");
        }
        sc.close();
    }
}
