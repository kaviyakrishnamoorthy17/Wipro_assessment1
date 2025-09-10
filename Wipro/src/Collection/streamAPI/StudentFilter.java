package Collection.streamAPI;

import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Anil", 45));
        students.add(new Student(102, "Bina", 67));
        students.add(new Student(103, "Charan", 88));
        students.add(new Student(104, "Dina", 50));
        students.add(new Student(105, "Emma", 39));

        ArrayList<Student> cleared = new ArrayList<>();
        for (Student s : students) {
            if (s.mark >= 50) {
                cleared.add(s);
            }
        }

        System.out.println("Students cleared the test:");
        for (Student s : cleared) {
            System.out.println(s.rollNo + " " + s.name + " " + s.mark);
        }
        System.out.println("Total cleared: " + cleared.size());
    }
}
