package inheritance;

// 멤버변수에 final을 붙이면 상수 => 반드시 초기화 필요
public interface Movable {
    /*
     * 상수 선언만 가능
     * final 없어도 상수로 인식
     */
    int pos = 0;

    /*
     * abstrack이 없어도 추상 메소드로 인식
     * 일반 메소드 불가(원래는)
     * but, static, default를 붙이면 일반 메소드 생성가능
     */
    void move(int x, int y);

    static void print() {
    }

    default void print2() {
    }
}
