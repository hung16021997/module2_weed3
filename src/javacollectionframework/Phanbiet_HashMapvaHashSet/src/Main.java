package javacollectionframework.Phanbiet_HashMapvaHashSet.src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Huân",21,"HN");
        Student student2 = new Student("Hiếu",25,"Vinh");
        Student student3 = new Student("Thường",25,"Thanh Chương");
        Student student4 = new Student("Bình",23,"Ninh Bình");
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
