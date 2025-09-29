package object;

public class GoodsStock {

    // 속성 : 상품명(ex)p0001), 수량
    // 기본생성자 (보통은 default랑 전체멤버변수 포함하는 생성자 두 개 만들긴 함~)
    // setter, getter 메소드

    String goodsBan;
    int amount;

    public GoodsStock() {
    }

    public GoodsStock(String goodsBan, int amount) {
        this.goodsBan = goodsBan;
        this.amount = amount;
    }

    public String getGoodsBan() {
        return goodsBan;
    }

    public void setGoodsBan(String goodsBan) {
        this.goodsBan = goodsBan;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "GoodsStock [goodsBan = " + goodsBan + ", amount = " + amount + "]";
    }
}
