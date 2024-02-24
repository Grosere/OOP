package hometask_5.view;

import java.util.List;

import hometask_5.model.Student;

public class StudentView {
    public void printListStudents(List<Student> listStudents) {
        System.out.println("All students: ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        System.out.println();
    }
}
