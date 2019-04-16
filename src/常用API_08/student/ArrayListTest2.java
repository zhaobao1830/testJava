package 常用API_08.student;

import java.util.ArrayList;

/**
 * 获取满足要求的元素
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        // 定义字符串数组
        String[] strArray = {"张三丰", "张无忌", "周芷若", "灭绝师太"};

        // 创建集合对象
        ArrayList<String> arrayList = new ArrayList<String>();

        // 遍历字符串数组，给集合赋值
        for (int x=0; x<strArray.length; x++) {
            arrayList.add(strArray[x]);
        }

        // 遍历集合，获取符合条件的值
        for (int y=0; y<arrayList.size(); y++) {
            String s = arrayList.get(y);
            if (s.startsWith("张")) {
                System.out.println(s);
            }
        }
    }
}
