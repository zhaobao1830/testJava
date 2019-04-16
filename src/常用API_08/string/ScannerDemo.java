package 常用API_08.string;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据:");

        // 接收数据
        String s = sc.nextLine();

        // 输出结果
        System.out.println("s:" + s);
    }
}
