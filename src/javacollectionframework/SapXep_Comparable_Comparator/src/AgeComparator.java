package javacollectionframework.SapXep_Comparable_Comparator.src;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()>o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Hiếu",25,"Vinh");
        Student student1 = new Student("Nam",24,"Hưng Nguyên");
        Student student2 = new Student("Mạnh",26,"Tân Kỳ");
        Student student3 = new Student("Béo",30,"Hưng Nguyên");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);//sắp sếp theo chữ cái đầu của tên
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sánh theo tuổi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
