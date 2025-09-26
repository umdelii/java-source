package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {

        int arr0[] = new int[5];
        for (int i = 0; i < arr0.length; i++) {
            arr0[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr0));

        // 큰 방으로 이사가기

        int tmp[] = new int[arr0.length * 2];
        for (int i = 0; i < arr0.length; i++) {
            tmp[i] = arr0[i];
        }
        System.out.println(Arrays.toString(tmp));

        // 오류 예시
        // for (int i = 0; i < tmp.length; i++) {
        // System.out.println(arr0[i]);
        // }

        // 이사가는 거(copy) 자주 쓰니까 단축어가 별도로 존재
        // System.arraycopy(원본,시작위치(번호),이사갈곳,이사갈곳의시작위치,길이);
        int tmp2[] = new int[10];
        System.arraycopy(arr0, 0, tmp2, 1, arr0.length);
        System.out.println(Arrays.toString(tmp2));

        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(Arrays.toString(result));
    }
}
