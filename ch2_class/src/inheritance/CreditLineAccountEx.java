package inheritance;

public class CreditLineAccountEx {
    public static void main(String[] args) {
        CreditLineAccount clAccount = new CreditLineAccount("111", "홍길동", 100000, 5000000);
        try {
            System.out.println("잔액 : " + clAccount.withdraw(3000000));
            System.out.println("잔액 : " + clAccount.withdraw(3000000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
