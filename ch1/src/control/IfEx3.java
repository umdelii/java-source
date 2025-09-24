package control;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 중첩 if (if 블럭 내에 다른 if문 포함(횟수 제한 x))
        // if (condition) {
        // if (condition) {

        // } else {

        // }
        // }

        // 점수 input -> input 된 점수가 90점 보다 크거나 같으면,
        // 'A'학점 -> 그 중 98점 이상은 'A+',
        // 90~94점은 'A-', 95~97점은 'A0'로 표기

        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력");
        int ten = Integer.parseInt(sc.nextLine());

        char grade = ' ', opt = '0';
        if (ten >= 90) {
            grade = 'A';
            if (ten >= 98) {
                opt = '+';
            } else if (ten < 95) {
                opt = '-';
            }
        } else if (ten >= 80) {
            grade = 'B';
            if (ten >= 88) {
                opt = '+';
            } else if (ten < 85) {
                opt = '-';
            }
        } else if (ten >= 70) {
            grade = 'C';
            opt = ' ';
        } else {
            grade = 'D';
            opt = ' ';
        }
        System.out.printf("학점 : %c%c", grade, opt);
    }
}
