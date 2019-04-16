package 常用API_08;

/**
 * 把数组拼接成一个字符串
 * 借用了StringBuffer的append方法
 */
public class StringTest5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        StringBuffer sb = new StringBuffer();

        sb.append("[");
        for (int i=0; i<arr.length; i++) {
           if (i == arr.length-1) {
               sb.append(arr[i]);
           } else {
               sb.append(arr[i]).append(", ");
           }
        }
        sb.append("]");
        return sb.toString();
    }
}
