package object;

public class Calc {

    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        int result = plus(x, y); // ---------- 메소드 안에서 다른 메소드 호출 가능
        return result / 2;
    }

    void execute() {
        double result = avg(52, 23);
        println("실행결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}
