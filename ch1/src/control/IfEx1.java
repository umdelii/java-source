package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        // 조건에 따라 수행 여부 결정 : if / switch
        // if(조건식){수행할 문장}

        // ex) x가 0과 동일하면 "x == 0" 출력하기
        int x = 0;
        if (x == 0) {
            System.out.println("x == 0");

        }

        // ex) x가 0과 동일하지 않다면 "x != 0" 출력하기
        if (x != 0) {
            System.out.println("x != 0 ");

        }

        // 사용자로부터 점수를 입력받아 60 이상이면 "합격입니다" 메세지 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하시오");
        int ten = Integer.parseInt(sc.nextLine());
        if (ten >= 60) {
            System.out.println("합격입니다");

        } else {
            System.out.println("불합격입니다");
        }
    }
}
