package util;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add((new Member("hong12", "hong12", "홍길동")));
        set.add((new Member("hong13", "hong13", "홍길동1")));
        set.add((new Member("hong14", "hong14", "홍길동2")));
        set.add((new Member("hong12", "hong12", "홍길동")));

        for (Member member : set) {
            System.out.println(member);
        } /*
           * Set인데 중복값 왜 출력됨? String이나 Integer 클래스에는 중복값 제거 메소드가 있었나봄 근데 내가 만든 Member
           * 클래스에는 그런 메소드가 없잖아
           */
    }
}
