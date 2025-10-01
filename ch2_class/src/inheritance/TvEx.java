package inheritance;

public class TvEx {
    public static void main(String[] args) {
        // 상속관계 인스턴스 생성
        CaptionTv cTv = new CaptionTv(35, 11, false, "black");
        // TV tv = new CaptionTv(53, 10, false, "white");

        // 자식 클래스에서 사용 가능한 것
        // 1.부모의 멤버변수
        cTv.channel = 8;
        // 2.부모의 메소드
        cTv.setPower(false);
        // 3.본인의 멤버변수 및 메소드
        cTv.caption = true;
        cTv.displayCaption("자막 사용 가능");

    }
}
