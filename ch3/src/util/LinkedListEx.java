package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        // ArrayList와 LinkedList의 속도를 비교
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        // ms(밀리세컨드)
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + " ms");
        // *보통은 ArrayList가 더 시간을 잡아먹음
        // 그래서? List안 자료를 생성or파괴 등 변경을 한다면 일반적으로는 LinkedList 쪽이 빠르다
    }
}
