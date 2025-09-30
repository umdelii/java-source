package object;

public class AccountEx {
    public static void main(String[] args) {

        Account account = new Account("110-480-238256", "이상훈", 0);

        // 입금 호출(void임)
        account.deposit(150000);
        // System.out.println(account.zandaka); ---------------------- private 붙인 이후 오류
        // 뜸
        System.out.println(account.getZandaka());

        // 출금 호출(return임)
        long zandaka = account.withdraw(50000);
        System.out.println(zandaka);

        Account account2 = new Account("123-456-7890", "성춘향", 9000000);
        // 잔액 조회
        System.out.println("성춘향 잔액 : " + account2.getZandaka());

        // 이름말고 나머지도 get~
        System.out.println("-----------------------------------------------");
        System.out.println("1.계좌번호 : " + account2.getAccountNumber());
        System.out.println("2. 계좌주 : " + account2.getAccountName());
        System.out.println("3. 잔액 : " + account2.getZandaka());
        System.out.println("-----------------------------------------------");

    }

}
