package basic;

public class Variable4 {
    public static void main(String[] args) {
        // 논리형(true or false)
        boolean flag = true;
        System.out.println(flag ? "참" : "거짓");

        // 문자형(char)
        char ch = 'a', ch2 = '가';
        // char ch3 = 'da';
        // 문자열 : ""(String), 문자 : ''
        // String ch4 = "aed";
        System.out.println("ch = " + ch + ", ch2 = " + ch2);
        System.out.printf("ch = %c, ch2 = %c\n", ch, ch2);
        System.out.printf("ch = %5c, ch2 = %c\n", ch, ch2);
        System.out.println("ch = " + (ch + 1));
        System.out.println("ch2 = " + (ch2 + 1));
        System.out.printf("ch2 = %c\n", (ch2 + 1));
        System.out.printf("ch2 = %d", (ch2 + 1));
        // 유니코드 a = 97, A = 65
    }
}
