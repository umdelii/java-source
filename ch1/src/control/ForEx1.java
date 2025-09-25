package control;

public class ForEx1 {
    public static void main(String[] args) {
        // 반복문繰り返し文 : 어떤 작업이 반복적으로 수행되도록 할 때
        // for, while, do~while
        // ex(fori)) for (초기화; 조건식; 증감식) {조건식이 참인 동안 반복수행할 문장}

        // for (int i = 0; i < 10; i++) {
        // System.out.println("こんにちは");
        // }

        // for (int i = 0; i < 10; i += 2) {
        // System.out.println(i + " こんにちは");
        // }

        // for (int i = 10; i > 0; i--) {
        // System.out.println(i + " こんにちは");
        // }

        // 1~10 출력하기
        // for (int i = 1; i <= 10; i++) {
        // System.out.print(i + " ");
        // }

        // 1~10 합계 구하기
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 로직
        // 1) int i = 1; 실행
        // 2) i <= 10; 조건식 검사 => true
        // 3) for 구문 안({}중괄호)으로 진입 후 구문 실행
        // 4) i++; 실행
        // 5) 조건식 검사 => 2)~4) 반복 실행

    }
}
