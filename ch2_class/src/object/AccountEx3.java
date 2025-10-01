package object;

import java.util.Scanner;

public class AccountEx3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 배열로 할거임
        // 배열 몇개 생성하는지 몰라 그럼?
        // Scanner sc = new Scanner(System.in); // ------------------ 입력받아서 생성하자
        // Account[] accounts; // ------- 배열 선언만
        // System.out.println("생성할 계좌 수 입력");
        // int num = Integer.parseInt(sc.nextLine());
        // 배열 생성 = new @[#]
        // accounts = new Account[num];

        // 메소드 분리 후 뭔가 생성
        Account[] accounts = new Account[100];

        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
            System.out.print("선택 : ");
            int no = Integer.parseInt(sc.nextLine());

            switch (no) {
                case 1:
                    createAccount(accounts);
                    break;

                case 2:
                    accountList(accounts);
                    break;

                case 3:
                    deposit(accounts);
                    break;

                case 4:
                    withdraw(accounts);
                    break;

                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("번호를 다시 입력하시오.");
                    break;
            }
        }

        // 정보 다 입력받자
        // // System.out.print("계좌 번호 입력");
        // // String accountNumber = sc.nextLine();
        // // System.out.print("계좌주 입력");
        // // String accountName = sc.nextLine();
        // // System.out.print("잔액 입력");
        // // long zandaka = sc.nextLong();
        // accounts[0] = new Account(accountNumber, accountName, zandaka);

        // 이 놈들을 또 반복해서 써야되는데... 그럼 for문 돌리자
        // for (int i = 0; i < accounts.length; i++) {
        // // System.out.print("계좌 번호 입력 : ");
        // // String accountNumber = sc.nextLine();
        // // System.out.print("계좌주 입력 : ");
        // // String accountName = sc.nextLine();
        // // System.out.print("잔액 입력 : ");
        // // long zandaka = sc.nextLong();

        // // accounts[i] = new Account(accountNumber, accountName, zandaka);
        // }
        // accounts[1] = new Account("222-222-222", "최혁규", 20000);
        // accounts[2] = new Account("333-333-333", "정지훈", 30000);

        // print(accounts);

        // 최혁규 계좌에 입금해보자
        // accounts[1].deposit(1000000);
        // System.out.println(accounts[1].getAccountName() + " : " +
        // accounts[1].getZandaka());
    }

    // 메소드 분리
    // 계좌생성
    static void createAccount(Account[] accounts) {
        System.out.print("계좌 번호 입력 : ");
        String accountNumber = sc.nextLine();
        System.out.print("계좌주 입력 : ");
        String accountName = sc.nextLine();
        System.out.print("잔액 입력 : ");
        long zandaka = Long.parseLong(sc.nextLine()); // -----------------------------내가 실수한 부분 = 앞이 long인데
                                                      // Integer.parseInt를 써서 실행 오류가 떠버림
        // int zandaka = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNumber, accountName, zandaka);
                break;
            }
        }

    }

    // 입금 담당
    static void deposit(Account[] accounts) {
        Account account = findAccount(accounts);

        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            // 입금액을 입력 받아 잔액에 추가
            System.out.print("입금액 : ");
            int amount = Integer.parseInt(sc.nextLine());
            account.deposit(amount);
        }
    }

    // 출금 담당
    static void withdraw(Account[] accounts) {
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            // 출금액을 받아 잔액에서 빼기
            System.out.print("출금액 : ");
            int amount = Integer.parseInt(sc.nextLine());
            long zandaka = account.withdraw(amount);
            System.out.println("현재 잔액 : " + zandaka);
        }
    }

    // 입력받은 계좌번호와 일치하는 계좌 찾기
    static Account findAccount(Account[] accounts) {
        System.out.print("계좌 번호 입력 : ");
        String accountNumber = sc.nextLine();
        // for (int i = 0; i < accounts.length; i++) {
        // if (accounts[i] != null) {
        // if (accountNumber.equals(accounts[i].getAccountNumber())) {
        // return accounts[i];
        // }
        // }
        // } ---------------------------------------- 선생님꺼 제대로 안보고 fori로 돌려버린거의 정답
        for (Account account : accounts) {
            if (account != null) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
        }
        return null;
    }

    static void accountList(Account[] accounts) {
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("-----------------------------------------------");
                System.out.println("1.계좌번호 : " + account.getAccountNumber());
                System.out.println("2. 계좌주 : " + account.getAccountName());
                System.out.println("3. 잔액 : " + account.getZandaka());
            }
        }
    }
}
