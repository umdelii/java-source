package object;

public class MethodTest {

    // 두 개의 인자(매개변수)를 받아서 덧셈 후 덧셈 결과 리턴
    int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 두 개의 인자(==매개변수)를 받아서 뺄셈 후 뺄셈 결과 리턴
    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // 두 개의 flaot타입의 인자를 받아서 나눗셈 후 나눈셈 결과 리턴
    float divide(float num1, float num2) {
        return num1 / num2;
    }

    // 두 개의 문자열 인자를 받아 하나의 문자열로 리턴
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    // 한 개의 int타입의 계열을 받아서 배열을 리턴
    int[] call(int[] arr) {
        return arr;
    }

}
