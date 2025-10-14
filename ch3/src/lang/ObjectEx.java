package lang;

import java.util.Scanner;
//java.lang 패키지 : 자바에서 기본적으로 제공하는 패키지
//import java.lang.*; // 자동으로 import됨

public class ObjectEx {
    public static void main(String[] args) {
        /*
         * 모든 클래스의 부모 who? Object
         * 1. equals() : 참조 비교
         * 2. == : 주소 비교
         */

        Scanner sc = new Scanner(System.in);

        Object object1 = new Object();
        Object object2 = new Object();

        if (object1.equals(object2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        System.out.println(object1 == object2 ? "두 객체는 같다" : "두 객체는 다르다");

        String str1 = "Hello", str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1.equals(str2) ? "같다" : "다르다"); // 같
        System.out.println(str1.equals(str3) ? "같다" : "다르다"); // 같
        System.out.println(str1 == str2 ? "같다" : "다르다"); // 같
        System.out.println(str1 == str3 ? "같다" : "다르다"); // 다 ????????????????????????why?
        /*
         * new로 생성하면 heap에 저장 but, 직접 생성하면 상수풀에 저장
         * 부모(Object)는 주소비교하라는데 equals는 오버라이딩 되어있어 참조를 비교함 지멋대로
         */

        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2)); // false, new 두개 생성해서 주소 다름
        // true로 만들고 싶은데...값이 같잖아...
        // equals메소드에서 강제 형변환 후 비교하도록 오버라이딩하니까 true

        // toString()
        System.out.println("object1 " + object1); // java.lang.Object@24d46ca6 -> 패키지명.클래스명@16진수해시코드
        System.out.println("value1 " + v1); // lang.Value@3a71f4dd
        System.out.println("str3 " + str3); // Hello -> 이놈자식만 내용값 출력하네
    }
}
