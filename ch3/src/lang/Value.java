package lang;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // obj
        // obj가 Value의 instance인지 여부 확인 후 형변환
        if (obj instanceof Value) {
            Value v = (Value) obj; // 강제 형변환 -> ClassCastException 발생 가능
            if (this.value == v.value) {
                return true;
            }
        }
        return false;
    }

    // String -> int : Integer.parseInt("123")
    // int를 string으로 바꿔서 return : 쌍따옴표 붙이면 됨
    @Override
    public String toString() {
        return value + "";
    }

}
