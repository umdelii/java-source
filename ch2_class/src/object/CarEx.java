package object;

public class CarEx {
    public static void main(String[] args) {

        Car car = new Car(); // ----------------------------------------------- 인스턴스(객체)생성 : 생성자가 호출됨

        car.makerMei = "현대";
        car.modelMei = "아반떼";
        car.color = "white";
        car.maxHayasa = 200; // ----------------------------------------------- 멤버변수 초기화(1. 직접 접근)
        System.out.println(car);

        Car car2 = new Car("기아"); // --------------------------------------------- // 멤버변수 초기화(3. 생성자)
        System.out.println(car2);

        Car car3 = new Car("쌍용", "토레스");
        Car car4 = new Car("벤츠", "e클래스", "white");
        Car car5 = new Car("토요타", "PRIUS", "yellow", 300);

        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car3.setColor("black"); // --------------------------------------- 멤버변수 초기화 + 변경(2. setter 메소드)
        System.out.println("색상 지정 후 car3 : " + car3);
    }
}
