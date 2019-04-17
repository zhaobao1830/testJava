package 常用API_08.setmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("001", "zb");
        map.put("002", "zb1");
        System.out.println(map);
        System.out.println(map.containsKey("003"));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
