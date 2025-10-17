package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // Map<Key타입, Value타입>
        Map<String, String> map = new HashMap<>();

        // 추가 put
        map.put("1", "사과");
        map.put("2", "배");
        map.put("3", "수박");
        map.put("4", "메론");

        // 조회
        String value = map.get("1");
        System.out.println(value);

        // 전체 조회
        // key 값을 iterator 구조로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
