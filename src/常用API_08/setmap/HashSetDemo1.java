package 常用API_08.setmap;

import java.util.HashSet;

/**
 * 把Student对象保存到set里
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        // 创建HashSet集合对象
        HashSet<Student> hs = new HashSet<Student>();
        //创建student对象
        Student s = new Student(20, "zb");
        Student s1 = new Student(21, "zb1");
        Student s2 = new Student(21, "zb1");

        //添加袁术对象
        hs.add(s);
        hs.add(s1);
        hs.add(s2);

        // 遍历集合
        for (Student student : hs) {
            System.out.println(student);
        }
    }
}
