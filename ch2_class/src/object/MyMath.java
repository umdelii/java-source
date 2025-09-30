package object;

public class MyMath {

    long add(long a, long b) {
        return a + b;
    }

    long add(int a, long b) { // -------타입을 바꾸거나 개수를 바꾸면 메소드 오버로딩x
        return a + b;
    }

    long subtrack(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    long divide(long a, long b) {
        return a / b;
    }
}
