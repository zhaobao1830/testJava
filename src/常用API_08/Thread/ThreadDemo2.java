package 常用API_08.Thread;

// 创建多线程的第二种方式
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread t = new Thread(myThread2);
        t.start();
    }
}
