package array;

public class rensyuu {
    public static void main(String[] args) {

        int tensuu[][] = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 80, 70, 60 },
                { 60, 80, 90 },
        };

        int kor = 0, eng = 0, math = 0;
        System.out.println("번호    국어    수학    영어    총점    평균");
        System.out.println("============================================");
        for (int i = 0; i < tensuu.length; i++) {
            int sum = 0;
            float avg = 0.0f;
            System.out.printf("%3d", i + 1);
            for (int j = 0; j < tensuu[i].length; j++) {
                sum += tensuu[i][j];
                avg = (float) sum / tensuu[i].length;
                System.out.printf("%8d", tensuu[i][j]);
            }
            System.out.printf("%8d %8.1f", sum, avg);
            System.out.println();
            kor += tensuu[i][0];
            eng += tensuu[i][2];
            math += tensuu[i][1];
        }
        System.out.println("============================================");
        System.out.printf("총점 %6d %7d %7d", kor, eng, math);

    }
}
