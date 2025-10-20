package lombok2;

public class AccountEx {
    public static void main(String[] args) {
        Accoount accoount = new Accoount("홍길동", "111", 0);

        // toString 확인
        System.out.println(accoount);

        Accoount accoount2 = new Accoount();
        accoount2.setName(null);

        // lombok @Builder 사용 후 인스턴스 생성 방법
        Accoount accoount3 = Accoount.builder()
                .name(null)
                .accNo(null)
                .balance(0)
                .build();
        System.out.println(accoount3);
    }
}
