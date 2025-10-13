package exam;

public class Third {
    Parent parent = new Parent();

    public void info() {
        parent.setNum1(10);
        parent.name = "kim"; // default 접근 되네
        parent.grade = "A"; // protected 접근 되네
    }
}
