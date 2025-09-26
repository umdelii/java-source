package control;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개를 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던지고, 눈이 합이 5면 주사위 던지기 종료

        while (true) {
            int sico1 = (int) (Math.random() * 6) + 1;
            int sico2 = (int) (Math.random() * 6) + 1;
            System.out.printf("주사위1 : %d, 주사위2 : %d\n", sico1, sico2);

            if (sico1 + sico2 == 5) {
                break;
            }
            if (sico1 + sico2 != 5) {
                System.out.println("주사위를 다시 던지십시오");
                continue;
            }
        }
        System.out.println("5 등장");
    }
}
