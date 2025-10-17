package util;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape()); // Apple, Grape 둘 다 자식이니가

        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // Grape이랑 뭣도 아니니 못 담아~ 이게? Generics 기능이다
        grapeBox.add(new Grape());
        toyBox.add(new Toy());

        // <? extends Fruit> 니까 Fruit 클래스랑 그 자식 Apple,Grape 타입만 가능
        Juicer.makeJuice(fruitBox);
        Juicer.makeJuice(appleBox);
        Juicer.makeJuice(grapeBox);
    }
}
