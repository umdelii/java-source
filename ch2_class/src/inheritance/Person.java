package inheritance;

public /* final */ class Person { // ------------------ final class => 상속불가
    // final : 마지막의, 변경될 수 없는

    static final int MAX = 15; // ------------------ 상수 => 대문자 / 변수 값 초기화 불가
    String name;

    public Person(String name) {
        this.name = name;
    }

    final void test() { // --------------------- final 메소드 => 오버라이딩 불가
    }

}
