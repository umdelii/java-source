package util;

import java.util.LinkedList;
import java.util.List;

public class LinkedEx4 {
    public static void main(String[] args) {
        // LinkedList : List를 링크함
        List<String> list1 = new LinkedList<>();
        // 추가
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");
        System.out.println(list1);

        // 삭제
        list1.remove(2);
        System.out.println(list1);

        // 수정
        list1.set(0, "포도");
        System.out.println(list1);

        // 조회
        System.out.println(list1.get(3));
        for (String string : list1) {
            System.out.println(string);
        }
    }
}
