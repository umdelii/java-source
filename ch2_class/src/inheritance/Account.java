package inheritance;

public class Account {
    private String accountNumber;
    private String accountName;
    private long zandaka;

    public Account(String accountNumber, String accountName, long zandaka) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.zandaka = zandaka;
    }

    void deposit(long amount) {
        zandaka += amount;
    }

    long withdraw(long amount) throws Exception {
        if (zandaka < amount) {
            throw new Exception("잔액 부족");
        }
        zandaka -= amount;
        return zandaka;
    }

    public long getZandaka() {
        return zandaka;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setZandaka(long zandaka) {
        this.zandaka = zandaka;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", zandaka=" + zandaka
                + "]";
    }

}
