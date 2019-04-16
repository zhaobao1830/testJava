package 常用API_08.studentnew;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理系统
 * 步骤如下：
 *  1、创建学生类
 *  2、主页面编码
 *  3、查询所有学生
 *  4、添加学生
 *  5、修改学生
 *  6、删除学生
 */
public class StudentManagerTest {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        while (true) {
            // 这是学生管理的主页面
            System.out.println("----关于进入学生管理系统----");
            System.out.println("1、查看所有学生");
            System.out.println("2、添加学生");
            System.out.println("3、修改学生");
            System.out.println("4、删除学生");
            System.out.println("5、退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    // 查看学生
                    findAllStudent(arrayList);
                    break;
                case "2":
                    // 添加学生
                    addStudent(arrayList);
                    break;
                case "3":
                    // 修改学生
                    break;
                case "4":
                    // 删除学生
                    break;
                case "5":
                    // 退出
                default:
                    System.out.println("谢谢使用！");
                    System.exit(0); // jvm退出
                    break;
            }
        }
    }

    // 查询所有学生
    public static void findAllStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("暂时没有数据，请重新选择你的操作！");
        } else {
            System.out.println("学号\t姓名\t年龄\t居住地");
            for (int x=0; x<arrayList.size(); x++) {
                Student s = arrayList.get(x);
                System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getAddress());
            }
        }
    }

    // 添加学生
    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = scanner.nextLine();
        if (findStudentBy(arrayList, id)) {
            System.out.println("请输入姓名");
            String name = scanner.nextLine();
            System.out.println("请输入年龄");
            String age = scanner.nextLine();
            System.out.println("请输入地址");
            String adress = scanner.nextLine();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            student.setAddress(adress);

            arrayList.add(student);

            System.out.println("添加学生成功！");
        } else {
            System.out.println("学号重复，请重新输入！");
        }
    }

    // 判断学号有没有被占用
    public static boolean findStudentBy(ArrayList<Student> arrayList, String id) {
        boolean flag = false;
        for (int x=0; x<arrayList.size(); x++) {
            Student s = arrayList.get(x);
            if (s.getId().equals(id)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}

