package inheritance;

public class BonusPointAccount extends Account {
    // 예금액에 따라 보너스 포인트를 부여
    private int bonusPoint;

    public BonusPointAccount(String accountNumber, String accountName, long zandaka, int bonusPoint) {
        super(accountNumber, accountName, zandaka);
        this.bonusPoint = bonusPoint;
    }

    // 예금을 하면서 보너스포인트를 부여하는 메소드 필요
    @Override
    void deposit(long amount) {
        // 예금 - 이미 부모꺼에 식이 있으니 부르기만 하면 되네?
        super.deposit(amount);
        // 보너스포인트 적립은 새로 만들어야겠지 : 예금액의 1%
        bonusPoint += (int) (amount * 0.01);
        // 보너스 포인트 포함 잔액 확인
        System.out.println("누적 보너스 포인트 : " + bonusPoint);
        System.out.println("보너스 포인트 포함 잔액 : " + (super.getZandaka() + bonusPoint));
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}
