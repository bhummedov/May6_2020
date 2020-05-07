package Sorting;

import java.util.LinkedList;
import java.util.Queue;

public class QueueNames {
    public static void main(String[] args) {
        Queue<String> myQue = new LinkedList<>();
        myQue.add("John");
        myQue.add("Mary");
        myQue.add("Chris");
        System.out.println(myQue);
        myQue.remove("John");
        System.out.println(myQue);
        myQue.remove("Mary");
        System.out.println(myQue);
    }
}
