package inheritance;

public class ShapeEx {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        // 방법 1
        Point[] points = { new Point(10, 10), new Point(20, 20), new Point(30, 30) };
        // 방법 2
        /*
         * Point[] points = new Point[3];
         * point[0] = new Point();
         * points[0].x = 10;
         * points[0].y = 10;
         * point[1] = new Point();
         * points[1].x = 10;
         * points[1].y = 10;
         * point[2] = new Point();
         * points[2].x = 10;
         * points[2].y = 10;
         */
        // 방법 3
        /*
         * Point[] points = new Point[3];
         * points[0] = new Point(10, 10);
         * points[1] = new Point(20, 20);
         * points[2] = new Point(30, 30);
         */
        Triangle triangle = new Triangle(points); // <<괄호안에 생성자와 같은 매개변수를 넣어야할거아냐~ Point[] points 근데 어케 만듬? = 위에 방법으로 해라
        triangle.draw();
    }
}
