package 常用API_08;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();  // 使用构造函数StringBuffer创建一个StringBuffer对象
        System.out.println("sb.capacity()："+sb.capacity()); // 16 理论值
        System.out.println("sb.length()："+sb.length()); // 0 实际值
    }
}
