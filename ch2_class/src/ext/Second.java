package ext;

import exam.Parent; //다른 package에 있는 클래스를 사용할 때 import 선언

public class Second extends Parent {
    Parent parent = new Parent();

    public void info() {
        // super.name = "lee"; --> default는 자식 클래스로 하더라도 접근 불가
        super.grade = "B"; // --> protected의 경우 자식 클래스로 하면 접근 가능
    }
}
