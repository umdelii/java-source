package control;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~10 中 짝수만 출력

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
        System.out.println();

        for (int i1 = 2; i1 <= 10; i1 += 2) {
            System.out.print(i1);
        }
        System.out.println();

        // 구구단 출력 (3단)

        for (int i = 1; i <= 9; i++) {
            System.out.printf("3 * %2d = %2d\n", i, (3 * i));
        }
    }
}
