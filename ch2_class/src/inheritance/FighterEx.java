package inheritance;

public class FighterEx {
    public static void main(String[] args) {
        /* 추상 클래스, 인터페이스는 직접적으로 인스턴스 생성 불가 */
        // Attackable attackable = new Attackable();

        Fightable fightable = new Fighter();
        fightable.move(1, 0);
        fightable.attack(null);
    }
}
