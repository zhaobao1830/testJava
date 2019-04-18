package 常用API_08.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        // 创建字符输入流对象
        FileReader fr = new FileReader("E:\\IODemo1.java");
        // 创建字符输出六对象
        FileWriter fw = new FileWriter("E:\\IODemo.java");

        // 一次读写一个字符
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            fw.write(ch);
//            fw.flush();  // 刷新
//        }

        // 一次读一个字符数组
        int len;
        char[] chs = new char[1024];
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }

        // 释放资源
        fw.close();
        fr.close();
    }
}
