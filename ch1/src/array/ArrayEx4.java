package array;

public class ArrayEx4 {
    public static void main(String[] args) {

        // 최대값과 최소값 출력

        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        System.out.printf("최대값 : %d\n", max);

        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.println("최소값 : " + min);

        // 여기부턴 그냥 응용해봄

        int score1[] = new int[100];
        int num = 0;
        int max1 = score[1];
        int min1 = score[1];
        for (int i = 0; i < score1.length; i++) {
            score1[i] = (int) ((Math.random() * 10000) + 1);
            if (score1[i] > max1) {
                max1 = score1[i];
            }
        }
        System.out.println(max1);
    }
}
