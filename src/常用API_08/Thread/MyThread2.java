package 常用API_08.Thread;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +":"+ i);
        }
    }
}
