package 常用API_08.student;

import java.util.ArrayList;

/**
 * 存储自定义对象并遍历
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        // 创建student集合
        ArrayList<Student> arrayList = new ArrayList<Student>();

        // 创建student对象
        Student stu1 = new Student("zb1", 20);
        Student stu2 = new Student("zb3", 21);
        Student stu3 = new Student("zb4", 22);

        // 把学生对象作为元素添加到集合中
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        for (int x=0; x<arrayList.size(); x++) {
            System.out.println("姓名："+arrayList.get(x).getName()+"-----"+"年龄："+arrayList.get(x).getAge());
        }
    }
}
