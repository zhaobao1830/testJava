package 常用API_08;

/**
 * 字符串对象构造方法创建和直接赋值
 */
public class StringDemo {
    public static void main(String[] args) {
        // 把字符串数据封装成字符串对象
//        String s1 = new String("hello");
//        System.out.println("s1:" + s1);

        // 把字符数组封装成字符串对象
        char[] chs = {'h', 'e', 'l', 'l', '0'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        // 把字符数组总的一部分数据封装成字符串对象
        String s3 = new String(chs, 1, chs.length - 1);
        System.out.println("s3:" + s3);

        // 直接创建String对象
        String s4 = "abc";
        System.out.println("s4:" + s4);
    }
}
