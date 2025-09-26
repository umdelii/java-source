package control;

public class ContinueEx1 {
    public static void main(String[] args) {
        // 반복문에서 사용, 반복문이 진행되는 도중 continue 만나면 반복문의 끝으로 이동, 다음 반복으로 넘어감
        // continue < 반복문 다 スルって 다음 반복 실행해줘~ 라는 애

        // 1~10사이의 숫자 출력(단, 3의 배수는 제외)
        for (int i = 1; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
