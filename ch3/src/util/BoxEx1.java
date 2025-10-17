package util;

public class BoxEx1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.setItem("이상훈"); // new String("이상훈")
        String name = (String) box1.getItem();
        System.out.println(name);

        box1.setItem(33); // Integer.valuOf(33)
        Integer i = (Integer) box1.getItem();
        System.out.println(i);

        box1.setItem(33.14); // Double.valueOf(33.14)
        Double d = (Double) box1.getItem();
        System.out.println(d);

        // Generics -> 안정적인 데이터 입력 가능
        Box2<String> box2 = new Box2<>();
        box2.setItem(name);
    }
}
