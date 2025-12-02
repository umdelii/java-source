package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx3 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int)(Math.random()*100+1);
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (t) -> System.out.println(t);
        consumer.accept(10);

        Predicate<Integer> predicate = (x)-> x % 2 == 0; 
        System.out.println(predicate.test(14) ? "짝수" : "홀수");

        Function<Integer, Integer> function = (x) -> x * x;
        System.out.println(function.apply(10));

        Function<String, Integer> function2 = (x) -> Integer.parseInt(x);
        System.out.println(function2.apply("15"));

        // 문자열의 길이가 0이라면'빈 문자열입니다' 출력
        Predicate<String> predicate2 = (s)->s.length() == 0;
        System.out.println(predicate2.test("eiei") ? "빈 문자열입니다" : "false");

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x+y);
        biConsumer.accept(1, 2);

        BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> x+y;
        System.out.println(biFunction.apply(12, 11));

        BiFunction<String, String, Boolean> biFunction2 = (t,u) -> t.equals(u);
        System.out.println(biFunction2.apply("test", "test1"));

        // 위와 똑같은 의미, 받는 타입을 이미 지정했기에 사용가능한데 ....
        biFunction2 = String::equals;
        System.out.println(biFunction2.apply("test", "test1"));
    }
}
