package object;

public class StudentEx1 {
    public static void main(String[] args) {
        // 메인이 있는 class
        Student obj = new Student(); // 객체 생성 == 인스턴스 생성

        // 인스턴스 초기화
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 25";

        // 메소드 호출
        // obj.getAddress();

        // 1) 결과 반환의 경우 : 변수에 담거나 print구문 사용했을 때
        // 2) 결과 반환 x의 경우 : 호출만 하기

        // 1)의 예시
        System.out.println(obj.getAddress());

        Student obj2 = new Student();
        // 멤버변수값 변경
        obj2.setName("성춘향");
        obj2.setTel("010-5678-1234");
        obj2.setAddress("서울시 동대문구 20");
        System.out.println(obj2);
        // 멤버변수값 가져오기
        System.out.println(obj2.getName());

        // ----------------------------------------------------------------------------
        // obj.changeName(); <막은거임
        System.out.println(obj);
        obj2.changeName("성천사");

        System.out.println(obj2);

    }
}
