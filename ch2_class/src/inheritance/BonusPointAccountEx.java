package inheritance;

public class BonusPointAccountEx {
    public static void main(String[] args) {
        BonusPointAccount bpAccount = new BonusPointAccount("111", "홍길동", 0, 10000);
        bpAccount.deposit(50000);
    }
}
