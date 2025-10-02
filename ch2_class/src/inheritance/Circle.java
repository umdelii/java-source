package inheritance;

public class Circle extends Shape {
    // int x; // 원점의 x좌표
    // int y; // 원점의 y좌표
    // x,y는 Point 클래스에 있으니 포함관계로 가져다와서 써도 되지않을까?
    Point point;// 포함관계는 무조건 인스턴스 생성 후에 빌려 쓸 수 있다.
    int r; // 반지름

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    // x,y좌표랑 color를 같이 출력하고싶어
    // x,y는 오버라이딩
    @Override
    void draw() {
        System.out.printf("[x = %d, y = %d, color = %s]", point.x, point.y, color);
    }
}
