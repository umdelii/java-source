package control;

public class BreakEx1 {
    public static void main(String[] args) {
        // 반복문에서 조건식 없이 멈추게 하는 방법 (break;)

        // sum이 100 초과 시 반복문 중지
        int sum = 0, i = 0;
        while (true) {
            if (sum > 100)
                break;
            ++i;
            sum += i;
        }
        System.out.printf("%d, %d", i, sum);
    }

}
