package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {
    private String title;
    // Product[] products = new Product[5];
    List<Product> products = new ArrayList<>();
    List<User> users = new ArrayList<>();

    // 장바구니
    List<Product> carts = new ArrayList<>();

    // 선택된 사용자 idx 보관
    private int selUser;

    public MyShop2(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setCarts(List<Product> carts) {
        this.carts = carts;
    }

    // 메뉴
    @Override
    public void start() {
        int i = 0;
        System.out.println(title + " : 메인 화면 - 계정 선택");
        System.out.println("=================================");
        for (User user : users) {
            System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
        }
        System.out.println("[x]종 료");
        System.out.print("선택 : ");
        Scanner scanner = new Scanner(System.in);
        String sel = scanner.nextLine();

        switch (sel) {
            case "x":
            case "X":
                System.out.println("** 프로그램 종료 **");
                System.exit(0);
                break;

            default:
                selUser = Integer.parseInt(sel);
                break;
        }
        System.out.println("## " + sel + "선택 ##");
        productList();
    }

    // 상품 출력
    @Override
    public void productList() {
        System.out.println("----------------------------------");
        System.out.println(title + " : 상품 목록 - 상품 선택");
        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i);
            product.printDetail();
            i++;
        }
        System.out.println("[h]메인 메뉴");
        System.out.println("[c]체크 아웃");
        System.out.print("선택 : ");
        /*
         * 상품번호 선택 시 => cart 담기 --------------------> 1. 비어있는 카트 위치 찾기 2. 담기의 반복
         * 상품목록 보여주기 -> 상품 선택 반복 -------------> 상품번호 int뿐만 아니라 String h,c도 들어오는상황
         * c => 결제 처리 메소드 호출
         * h => 계정 선택
         */
        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();
        System.out.printf("## %s선택 ##\n", sel);

        switch (sel) {
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;

            default:
                int no = Integer.parseInt(sel);
                carts.add(products.get(no));
        }
        productList();
    }

    // 계산
    @Override
    public void checkOut() {
        System.out.println(title + " : 체크 아웃");
        System.out.println("=================================");
        int i = 1;
        int sum = 0;
        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("=================================");
        System.out.println("결제 방법 : " + users.get(selUser).getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("[p] 이전, [q] 결제 완료");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();

        switch (sel) {
            case "q":
                System.out.println("### 결제가 완료되었습니다. 종료합니다. ###");
                System.exit(0);
                break;
            case "p":
                productList();
                break;

            default:
                break;
        }
    }

    // 사용자등록
    @Override
    public void genUser() {
        // 두 명의 사용자 등록
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("이상훈", PayType.CASH));
    }

    // 상품등록
    @Override
    public void genProduct() {
        products.add(new TV("삼성TV", 2300000, "4k"));
        products.add(new TV("엘지TV", 2000000, "4k"));
        products.add(new CellPhone("아이폰17", 1600000, "U+"));
        products.add(new CellPhone("갤럭시Z폴드", 1400000, "KT"));
        products.add(new CellPhone("아이폰13pro", 1290000, "SKT"));
    }
}
