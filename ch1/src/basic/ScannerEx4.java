package basic;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        // 키보드에서 입력받기 = System.in
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자입력 : ");

        // 입력 받기 : sc.nextLine() -> "", 문자를 숫자로 치환하고자 할 때

        // String num1 = sc.nextLine();
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parseFloat(sc.nextLine());
        // double input1 = Double.parseDouble(sc.nextLine());

        System.out.print("연산자 입력 : ");
        String op = sc.nextLine();

        System.out.print("두 번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        System.out.println(op);
        System.out.println(input1 + input2);
        System.out.println(input1 + op + input2 + " = " + (input1 + input2));
        System.out.println(input1 + op + input2 + " = " + input1 + input2);
        sc.close();
    }
}
