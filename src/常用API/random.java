package 常用API;

import java.util.Random;

/**
 *  08 java常用API 总结
 */
public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int randomVal = random.nextInt(100);
        System.out.println(randomVal);
    }
}
