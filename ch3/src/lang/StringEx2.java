package lang;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        // String
        // mutable => imutable(변경불가)

        // 1. concat() : 다른 문자열 뒤에 덧붙이기
        // 문자열 결합
        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1 + str2;
        System.out.println(str3);

        str1.concat(str2);
        System.out.println(str1.concat(str2));

        // 2. contains() : 해당 문자열이 포함되어 있는가 확인
        boolean result = str3.contains(str1);
        System.out.println(result);
        if (str3.contains(str1)) {
            System.out.println("str3 문자열에 str1 문자열이 포함됨");
        } else {
            System.out.println("str3 문자열에 str1 문자열이 포함되지 않음");
        }

        // 3. compareTo() : 문자열을 사전 순으로 비교
        str1 = "aaa";
        str2 = "bbb";
        System.out.println(str1.compareTo("aaa")); // 0
        System.out.println(str1.compareTo(str2)); // -1
        System.out.println(str2.compareTo(str1)); // 1

        // 4. endsWith() : 지정된 문자열로 끝나는 지 검사
        String fileName = "file1.txt";
        fileName.endsWith("txt");
        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 X");
        }

        // 5. equals() : 문자열 비교, equalsIgnoreCase() : 대소문자 구분 없이 비교
        System.out.println("aaa".equals("AAA"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));

        // 6. indexOf(ch) : 문자열에서 문자의 위치값 리턴
        str1 = "Hello";
        System.out.println(str1.indexOf('e')); // 'e'가 str1의 두번째 열에 있었기에 1 출력
        System.out.println(str1.indexOf('k')); // 못 찾으면 무조건 -1 출력
        System.out.println(str1.indexOf('e', 2)); // 엑셀 mid함수 비슷한거, 시작위치를 설정, -1 출력(없으니까)
        System.out.println(str1.indexOf("el"));

        // 7. lastIndexOf() : indexOf랑 반대, 뒤에서 찾음
        str1 = "java.lang.Object";
        System.out.println(str1.lastIndexOf('.'));
        System.out.println(str1.indexOf('.'));

        // 8. length() : 문자열 길이 반환
        int[] arr = { 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
        } // 괄호가 있고 없고 차이 확인해. 메소드인지 변수인지

        // 9. replace() : 문자 바꿔줘
        str1 = "Hello";
        System.out.println(str1.replace('H', 'K'));
        System.out.println(str1); // 원본 데이터에 영향이 가지는 않았다
        System.out.println("Hellollo".replace("ll", "LL")); // 전체 변경
        System.out.println("Hellollo".replaceAll("ll", "LL")); // 전체 변경, regex : 정규식
        System.out.println("Hellollo".replaceFirst("ll", "LL")); // 첫 번째만 변경

        // 10. split()
        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        System.out.println(Arrays.toString(arr2));
        for (String s : arr2) {
            System.out.println(s);
        }
        String[] arr3 = animals.split(",", 2); // limit의 개수로 잘라줘
        for (String s : arr3) {
            System.out.println(s);
        }

        // 11. startsWith(prefix) : 주어진 문자열 prefix로 시작하는지 검사 <==> endsWith()
        str1 = "java.lang.Object";
        System.out.println("str1.startWith(\"java\") : " + str1.startsWith("java"));
        System.out.println("str1.startWith(\"java\") : " + str1.startsWith("lang"));
        System.out.println("str1.startWith(\"java\") : " + str1.startsWith("lang", 6));

        // 12. subString() : 문자열 안 특정 문자열만 추출 -> excel
        System.out.println("str1.substring(10) : " + str1.substring(10));
        System.out.println("str1.substring(5, 9) : " + str1.substring(5, 9)); // 5부터 8까지, endIndex 위치값 미포함

        // 13. toLowerCase() / toUpperCase() : 소문자, 대문자 -> 얘도 excel Lower, Upper함수랑 같네~
        System.out.println("ABCDEFG".toLowerCase());
        System.out.println("abcdefg".toUpperCase());

        // 14. trim() : 양 끝에 존재하는 공백 제거(중간 공백은 안해줌)
        System.out.println("           Hello World     ".trim());
        System.out.println("                Hello       World                     ".trim());

        // 15. valueOf() : 괄호 안 값을 문자열로 변환하여 반환해줌
        String str4 = String.valueOf(5);
        str4 = String.valueOf(10.3f);
    }
}
