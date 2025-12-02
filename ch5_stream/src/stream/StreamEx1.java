package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("strawberry");

        for (String string : list) {
            System.out.println(string);
        }

        String[] strArr = {"apple","pear","banana","kiwi"};
        // 배열 -> 리스트로 변경
        // List<String> list2 = Arrays.asList(strArr);

        System.out.println("-----------------------------------------------------");
        // 리스트를 stream으로 변경
        Stream<String> stream1 = list.stream();
        // 배열을 stream으로
        Stream<String> stream2 = Arrays.stream(strArr);

        // Consumer<? super String> action
        stream1.sorted().forEach((x)->System.out.println(x));
        stream2.sorted().forEach((x)->System.out.println(x));

        /// 원래 정렬할때 => 얘네 둘은 원본을 정렬시킴
        list.sort(Comparator.naturalOrder());
        System.out.println("접근금지"+list);

        Arrays.sort(strArr);
        System.out.println("접근금지2"+Arrays.toString(strArr));
    }
}
