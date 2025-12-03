package stream;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optVal = Optional.of("abri");
        String str1 = optVal.get();
        String str2 = optVal.orElse("");
        String str3 = optVal.orElseGet(String::new);
        String str4 = optVal.orElseThrow();
    }
}
