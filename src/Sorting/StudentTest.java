package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(10);
        students.add(new Student(100, "Vahit", 15));
        students.add(new Student(101, "Ismayil", 12));
        students.add(new Student(102, "Sibel", 8));
        students.add(new Student(103, "Birsen", 14));
        Collections.sort(students, new AgeSorting());
        Collections.sort(students, new IdSorting());
        Collections.sort(students, new NameSorting());
        for (Student st : students) {
            System.out.println(st.id + "\t" + st.name + "\t" + st.age);
        }
    }
}
