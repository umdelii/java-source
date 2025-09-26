package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {

        // String : char배열 + 기능(메소드) << char기능들 모아둔거다~
        String strArr[] = { "Kim", "Park", "Choi" };
        System.out.println(Arrays.toString(strArr));

        String strArr2[] = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = new String("Park"); // 위랑 주소가 달라
        strArr2[2] = "Choi";
        System.out.println(Arrays.toString(strArr2));

        System.out.println(strArr[0].length());

        System.out.println(strArr2[0]);
        System.out.println("strArr2[0].charAt(0) : " + strArr2[0].charAt(0));

        // 이거로 뭐함? for문 가능하다!
        // 문자열 문자 바라바라 찢어서 출력하기
        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i));
        }
        // for문 안쓰고 더 쉽게 하기 변수.toCharArray
        char[] chArr2 = src.toCharArray();
        System.out.println(Arrays.toString(chArr2));

        // char 배열 => String 문자열로 합칠 수 있음?
        char chArr[] = { 'A', 'B', 'C', 'D', 'E' };
        // String str2 = new String(chArr);
        System.out.println(new String(chArr));

    }
}
