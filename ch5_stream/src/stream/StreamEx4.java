package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        // map() : 스트림 요소에 저장된 값 중에서 원하는 필드만 추출하거나 특정 형태로 변환
        List<File> list = List.of(new File("file1.txt"),new File("file2.txt"),new File("file3.txt"),new File("file4.txt"));
        //파일명만 추출해서 하나의 리스트로 반환
        List<String> nameList = new ArrayList<>();
        for (File f : list) {
            nameList.add(f.getName());
        }
        System.out.println(nameList);

        // 위의 코드를 더 간략하게 하기 위해 stream.map()
        Stream<File> stream = Stream.of(new File("file1.txt"),new File("file2.txt"),new File("file3.txt"),new File("file4.txt"));
        // Stream<String> names = stream.map((f)->f.getName());
        Stream<String> names = stream.map(File::getName);
        names.forEach(System.out::println);

        // 대문자로 변경 후 출력
        List<String> list2 = List.of("abc","def","apple","melon","text");
        for (String string : list2) {
            System.out.println(string.toUpperCase());
        }
        Stream<String> stream2 = Stream.of("abc","def","apple","melon","text");
        stream2.map(String::toUpperCase).forEach(System.out::println);
        
        System.out.println("------------------------------------------------------");
        // filter() : 조건에 안 맞는 요소 제외
        List<String> list3 = List.of("바둑","바나나","포도","바질","강아지");
        // "바"로 시작하는 요소 출력
        for (String string : list3) {
            if (string.startsWith("바")) {
                System.out.println(string);
            }
        }
        // stream으로 간단하게
        Stream<String> stream3 = Stream.of("바둑","바나나","포도","바질","강아지");
        stream3.filter(s->s.startsWith("바")).forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        // student 클래스 활용해서 연습하자
        List<Student> list4 = new ArrayList<>();
        list4.add(new Student("정이안", 90));
        list4.add(new Student("유하람", 80));
        list4.add(new Student("최지우", 70));
        list4.add(new Student("김주은", 60));
        // "정"으로 시작하는 학생 추출
        for (Student student : list4) {
            if (student.getName().startsWith("정")) {
                System.out.println(student.getName());
            }
        }
        
        // stream으로 간단하게
        Stream<Student> stream4 = Stream.of(new Student("정이안", 90),new Student("유하람", 80),new Student("최지우", 70),new Student("김주은", 60));
        // stream4.filter(s->s.getName().startsWith("정")).forEach(System.out::println);
        stream4.map(Student::getName).filter(s->s.startsWith("정")).forEach(System.out::println);
        
        System.out.println("-------------------------------------------------------");
        // 다른 예제
        IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        // distinct 중복 제거
        Stream<String> stream5 = Stream.of("바둑","바나나","포도","바질","강아지","바둑");
        stream5.distinct().forEach(System.out::println); // 바둑은 한 번만 출력됨
        
        // 파일 확장자만 추출(중복제거)
        File file = new File("Arr.java");
        System.out.println(file.getName().substring(file.getName().lastIndexOf(".")+1));
        
        //stream으로 간단하게
        Stream<File> stream6 
        = Stream.of(new File("file1.txt"),new File("file2.txt"),new File("Ex1"),new File("Ex2.bak"),new File("Test.java"));
        stream6.map(File::getName)
        .peek(f->System.out.printf("이름 %s\n",f))
        .filter(f->f.lastIndexOf(".") > -1)
        .map(f->f.substring(f.lastIndexOf(".")+1))
        .distinct()
        .forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        // peek() : 중간연산확인(잘되고있나~ 확인하는 용도)
        // stream6.map(File::getName).peek(f->System.out.printf("이름 %s\t",f));

        System.out.println("-------------------------------------------------------");
        // skip(), limit()
        Stream<String> stream7 = Stream.of("바둑","바나나","포도","바질","강아지","바둑");
        stream7.skip(2).limit(3).forEach(s->System.out.printf("%s\n",s));

        System.out.println("-------------------------------------------------------");
        // collect()
        Stream<Student> stream8 = Stream.of(new Student("정이안", 90),new Student("유하람", 80),new Student("최지우", 70),new Student("김주은", 60));
        // 점수만 모아서 새로운 리스트로 반환받고 싶음
        List<Integer> list5 = stream8.map(Student::getGrade).collect(Collectors.toList());
        System.out.println(list5);

        System.out.println("-------------------------------------------------------");
        // count, average, sum, min, max 맛보기
        Long count = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).count();
        System.out.println("2의 배수 개수는 "+count+"개");
        
        OptionalDouble avg = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).average();
        System.out.println("2의 배수 평균은 "+avg);

        int sum = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).sum();
        System.out.println("합 : "+sum);

        OptionalInt max = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).max();
        System.out.println("최대값 : "+max);
    }
}
