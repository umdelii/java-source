package object;

public class TriangleEx {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(12.5, 5);

        // 직접 접근
        triangle.baseline = 12.5;
        triangle.height = 5;
        System.out.println(triangle.getArea());

        // 생성자
        // 인스턴스 생성에 기입
        Triangle triangle1 = new Triangle(12.5, 5);
        System.out.println(triangle1.getArea());

        // setter 메소드
        Triangle triangle2 = new Triangle();
        triangle2.setBaseline(10);
        triangle2.setHeight(5);
        System.out.println(triangle2.getArea());
    }
}
