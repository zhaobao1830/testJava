package 常用API_08;

/**
 * String和StringBuffer的转换
 */
public class StringTest4 {
    public static void main(String[] args) {
        StringBuffer sb4=  new StringBuffer();
        sb4.append(234);
        String s5 = sb4.toString();
        System.out.println(sb4);
        System.out.println(sb4.toString());
    }
}
