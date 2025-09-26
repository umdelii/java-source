package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        // 'a','b','c','d'...담기
        char arr1[] = { 'a', 'b', 'c', 'd' };

        // 1~10 임의의 수 생성 후 초기화
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }

        // 배열의 길이를 모를 경우(너무 많아거나 세기 귀찮아. 스캔떠서 길이 알려줘)
        int arr2[];

        Scanner sc = new Scanner(System.in);
        System.out.println("배열 길이 입력");
        int length = sc.nextInt();
        arr2 = new int[length];

        // 배열 출력하기
        // System.out.println(arr2); << 이거는 안나온다.. arr2라는 집단명의 주소만 나옴
        // Arrays.toString() << 배열이 실제로 갖고 있는 값 출력
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

        // 향상된 for문 - foreach
        for (char cha : arr1) {
            System.out.print(cha + ",");
        }
    }
}
