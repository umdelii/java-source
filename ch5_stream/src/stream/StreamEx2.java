package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("정이안", 90));
        list.add(new Student("유하람", 80));
        list.add(new Student("최지우", 70));
        list.add(new Student("김주은", 60));

        list.stream().forEach((s)->System.out.println(s.getName()+" , "+s.getGrade()));
        list.stream().forEach(System.out::println);
    }
}
