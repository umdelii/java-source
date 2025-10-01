package inheritance;

public class CreditLineAccountEx {
    public static void main(String[] args) {
        CreditLineAccount clAccount = new CreditLineAccount("111", "홍길동", 100000, 5000000);

        try {
            clAccount.withdraw(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
