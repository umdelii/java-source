package lang;

public class MathEx {
    public static void main(String[] args) {
        // Math class : 기본적인 수학계산에 사용할 수 있는 메소드로 구성됨
        // 모든 메소드가 static -> new할 필요 없다!!!!!!!!nice

        double val = 90.7552F;
        // 0~1 임의의 수 생성
        Math.random();

        // round 반올림
        System.out.println("반올림 " + Math.round(val));

        // ceil 올림
        System.out.println("올림 " + Math.ceil(val));

        // floor 내림
        System.out.println("내림 " + Math.floor(val));

        // PI 파이
        System.out.println("PI " + Math.PI);

        Math.random();
        System.out.println("반올림 " + Math.round(val));
        System.out.println("올림 " + Math.ceil(val));
        System.out.println("내림 " + Math.floor(val));
        System.out.println("PI " + Math.PI);
    }
}
