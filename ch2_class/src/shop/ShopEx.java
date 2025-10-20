package shop;

public class ShopEx {
    public static void main(String[] args) {
        // TV tv = new TV("삼성TV", 2300000, "4k");
        // CellPhone cellPhone = new CellPhone("아이폰17", 1600000, "U+");

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV(null, 0, null);
        // tvs[1] = new TV(null, 0, null);
        // tvs[2] = new TV(null, 0, null);

        // CellPhone[] cellPhones = new CellPhone[3];
        // cellPhones[0] = new CellPhone(null, 0, null);
        // cellPhones[1] = new CellPhone(null, 0, null);
        // cellPhones[2] = new CellPhone(null, 0, null);

        // 자식 개체들 다 담을 수 있음
        // Product[] products = new Product[5];
        // products[0] = new TV("삼성TV", 2300000, "4k");
        // products[1] = new TV("엘지TV", 2000000, "4k");
        // products[2] = new CellPhone("아이폰17", 1600000, "U+");
        // products[3] = new CellPhone("갤럭시Z폴드", 1400000, "KT");
        // products[4] = new CellPhone("아이폰13pro", 1290000, "SKT");

        // for (Product product : products) {
        // product.printDetail();
        // }

        // User user = new User("이상훈", PayType.CARD);

        // MyShop myShop = new MyShop(null);
        // 이름 지정
        // myShop.setTitle("MyShop");
        // // 사용자 등록
        // myShop.genUser();
        // // 상품 등록
        // myShop.genProduct();
        // // 메뉴
        // myShop.start();
        // // 상품 출력
        // // myShop.productList();

        // 배열을 List로 변경
        MyShop2 myShop2 = new MyShop2("My Shop2");
        myShop2.genUser();
        myShop2.genProduct();
        myShop2.start();
        myShop2.productList();
    }
}
