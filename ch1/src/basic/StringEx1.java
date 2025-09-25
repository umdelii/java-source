package basic;

// 1. 기본 타입 : byte, short, int, long, float, double, char, boolean
// 2. 참조 타입 : 그 외 모든 타입 *대문자로 시작하는 애들

public class StringEx1 {
    public static void main(String[] args) {
        // 문자열文字列 : ""
        String bun1 = "aespa";
        String bun2 = "aespa";

        // 문자열이 같은 지 비교(比較)하기, == or !=
        System.out.println(bun1 == bun2 ? "문자열이 같다" : "문자열이 다르다");

        String bun3 = new String("aespa");
        System.out.println(bun2 == bun3 ? "문자열이 같다" : "문자열이 다르다");
        // 저장공간이 다르기에 false가 나온다

        // equals
        System.out.println(bun2.equals(bun3) ? "문자열이 같다" : "문자열이 다르다");
        // abc==ABC 이고 싶을때 (java는 대소문자 구분하지만, 의미는 같잖아? 확인하고싶어.. case를 무시하고 equal 비교하기)
        String bun4 = "abc", bun5 = "ABC";
        System.out.println(bun4.equals(bun5) ? "equal" : "not equal");
        System.out.println(bun4.equalsIgnoreCase(bun5) ? "equal" : "not equal");

    }
}
