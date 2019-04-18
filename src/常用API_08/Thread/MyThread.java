package 常用API_08.Thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() +":"+ i);
        }
    }
}
