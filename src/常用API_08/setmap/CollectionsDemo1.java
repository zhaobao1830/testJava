package 常用API_08.setmap;

import java.util.ArrayList;

/**
 * 模拟斗地主发牌
 */
public class CollectionsDemo1 {
    public static void main(String[] args) {
        String[] arr1 = {"黑桃", "红桃", "方块", "梅花"};
        String[] arr2 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        ArrayList<String> arrayList = new ArrayList<String>();

        for (int x=0; x<arr1.length; x++) {
            for (int y=0; y<arr2.length; y++) {
                arrayList.add(arr1[x]+arr2[y]);
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");
        System.out.println(arrayList);

        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<String> s2 = new ArrayList<String>();
        ArrayList<String> s3 = new ArrayList<String>();

        for (int z=0; z<arrayList.size()-3; z++) {
            /**
             * 0%3 0
             * 1%3 1
             * 2%3 2
             * 3%3 0
             * 4%3 1
             * 5%3 2
             */
            if (z%3 == 0) {
                s1.add(arrayList.get(z));
            } else if (z%3 == 1) {
                s2.add(arrayList.get(z));
            } else if (z%3 == 2) {
                s3.add(arrayList.get(z));
            }
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
