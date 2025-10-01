package inheritance;

public class AccountEx {
    public static void main(String[] args) {
        // 계좌개설
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 0, "111-11");

        // 입금
        checkingAccount.deposit(200000);
        // 입금 후 잔액 확인
        System.out.println("잔액 : " + checkingAccount.getZandaka());
        // 체크카드 사용
        try {
            System.out.println("지불 후 잔액 : " + checkingAccount.pay("111-11", 100000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
