package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        int a = 10, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d %% %d = %d\n", a, b, a % b); // 나머지 값 계산
        System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b);
        System.out.printf("%d / %f = %f\n", a, (double) b, a / (double) b);
        // 서로 다른 타입의 연산결과는 byte가 큰 타입으로 따라감

        char c1 = 'a', c2 = c1, c3 = ' ';

        // c3 = c1 + 1;
        c3 = (char) (c1 + 1);
        int i = c1 + 1;
        c2++;
        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        // for (char j = 'a'; j <= 'z'; j++) {
        // System.out.println(j + " ");

        // }
    }
}
