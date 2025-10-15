package lang;

public class ExceptionEx1 {
    public static void main(String[] args) {
        // Throwable
        // - Error
        // - Exception(예외)
        // -- 종류
        // --- 1) 컴파일 예외 : 빨간줄 가는 것들
        // --- 2) 런타임 예외 : 실행해야 아는 것들
        // -- 처리방법
        // --- 1) 예외 처리
        // --- 2) 예외 던지기
        System.out.println(4 / 0); // java.lang.ArithmeticException: / by zero
        // Class.forName(null);
        try {
            Class.forName(null); // 예외가 발생할 수 있는 코드 작성
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // 개발자 확인용(예외발생이 어디서 났는지 추적해줌)
        }
    }
}
