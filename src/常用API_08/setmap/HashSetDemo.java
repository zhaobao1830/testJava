package 常用API_08.setmap;

import java.util.HashSet;
import java.util.Set;

/**
 * 往set里保存String类型，同样的值，不会被保存进去
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");

        // foreach遍历
//        for (String val : set) {
//            System.out.println(val);
//        }

        // 转换成数组然后遍历
        Object[] objs = set.toArray();
        for (int x=0; x<objs.length; x++) {
            System.out.println(objs[x]);
        }
    }
}
