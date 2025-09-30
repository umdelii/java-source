package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {

        SubscriberInfo info = new SubscriberInfo();

        info.setId("gildong2");
        info.setName("홍길동");
        info.changePassword("awef3456&&");
        info.changePhone("010-0000-0000");

        // 가입자 정보 조회(1. 간단조회 - toString() => 개발자 확인용, 2. 개별 조회 - get~()생성)
        System.out.println(info);
        System.out.println(info.getId());

        info.changePassword("124nirfnb$!");
        info.changePhone("070-1234-5678");
    }
}
