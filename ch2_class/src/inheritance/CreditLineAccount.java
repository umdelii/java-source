package inheritance;

public class CreditLineAccount extends Account {
    int gendou;

    public CreditLineAccount(String accountNumber, String accountName, long zandaka, int gendou) {
        super(accountNumber, accountName, zandaka);
        this.gendou = gendou;
    }

    // 마이너스 한도 -5,000,000만원까지 출금가능해..
    // @Override
    // long withdraw(long amount) {
    // if ((amount - getZandaka()) > 5000000) {
    // System.out.println("잔액 부족");
    // } else
    // System.out.println("출금 후 잔액 : " + (getZandaka() - amount));
    // return amount;
    // }

    @Override
    long withdraw(long amount) throws Exception {
        return super.withdraw(amount);
    }
}
