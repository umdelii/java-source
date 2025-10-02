package inheritance;

public class CheckingTrafficCardAccountEx {
    public static void main(String[] args) {
        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("111", "홍길동", 0, "111-111-111", false);
        CheckingTrafficCardAccount cardAccount2 = new CheckingTrafficCardAccount("222", "정수현", 0, "222-222-222", true);

        // 예금
        cardAccount.deposit(10000);
        cardAccount2.deposit(10000);
        try {
            // 출금
            System.out.println("출금 후 잔액 : " + cardAccount.withdraw(5000));
            // 교통카드 기능 없는데 교통카드 사용액 지불하려고 함...
            // cardAccount.payTrafficCard("111-111-111", 1550);
            // 교통카드 기능 있는 경우
            System.out.println("교통비 지급 후 잔액 : " + cardAccount2.payTrafficCard("222-222-222", 1550));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
