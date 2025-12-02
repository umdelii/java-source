package lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
    
        // 구현 클래스를 만들지 않고 익명 클래스로 인터페이스 실행하는 방법

        // Lambda lambda = new Lambda() {

        //     @Override
        //     public void method() {
        //     }
            
        // };

        // lambda.method();

        Lambda lambda = () -> System.out.println("함수형 인터페이스");
        lambda.method();

        lambda = () -> {
            int i = 10;
            System.out.println("함수형 인터페이스"+i);
        };
        lambda.method();

        Lambda2 lambda2 = (x) -> System.out.println(x);
        lambda2.method(399);

        lambda2 = (x) -> {
            int result = x+x;
            System.out.println(result);
        };
        lambda2.method(400);

        Lambda3 lambda3 = (a,b) -> a > b ? a : b;
        System.out.println("큰 수(1334,1122)"+lambda3.max(1334, 1122));
 }   
}
