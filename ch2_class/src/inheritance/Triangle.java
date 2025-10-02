package inheritance;

public class Triangle extends Shape {
    /*
     * Point point1 = new Point();
     * Point point2 = new Point();
     * Point point3 = new Point();
     */
    // 이렇게 써도 되지만 동일한 주소를 여러개 생성하려면? 배열

    Point[] points = new Point[3];

    public Triangle(Point[] points) {
        this.points = points;
    }

    @Override
    void draw() {
        System.out.printf("p1 [x = %d, y = %d], p2 [x = %d, y = %d], p3 [x = %d, y = %d], color = %s", points[0].x,
                points[0].y, points[1].x, points[1].y, points[2].x, points[2].y, color);
    }
}
