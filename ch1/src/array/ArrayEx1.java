package array;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {

        // 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        // ex)10명의 시험점수 저장 - 10명은 수기로 제어 가능하지만 혹시 100만명이라면?, 그래서 배열로 담아낸다

        // int score = 0, score1 = 0, score2 = 0;
        // int sum = score + score1 + score2;
        // double avg = (double) sum / 10;

        // 타입 배열명[] or (타입[] 배열명) = new 타입[담을 개수]; - 배열 선언과 생성
        // 배열은 한 번 생성하면 길이 변경 불가

        int arr[] = new int[10];
        System.out.println(arr[3]);

        double arr1[] = new double[10];
        System.out.println(arr1[4]);

        char arr2[] = new char[10];
        System.out.println(arr2[4] + "char");

        boolean arr3[] = new boolean[10];
        System.out.println(arr3[5]);

        int arr5[]; // 배열 선언
        arr5 = new int[5]; // 배열 생성

        // 배열 초기화
        // arr[0] = 88;
        // arr[1] = 40;

        // 배열의 선언,생성,초기화
        int score[] = { 88, 90, 87, 54, 25, 94, 15, 79, 13, 47, 54 };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}
