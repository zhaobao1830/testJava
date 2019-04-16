package 常用API_08.string;

import javafx.concurrent.ScheduledService;

import java.util.Scanner;

/**
 * 首字母大写，其余小写
 */
public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = sc.nextLine();
        String s2 = s1.substring(0, 1);
        String s3 = s1.substring(1);
        String s4 = s2.toUpperCase() + s3.toLowerCase();
        System.out.println("首字母大写，其他小写："+s4);
    }
}
