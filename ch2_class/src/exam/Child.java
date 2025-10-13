package exam;

public class Child extends Parent {
    public void print() {
        // private num1 변수 값 변경
        super.setNum1(1);
        // private num1 변수 값 읽기
        System.out.println(getNum1());

        System.out.println(super.name);

        System.out.println(super.grade);
    }
}
