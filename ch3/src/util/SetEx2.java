package util;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 로또 번호 추첨(무작위 숫자 6개)
        // 1~45 정수에서 6개 숫자를 무작위 추출
        // List에 담을건지 Set에 담을건지 생각해봐

        Set<Integer> set = new HashSet<>();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45 + 1);
            set.add(num);
        }
        System.out.println(set);

        // 오름차순으로 정렬해서 보여주고 싶어
        // Collections.sort()에 set을 넣으면 컴파일오류뜸 : List만 넣으래
        // Set -> List로 변환해야해 but how?
        List<Integer> list = new LinkedList<>(set);
        Collections.sort(list);
        System.out.println(list);

        // 그렇다면, List -> Set으로 변환하는 방법은?
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);

        // forEach
        list.forEach(null);
    }
}
