package inheritance;

public class Child extends Parent {
    public Child() {
        // super(); // << default 생성자를 만들면 super();가 숨겨져있음 super = 부모 / 의미 : 부모의 생성자를
        // 호출해줘
        super(15); // << 괄호안과 일치하는 생성자를 따라감 (아무것도 없으면 default)
    }

    void play() {
        System.out.println("Play!!");
    }

    @Override
    public void list() {
        super.list();
        System.out.println("자식 클래스");
    }
}
