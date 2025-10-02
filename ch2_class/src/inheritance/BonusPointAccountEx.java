package inheritance;

public class BonusPointAccountEx {
    public static void main(String[] args) {
        BonusPointAccount bpAccount = new BonusPointAccount("111", "홍길동", 0, 0);
        bpAccount.deposit(10000);
        /*
         * System.out.println("보너스 포인트 포함 잔액 : " + (bpAccount.getBonusPoint() +
         * bpAccount.getZandaka()));
         */
        bpAccount.deposit(10000);
        bpAccount.deposit(10000);
        bpAccount.deposit(10000);
        bpAccount.deposit(10000);
        bpAccount.deposit(100000);
        /*
         * System.out.println("보너스 포인트 포함 잔액 : " + (bpAccount.getBonusPoint() +
         * bpAccount.getZandaka()));
         */

    }
}
