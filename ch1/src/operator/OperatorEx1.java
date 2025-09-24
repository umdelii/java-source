package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // 단항연산자 : ++(+1), --(-1)
        int i = 2;
        i++; // = i+1;
        System.out.println(i);
        i--;
        i--;
        System.out.println(i);

        int j = 10;
        ++j;
        System.out.println(j);

        int k = 5, l = 0;
        l = k++; // l=k 연산을 먼저하고 ++했기에 5
        System.out.println("l = k++; 실행 후 ,k=" + k + ", l=" + l);

        k = 5;
        l = 0;
        l = ++k; // ++ 먼저 1더하고 k를 붙였기에 6
        System.out.println("l = ++k; 실행 후 ,k=" + k + ", l=" + l);
    }
}
