package 常用API_08;

/**
 * String的对比方法
 */
public class StringMethodsDemo_01 {
    /**
     * String
     * equals和==的区别
     * 比较基本数据类型 用==；
     * 引入数据类型的话：==比较堆内存地址是否相同；equals比较内容是否相同
     * boolean equals(Object obj)：比较字符串的内容是否相同
     */
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}
