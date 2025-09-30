package object;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    static void staticMethod1() {
        // static 변수 호출
        System.out.println(cv);
        // 인스턴스 변수 호출. 안되네
        // System.out.println(iv);
        MethodCall obj = new MethodCall();
        System.out.println(obj.iv); // ---------------------- 인스턴스 변수 호출하는 법 -> 인스턴스 생성을 하면 됨
    }

    void instanceMethod1() {
        System.out.println(iv);
        System.out.println(cv);
    }

    static void staticMethod2() {
        // 클래스 메소드 호출 확인
        staticMethod1();
        // 인스턴스 메소드 호출 확인. 안되네.
        // instanceMethod1();
        MethodCall obj = new MethodCall();
        obj.instanceMethod1(); // ----------------------------인스턴스 메소드 호출하는 법 -> 인스턴스 생성을 하면 됨
    }

    void instanceMethod2() {
        // 클래스 메소드 호출 확인
        staticMethod1();
        // 인스턴스 메소드 호출 확인. 되네.
        instanceMethod1();
    }
}
