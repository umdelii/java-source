package object;

public class AccountEx2 {
    public static void main(String[] args) {
        // 배열로 할거임

        Account[] accounts = new Account[3];
        accounts[0] = new Account("111-111-111", "김서은", 10000);
        accounts[1] = new Account("222-222-222", "최혁규", 20000);
        accounts[2] = new Account("333-333-333", "정지훈", 30000);

        print(accounts);

        // 최혁규 계좌에 입금해보자
        accounts[1].deposit(1000000);
        System.out.println(accounts[1].getAccountName() + " 잔액 : " + accounts[1].getZandaka());
    }

    static void print(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.계좌번호 : " + account.getAccountNumber());
            System.out.println("2. 계좌주 : " + account.getAccountName());
            System.out.println("3. 잔액 : " + account.getZandaka());
            System.out.println("-----------------------------------------------");
        }
    }
}
