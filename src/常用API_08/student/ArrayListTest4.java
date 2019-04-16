package 常用API_08.student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 键盘录入数据存储并遍历
 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        // 创建student集合
        ArrayList<Student> arrayList = new ArrayList<Student>();
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);

        for (int x=0; x<arrayList.size(); x++) {
            Student s = arrayList.get(x);
            System.out.println("姓名；"+s.getName()+"----"+"年龄："+s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> arrayList) {
        // 键盘输入姓名和年龄，保存到集合中
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        //创建student对
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        // 把student对象存储到集合中
        arrayList.add(student);
    }
}
