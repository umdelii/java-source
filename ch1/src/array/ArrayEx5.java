package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {

        // 10개의 정수를 담는 배열 선언
        // 0~9의 정수로 초기화

        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        System.out.println(Arrays.toString(num));

        // 변수에 들어있는 값 교환하기
        int x = 10, y = 5;
        int temp = x;
        x = y;
        y = temp;

        // 나열된 숫자 섞기
        int ix = 0;
        for (int i = 0; i < 1; i++) {
            ix = (int) (Math.random() * 10);
            int temp1 = num[0];
            num[0] = num[ix];
            num[ix] = temp1;
        }
        System.out.println(Arrays.toString(num));

    }
}
