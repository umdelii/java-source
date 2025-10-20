package lombok2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@EqualsAndHashCode // 재정의
@AllArgsConstructor // 전체 멤버변수 포함한 생성자
@NoArgsConstructor // default 생성자
@Getter
@Setter
@ToString
public class Accoount {
    private String name;
    private String accNo;
    private int balance;

    // 생성자, getter&setter, toString() -> 클래스 만들 때 항상 만드는데 lombok이 어노테이션 처리해줌
    // 어노테이션 -> 클래스 위에 @붙여서 오는 모든것들
    // equals, hashCode도
    // Builder
}
