package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;

        int sum = num + 20;
        // 값이 제대로 나왔는지 출력으로 확인하자
        System.out.println("num+20값=" + sum);
        System.out.println("num 변수값 " + num);
        System.out.printf("num 변수값 %d", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age=" + age + ", maxSpeed=" + maxSpeed);
        System.out.printf("age = %d, maxSpeed = %d\n", age, maxSpeed);
        System.out.printf("age = %10d, maxSpeed = %5d\n", age, maxSpeed);

        num = 53;
        System.out.println("새로운 num 값 = " + num);

        // 상수 선언과 할당
        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
    }
}
