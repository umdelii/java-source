package object;

// 변수의 종류
// 1. 인스턴스(속성,멤버,필드) 변수 -> 클래스 영역 => 인스턴스 생성 후 사용가능
// 2. 클래스 변수 -> 클래스 영역(static이 들어감) => 클래스가 메모리에 올라가면 사용가능(쓰고 저장하면), 공유의 의미가 있음
// 3. 지역 변수 -> 메소드 영역, 생성자 매개변수, 생성자 내부 괄호 안에 들어간놈들 => 변수가 실행되면 사용가능

public class Card {

    // private String kind; // << 인스턴스 변수

    // static String cv; // << 클래스 변수

    // void print(int i // 지역변수
    // ) {
    // int j = 0; // 지역변수
    // }

    String kind;
    int number;
    static int width = 100;
    static int height = 150;
}
