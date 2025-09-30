package object;

public class Student {
    // 메인이 없는 class
    // 멤버변수, 생성자, 멤버메소드

    // 멤버변수
    // 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 25)
    String name;
    String tel;
    String address;

    // 생성자(Constructor) :
    // 여러 개 작성 가능
    // 클래스 이름과 동일
    // 리턴 값이 없음
    // ()안에 아무것도 없으면 default(기본) 생성자 - 컴파일러가 자동으로 추가해줌, 단 class에 정의된 생성자가 하나도 없는 경우
    // 생성자 오버로딩 : 하나의 클래스에 동일한 여러개의 생성자 존재
    // 마우스 오른쪽 - Source action... - ok button
    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public Student(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    // Method의 개념
    // String 같은 초록색 타입들(기본타입,참조타입) : 리턴타입
    // 메소드 오버로딩 : 하나의 클래스에 동일안 여러개의 메소드 존재

    // getName : 메소드명 - 변수명 짓는 규칙과 같음(소문자, 복합단어는 뒷단어 대문자)
    // 뒤 소괄호가 따라오고, 중괄호 : method가 해야할 작업을 명령
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    // 결과 반환을 안하는 메소드(set~)
    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // 이름을 변경(초기화x, 계속 바꿀 수 있는)하는 메소드를 만들자!
    // 리턴타입(or void) 메소드명(매개변수1,매개변수2,......) {해야되는 일이 뭔지}

    // void changeName(String name) {
    // this.name = name;
    // } <-------------------------------막은거임 3줄

    String changeName(String name) {
        return this.name;
    }

    // toString을 만들면 객체의 주소가 아니라 객체의 내용이 출력됨
    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }

}
