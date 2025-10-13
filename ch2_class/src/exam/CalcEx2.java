package exam;

import java.util.Scanner;

public class CalcEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number1 : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Number2 : ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Operator : ");
        String op = scanner.nextLine();

        Calc calc = null;
        switch (op) {
            case "+":
                calc = new Add();
                break;
            case "-":
                calc = new Sub();
                break;
            case "*":
                calc = new Mul();
                break;
            case "/":
                calc = new Div();
                break;

            default:
                break;
        }
        calc.setValue(num1, num2);
        System.out.println(calc.calculate());
        scanner.close();
    }
}
