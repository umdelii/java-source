package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        // > < >= <= ==(같다) !=(같지않다)
        // true or false 결과값

        int a = 10;
        float f = 10.0f;
        System.out.println(a == f);
        System.out.println(a != f);
        // 연산 수행 전 피연산자의 타입을 맞춘 후 연산
        System.out.printf("'A' == 65 = %b\n", 'A' == 65);
    }
}
