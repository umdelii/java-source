package lang;

public class StringEx3 {
    public static void main(String[] args) {
        // 문자열 거꾸로 출력하기
        String str1 = "Hello World";
        // System.out.println(str1.replace(str1, "dlroW olleH"));

        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
    }
}
