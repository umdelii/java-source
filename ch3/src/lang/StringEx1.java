package lang;

public class StringEx1 {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        // String str1 = new String("abc"); -> 기본 방식
        String str1 = "abc";

        // 낱개로 처리하는 방법 ex: "abc" => 'a','b','c' -> charAt(인덱스번호)
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        // new String();으로 생성해야할 경우
        // char 배열을 문자열로 바꿀 때
        char[] ch = { 'A', 'B', 'C', 'D' };
        String str2 = new String(ch);
        System.out.println(str2);
    }
}
