package ext;

public class AccountEx {
    public static void main(String[] args) {
        // account 계좌를 3개 생성
        Account account1 = new Account(null, null, 0);
        Account account2 = new Account(null, null, 0);
        Account account3 = new Account(null, null, 0);

        /*
         * 배열
         * 배열 생성
         */
        int[] arr = new int[3];
        // 배열 초기화 (값 대입)
        arr[0] = 3;
        arr[1] = 6;
        arr[2] = 9;

        // Account 배열 생성
        Account[] accounts = new Account[3];
    }
}
