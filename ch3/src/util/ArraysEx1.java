package util;

import java.util.Arrays;

public class ArraysEx1 {
    // java.util.Arrays : 배열을 조작하기 쉽게 다양한 메소드 제공
    // public static <T> T[] copyOf(T[] original, int newLength)
    // static boolean[] copyOf(boolean{} original, int newLength)
    // T, K, V, E : 객체(참조타입)
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        int[] newArr = new int[7];
        // 배열복사
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.arraycopy(arr, 0, newArr, 0, 0);

        // Arrays.copyOf로 귀찮게 객체 생성 없이 바로 복사 가능
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyArr));

        // Arrays.copyOfRange(복사할 배열,from:시작인덱스,to:끝인덱스)
        int[] copyArr2 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(copyArr2));

    }
}
