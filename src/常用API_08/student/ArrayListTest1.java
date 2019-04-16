package 常用API_08.student;

import java.util.*;

/**
 * 集合的各种方法
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
//        int[] i = new int[3];
//        i[0] = 1;
//        i[1] = 2;
//        i[2] = 3;
//        for (int x=0; x<i.length; x++) {
//            System.out.println(i[x]);
//        }
//        Integer[] arr1 = {1, 2, 3};
//        List<Integer> list = Arrays.asList(arr1);
//        System.out.println(list);
   //     ArrayList arrayList = new ArrayList(3);

//        Set set = new HashSet();
//        set.add(1);
//        set.add("a");
//        set.add(1);
//        System.out.println(set);

        List list = new ArrayList();
        list.add(1);
        list.add("a");
        list.add(1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(0, "aaaa");
        System.out.println(list);
        System.out.println(list.listIterator());
    }
}
