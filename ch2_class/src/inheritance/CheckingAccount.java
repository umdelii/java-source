package inheritance;

public class CheckingAccount extends Account {
    private String cardNo; // 체크카드 번호

    public CheckingAccount(String accountNumber, String accountName, long zandaka, String cardNo) {
        super(accountNumber, accountName, zandaka);
        this.cardNo = cardNo;
    }

    // 체크카드 사용. 이라는 메소드 생성
    long pay(String cardNo, long zandaka) throws Exception {
        // 카드번호 일치?
        if (!cardNo.equals(this.cardNo)) {
            // 일치하지않는다면..
            throw new Exception("카드번호 확인");
        }
        return withdraw(zandaka);
    }
}
