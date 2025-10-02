package inheritance;

public class CheckingTrafficCardAccount extends CheckingAccount {
    // 은행(예,출금)+체크카드+교통카드 기능 포함
    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(String accountNumber, String accountName, long zandaka, String cardNo,
            boolean hasTrafficCard) {
        super(accountNumber, accountName, zandaka, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    // 교통비 지급 메소드 필요
    // 카드번호 일치, 교통비 사용액을 인자로 받아, 교통카드 기능이 있으면 교통비 지불
    // 교통카드 기능이 없으면 throw메세지
    long payTrafficCard(String cardNo, long amount) throws Exception {
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능 없음");
        }
        return pay(cardNo, amount);
    }
}
