package inheritance;

public class CreditLineAccount extends Account {
    private int gendo;

    public CreditLineAccount(String accountNumber, String accountName, long zandaka, int gendo) {
        super(accountNumber, accountName, zandaka);
        this.gendo = gendo;
    }

    // 마이너스 한도 -5,000,000만원까지 출금가능해..
    /*
     * @Override
     * long withdraw(long amount) {
     * if ((amount - getZandaka()) > 5000000) {
     * System.out.println("잔액 부족");
     * } else
     * System.out.println("출금 후 잔액 : " + (getZandaka() - amount));
     * return amount;
     * }
     */

    @Override
    long withdraw(long amount) throws Exception {
        if (super.getZandaka() + gendo < amount) {
            throw new Exception("마이너스 한도 확인");
        }
        setZandaka(super.getZandaka() - amount);
        return super.getZandaka();
    }
}
