package control;

public class ForEx3 {
    public static void main(String[] args) {
        // **********
        // **********
        // **********
        // **********
        // ********** 출력 하는 법

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 위 식의 실행 단계
        // 1) 바깥쪽 for 실행
        // 2) 바깥쪽 for i < 5; 검사
        // 3) 안쪽 for int j = 0; 실행
        // 4) 안쪽 for j < 10; 검사
        // 5) 프린트 실행
        // 6) 안쪽 for j++ 실행
        // 7) 4)~6) 반복작업
        // 8) j = 10 되면 false => 안쪽 구문 종료
        // 9) println 실행
        // 10) 바깥쪽 구문 i < 5;까지 반복 실행
        // i = 0 일때 j = 0~10 반복 => i = 1되고 다시 j = 0 ~ 9 반복 **

        // "*"
        // "**"
        // "***"
        // "****"
        // "*****" < 이거 어떻게 할래?

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
