package 常用API_08.student;

import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        // 创建学生数组
        Student[] students = new Student[3];

        // 创建学生对象
        Student s1 = new Student("zb1", 20);
        Student s2 = new Student("zb2", 21);
        Student s3 = new Student("zb3", 22);

        // 把学生对象作为元素赋值给学生数组
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int x=0; x<students.length; x++) {
            System.out.println(students[x].getName());
        }
    }
}
