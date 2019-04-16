package 常用API_08.string;

import java.util.Scanner;

/**
 * 模拟登陆
 */
public class StringLoginDemo {
    public static void main(String[] args) {
        String username = "admin";
        String userpassword = "admin";

        for (int x=0; x<3; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();

            if(username.equals(name)&&userpassword.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                if((2-x)==0) {
                    System.out.println("用户名和密码被锁定,请与管理员联系！");
                } else {
                    System.out.println("登录失败，你还有次"+(2-x)+"机会");
                }
            }
        }
    }
}
