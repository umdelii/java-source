package object;

public class CardEx {
    public static void main(String[] args) {
        Card card1 = new Card(); // Card 클래스의 kind 인스턴스 변수 쓰고 싶음, 그러면? 인스턴스 생성

        // Card.cv = ""; // 클래스 변수 : 클래스이름.클래스변수

        card1.kind = "spade";
        card1.number = 2;
        System.out.printf("card1 : %d, %s, %d, %d\n", card1.number, card1.kind,
                Card.width, Card.height);

        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 3;
        System.out.printf("card2 : %d, %s, %d, %d\n", card2.number, card2.kind, Card.width, Card.height);

        // 카드의 크기(static)가 바뀌었다면?
        Card.width = 70;
        Card.height = 110;
        System.out.printf("card1 : %d, %s, %d, %d\n", card1.number, card1.kind,
                Card.width, Card.height);

        // 중복된 코드 제거
        info(card2);
    }

    static void info(Card card) {
        System.out.println("번호 : " + card.number);
        System.out.println("종류 : " + card.kind);
        System.out.println("가로 : " + Card.width);
        System.out.println("세로 : " + Card.height);

    }
}
