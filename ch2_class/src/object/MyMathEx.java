package object;

public class MyMathEx {
    public static void main(String[] args) {

        MyMath myMath = new MyMath();

        // 메소드 호출
        // 1) 변수에 받기
        // 2) 출력

        long result = myMath.add(12, 96);
        System.out.println("덧셈 결과 : " + result);
        result = myMath.subtrack(43, 12);
        System.out.println("뺄셈 결과 : " + result);
        result = myMath.multiply(55, 513);
        System.out.println("곱셈 결과 : " + result);
        result = myMath.divide(13556, 21);
        System.out.println("나눗셈 결과 : " + result);
    }
}
