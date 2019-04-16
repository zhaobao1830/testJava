package 常用API_08.string;

/**
 * String的获取功能
 */
public class StringMethodsDemo_02 {
    public static void main(String[] args) {
        String s1 = "abcd";
        System.out.println("s1的长度："+s1.length());
        System.out.println("b在s1的位置："+s1.indexOf("b"));
        String s2 = s1.substring(0, 2);
        System.out.println("我是s2："+s2);
        System.out.println("我是新的s1："+s1);
    }
}
