package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 점수를 입력받아 A(=>90), B(=>80), C(=>70), D(=>60) 등급 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력");
        int ten = Integer.parseInt(sc.nextLine());

        // if (ten >= 90) {
        // System.out.println("등급 : A");

        // } else if (ten >= 80) {
        // System.out.println("등급 : B");
        // } else if (ten >= 70) {
        // System.out.println("등급 : C");
        // } else if (ten >= 60) {
        // System.out.println("등급 : D");
        // } else {
        // System.out.println("등급 : 낙제");
        // }

        // 위의 식은 반복 입력이 많아 시간이 걸림 이를 줄이기 위해 아래 식 적용
        // *선언 위치에 따라 변수의 유효범위가 달라짐('()'안에 넣으면 소괄호 안 서식만, '{}'안에 넣어야 중괄호 안 서식에 전부 적용)

        char grade = ' ';
        if (ten >= 90) {
            grade = 'A';
        } else if (ten >= 80) {
            grade = 'B';
        } else if (ten >= 70) {
            grade = 'C';
        } else if (ten >= 60) {
            grade = 'D';
        }
        System.out.println("등급 : " + grade);

        switch (grade / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                break;
        }
        sc.close();
    }
}