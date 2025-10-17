package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        // 추가 : add
        set1.add("사과");
        set1.add("귤");
        set1.add("수박");
        set1.add("멜론");
        set1.add("키위");
        set1.add("배");
        set1.add("감");
        set1.add("감"); // --------------> 중복된 요소값은 저장하지 않음
        System.out.println(set1);

        // 삭제 remove
        set1.remove("귤");
        System.out.println(set1);

        // 수정(set) 안됨, 중간삽입 안됨
        // set1.set(); -> 안됨

        // 전체조회
        for (String string : set1) {
            System.out.println(string);
        }

        // 특정 요소값 조회 (get은 못씀)
        // hasNext() : 다음에 가져올 객체가 있으면 true, 없으면 false
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
