package 常用API_08.string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 字符串反转
 */
public class StringTest3 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = reverse(s1);
        System.out.println("result："+s2);
    }

//    public static  String reverse(String s) {
//        String ss = "";
//        for(int i=s.length()-1; i>=0; i--) {
//            ss += s.charAt(i);
//        }
//        return ss;
//    }

    public static  String reverse(String s) {
        char[] chs = s.toCharArray();
        for(int start=0,end=chs.length-1; start<=end; start++,end--) {
            char temp = chs[start];
            chs[start] = chs[end];
            chs[end] = temp;
        }
        String ss = new String(chs);
        return ss;
    }
}
