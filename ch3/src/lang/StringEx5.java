package lang;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println(count("123AB45ABB5531AB", "AB"));
        System.out.println(count("12345BC", "AB"));
    }

    public static int count(String src, String target) {
        // target이 src 내에 몇 번 나오는가?
        // indexOf()

        // 시작위치부터 셀 때 문자열에 AB가 들어가있다면 result>=0 일것
        // -1이 아닌 경우의 수를 다 더하면 되는데..
        // 문제는? fromIndex가 3일때까지 첫 AB의 값이 중복돼서 나올텐데 중복된 경우의 수는 어떻게 빼지?
        // 일단 내가 만들어 본 것
        // int result = 0;

        // for (int i = 0; i < src.length(); i++) {
        // if (src.indexOf(target, i) >= 0) {
        // result += result;
        // }
        // }
        // return result;

        // 중복된 경우의 수를 빼려면? target의 길이만큼 fromIndex를 더하면되네
        int count = 0;
        int pos = 0;
        while ((pos = src.indexOf(target, pos)) != -1) {
            pos += target.length();
            count++;
        }
        return count;
    }
}
