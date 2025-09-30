package object;

public class Account {

    // 은행계좌
    // 계좌번호, 계좌주, 잔액
    // 입금(잔액 = 잔액 + 입금액),출금(잔액 = 잔액 - 출금액)

    private String accountNumber;
    private String accountName;
    private long zandaka;

    public Account(String accountNumber, String accountName, long zandaka) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.zandaka = zandaka;
    }

    void deposit(long num1) {
        zandaka += num1;
    }

    long withdraw(long num1) {
        return zandaka -= num1;
    }

    // --------------------------------- private 붙인 이후 수정법 (void)오류남

    // 속성 값 조회 : get~

    public long getZandaka() {
        return zandaka;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
