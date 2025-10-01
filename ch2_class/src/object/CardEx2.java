package object;

public class CardEx2 {
    public static void main(String[] args) {
        // 기본 배열
        int[] arr = new int[5];
        arr[0] = 17;
        int[] arr2 = { 14, 12, 4, 5, 1, 35, 161, 6 };

        // 참조(타입)형 배열
        String[] arr3 = new String[12];
        System.out.println(arr3[0]);

        // 카드 몇개 안되면 직접 만들면 되는데... 한 몇 천개 만들거면? 하나하나 인스턴스 생성할거임..?
        // 배열로 만들어보는게 어떨까? 그리고 for문 돌리면?
        Card[] cards = new Card[3];
        System.out.println(cards[0]);
        cards[0] = new Card(); // 첫번째 카드의 인스턴스 생성
        cards[0].kind = "spade";
        cards[0].number = 2;

        cards[1] = new Card(); // 두번째 카드의 인스턴스 생성
        cards[1].kind = "heart";
        cards[1].number = 3;

        cards[2] = new Card(); // 세번째 카드의 인스턴스 생성
        cards[2].kind = "diamond";
        cards[2].number = 4;

        // foreach의 경우 -> foreach 들어있는 변수 순차반복(0~끝까지)
        for (Card card : cards) {
            System.out.println("번호 : " + card.number);
            System.out.println("종류 : " + card.kind);
        }
        // fori의 경우 -> fori 들어있는 변수에서 조건을 달아 반복 ex) i = 3~5
        for (int i = 0; i < cards.length; i++) {
            System.out.println("번호 : " + cards[i].number);
            System.out.println("종류 : " + cards[i].kind);
        }
    }
}
