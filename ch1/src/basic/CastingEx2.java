package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = i; // 타입이 다른데도 에러가 나지 않음 = 자동형변환(작은 타입을 대입할 시 가능)
        int i2 = (int) f;
        System.out.printf("%d, %f, %d", i, f, i2);

        double d = i; // 이 친구도 자동형변환(int보다 double이 더 크니까!)
        int i3 = (int) d;
    }
}
