package array;

public class ArrayEx8 {
    public static void main(String[] args) {

        // 2차원 배열 (표같이)
        int score[][] = new int[3][4]; // 3행 4열
        score[0][0] = 78;
        score[1][1] = 68; // 직접 행열에 번호 넣기

        // 한 번에 넣기
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println(score.length); // 행의 길이
        System.out.println(score[0].length); // 열의 길이

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t"); // \t = tab
            }
            System.out.println();
        }

        // 가변 주기 ex) 행은 3개인데 열은 각 행마다 다를지도~
        int arr2[][] = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];

        int tensuu[][] = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 80, 70, 60 },
                { 60, 80, 90 },
        };

        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("============================================");
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        for (int i = 0; i < tensuu.length; i++) {
            int sum = 0;
            float avg = 0.0f;
            System.out.printf("%3d", i + 1);
            for (int j = 0; j < tensuu[i].length; j++) {
                sum += tensuu[i][j];
                System.out.printf("%8d", tensuu[i][j]);
            }
            avg = sum / (float) tensuu[i].length;
            System.out.printf("%8d %8.1f", sum, avg);
            System.out.println();
            korTotal += tensuu[i][0];
            engTotal += tensuu[i][1];
            mathTotal += tensuu[i][2];
        }
        System.out.println("============================================");
        System.out.printf("총점 %6d %7d %7d", korTotal, engTotal, mathTotal);
    }
}
