package 常用API_08.Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        // 创建线城实例
        MyThread myThread = new MyThread();
        // 启动线程
        myThread.run();

        MyThread myThread2 = new MyThread();
        myThread2.setName("zb");
        // 启动线程
        myThread2.run();
    }
}
