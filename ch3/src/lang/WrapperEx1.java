package lang;

public class WrapperEx1 {
    public static void main(String[] args) {
        // 래퍼 class(타입)
        // 기본타입(boolean,int,float등) 변수를 객체로 다루고자 할 때 사용
        // 기본타입 첫 문자를 대문자로 바꿈 but, char는 Character / int는 Integer
        // 객체로 다루면 좋은 점(바꿔야될때)? : 메소드를 호출할 수 있다
        boolean b = true;
        // Boolean boolean1 = new Boolean(b); // 가로줄 감
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false; // Boolean.valueOf(false);를 간편하게 직접 초기화 가능
        Byte byte1 = 1;
        Byte byte2 = Byte.valueOf((byte) 1); // 1만 넣으면 1 => int로 인식하기 때문에 오류 뜸 , 따라서 강제형변환을
        Character ch1 = 'a';
        Character ch2 = Character.valueOf('a');
        Integer.parseInt("15");
        Long long1 = 15L;
        Long long2 = Long.valueOf(15L);
        Float.parseFloat("15.432f");
    }
}
