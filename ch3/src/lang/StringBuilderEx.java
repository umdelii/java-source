package lang;

public class StringBuilderEx {
    public static void main(String[] args) {
        // StringBuffer, StringBuilder => mutable(원본 변경가능)
        // 멀티스레드, 단일스레드

        StringBuilder builder1 = new StringBuilder();
        // StringBuilder builder2 = "new StringBuilder()"; //인스턴스 직접 초기화는 String만 된다

        // append
        // concat()과 다르게 원본이 변경됨
        builder1.append("abc").append("def").append("ghi");
        System.out.println(builder1);

        // delete() : 원본 자르기 - end 위치 전까지 자름
        builder1.delete(0, 2);
        System.out.println("builder1.delete(0, 2); :" + builder1);

        // deleteCharAt() : 해당 위치 문자만 자름
        builder1.deleteCharAt(0);
        System.out.println("builder1.deleteCharAt(0); " + builder1);

        // insert() : 원하는 위치에 삽입
        builder1.insert(1, "가나다");
        System.out.println("builder1.insert(1, \"가나다\"); " + builder1);

        // replace() : end 위치 전까지 문자 바꿔줘
        builder1.replace(1, 4, "123");
        System.out.println("builder1.replace(1, 4, \"123\"); " + builder1);

        // reverse() : 문자 거꾸로 출력
        System.out.println(builder1.reverse());

        // another chapter
        // 주소로 비교하고 있구나...Object가 넘겨준대로
        builder1 = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder1.equals(builder2) ? "같음" : "다름");

        // 내용비교를 하려면 StringBuilder => String 으로 보내야함
        String str1 = builder1.toString(); // 방법1
        String str2 = new String(builder2); // 방법2
        System.out.println(str1.equals(str2) ? "같음" : "다름");
    }
}
