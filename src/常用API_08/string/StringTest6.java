package 常用API_08.string;

/**
 * 字符串反转
 * String--StringBuffer-reverse--toStirng
 */
public class StringTest6 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        StringBuffer sb1 = new StringBuffer(s1);
        String s2 = sb1.reverse().toString();
        System.out.println(s2);
    }
}
