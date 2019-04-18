package 常用API_08.setmap;

import org.omg.CORBA.MARSHAL;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("z", "zz");
        map.put("b", "bb");
        map.put("c", "cc");

        // 第一种循环
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(map.get(key));
//        }

        // 第二种循环
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
    }
}
