package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        String[] strArr = {"apple","banana","strawberry","grape","melon"};
        // java.util.Arrays : 배열과 관련된 기능 제공
        // Arrays.toString(strArr); // 주소말고 값으로 출력
        // Arrays.asList(null); // 배열 => list
        // Arrays.sort(strArr); // 정렬

        Stream<String> stream = Arrays.stream(strArr); // 배열 => stream
        // System.out.println(stream);
        stream.forEach(s -> System.out.println(s));
        // stream.forEach(System.out::println); // java.lang.IllegalStateException: stream has already been operated upon or closed -> 일회성

        // List => stream
        List<String> list = Arrays.asList("apple","banana","strawberry","grape","melon"); 
        // list.add("watermelon"); << asList로 만들면 add안됨
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        // List.of(E... elements); : 인수의 개수는 자유롭게
        List<String> list2 = List.of("apple","banana","strawberry","grape","melon");
        // list2.add("watermelon"); 오류

        // stream
        Stream<String> stream3 = Stream.of("apple","banana","strawberry","grape","melon");

        // 숫자 범위로 stream 생성
        IntStream.range(1, 10).forEach(System.out::println); // 뒷 인수는 포함 x , exclusive
        IntStream.rangeClosed(1, 10).forEach(System.out::println); // 뒷 인수 포함
        LongStream.range(1, 10);
    }
}
