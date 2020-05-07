package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IdSorting implements Comparator<Student> {
    public int compare(Student st1, Student st2) {
        if (st1.id == st2.id) {
            return 0;
        } else if (st1.id > st2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}
