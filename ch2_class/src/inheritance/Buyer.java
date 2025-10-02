package inheritance;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= p.price;
        bonusPoint += (int) (p.bonusPoint / 10.0);
        System.out.println(p + "를 구매하셨습니다.");
    }

}
