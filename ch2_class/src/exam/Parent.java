package exam;

public class Parent {
    /* 멤버변수(속성)는 일반적으로 외부 접근 차단시킴 */
    private int num1;
    // default의 경우
    String name;
    // protected의 경우
    protected String grade;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    // public int print() {
    // return 0;
    // }
}
