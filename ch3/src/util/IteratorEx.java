package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();

        // 추가
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");

        Set<String> set1 = new HashSet<>();

        // 추가 : add
        set1.add("사과");
        set1.add("귤");
        set1.add("수박");
        set1.add("멜론");
        set1.add("키위");
        set1.add("배");
        set1.add("감");

        // 전체조회
        // 1. foreach(*)
        // 2. 표준화된 방법 => Iterator

        Iterator<String> iter1 = list1.iterator();
        Iterator<String> iter2 = set1.iterator();

        while (iter1.hasNext()) {
            System.out.println("list1 : " + iter1.next());
            System.out.println("set1 : " + iter2.next());
        }
    }
}
