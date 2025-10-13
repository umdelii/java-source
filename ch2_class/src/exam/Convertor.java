package exam;

import java.util.Scanner;

public abstract class Convertor {
    abstract protected double convert(double src);

    abstract protected String getSrcString();

    abstract protected String getDeString();

    protected double ratio;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDeString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과 : " + res + getDeString() + "입니다");
        scanner.close();
    }
}
