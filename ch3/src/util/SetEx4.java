package util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45 + 1);
            set.add(num);
        }
        System.out.println(set);

        // TreeSet의 특징 : 정렬돼서 나옴;;

        Set<Integer> set2 = new TreeSet<>();
        for (int i = 0; set2.size() < 6; i++) {
            int num = (int) (Math.random() * 45 + 1);
            set2.add(num);
        }
        System.out.println(set2);
    }
}
