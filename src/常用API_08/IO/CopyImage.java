package 常用API_08.IO;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * 使用字节和字符流赋值图片
 * 结论：二进制文件只能由字节流传输，包括：图片、视频、音频
 * 文本文件既可以使用字节流，也可以使用字符流
 * 为什么字节流不能复制二进制文件，因为字符流在复制的时候，会对字节进行合并，有的俩个字节
 * 合并成一个字符，有的三个字节合并成一个字符，在这个过程中，会丢失字节
 */
public class CopyImage {
    public static void main(String[] args) throws IOException {
        copyImageByByte();
    }


    // 使用字节流复制图片
    private static void copyImageByByte() throws FileNotFoundException, IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\图片\\若菜奈央__02.png");
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("E:\\若菜奈央__02.png");

        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }

    // 使用字符流复制图片
    private static void copyImageByChar() throws FileNotFoundException, IOException {
        // 创建字符输入流对象
        FileReader fr = new FileReader("E:\\图片\\若菜奈央__02.png");

        // 创建字符输出流对象
        FileWriter fw = new FileWriter("E:\\若菜奈央__02.png");

        // 一次读写一个字符数组
        int len;
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars, 0, len);
            fw.flush();
        }

        // 释放资源
        fw.close();
        fr.close();
    }
}
