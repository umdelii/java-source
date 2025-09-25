package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // println() : 출력 후 줄바꿈 처리
        // print(); : 출력만(줄바꿈x)
        // printf(); : format 지정(줄바꿈x)
        System.out.print("두 자리 정수 입력 : ");
        String num = sc.nextLine(); // 35 = "35"(문자)로 인식
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1));

        int input = Integer.parseInt(num); // ""(문자)->숫자로 변환
        System.out.println("input = " + input);
        System.out.println("input = " + (input + 1));
        sc.close();

    }
}
