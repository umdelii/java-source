package util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 3, 2, 1 };

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result ? "같음" : "다름");

        int[][] original = { { 1, 2 }, { 3, 4 } };
        int[][] cloned = Arrays.copyOf(original, original.length);

        // original이랑 cloned의 주소는 다르다
        System.out.println("주소 " + original.equals(cloned));

        // 배열요소는?
        System.out.println(Arrays.equals(original, cloned) ? "같음" : "다름"); // 같다고 나오네

        // 얕은 복수 : copyOf()
        // 깊은 복사 : 새 공간 생성 + 값 옮기기
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        cloned2[0] = Arrays.copyOf(original[0], original[0].length);
        cloned2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println("주소 " + original.equals(cloned2));
        System.out.println(Arrays.equals(original, cloned2) ? "같음" : "다름"); // 다름
        System.out.println(Arrays.deepEquals(original, cloned2) ? "같음" : "다름"); // 같음, deepequals는 내부 요소까지 비교해줌

        // 일차원 비교는 equals, 다차원 비교는 deepequals!
    }
}
