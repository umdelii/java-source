package inheritance;

// 상속이란?
// 기존의 클래스를 재사용하여 새로운 클래스를 작성하게 해줌
// 왜씀? 기존의 코드 반복해서 쓰지 않아도 되니까
// 조상(부모,상위,super)클래스로 명칭됨
// 자손(자식,하위,파생)클래스로 명칭
// 상속불가 = 생성자, 초기화 블럭 등
public class Parent {
    int age;
    String name;

    public Parent() {
    }

    public Parent(int age) {
        this.age = age;
    }

    public void list() {
        System.out.println("부모 클래스");
    }
}
