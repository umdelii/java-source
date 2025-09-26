package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {

        // 45개 정수값 저장할 배열 생성
        // 각 요소에 1~45 저장
        // 배열의 0~5번째까지 6개만 교환하기

        int arr[] = new int[45];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i + 1;
        }
        System.out.println(Arrays.toString(arr));

        int n = 0;
        for (int i = 0; i < 6; i++) {
            n = (int) (Math.random() * 45);
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
