package basic;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d;

        // 변환 안되는데 강제로 변경할거야 = Casting

        System.out.printf("d = %f, score = %d\n", d, score);
    }
}
