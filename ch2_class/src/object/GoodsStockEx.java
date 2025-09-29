package object;

public class GoodsStockEx {
    public static void main(String[] args) {

        GoodsStock goodsStock = new GoodsStock("p-0001", 35);
        GoodsStock goodsStock1 = new GoodsStock();

        goodsStock1.setGoodsBan("p-0002");
        goodsStock1.setAmount(570);

        System.out.println(goodsStock);
        System.out.println(goodsStock1);
    }
}