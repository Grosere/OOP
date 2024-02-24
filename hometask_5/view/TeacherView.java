package hometask_5.view;

import java.util.List;

import hometask_5.model.Teacher;

public class TeacherView {
    public void printListTeachers(List<Teacher> listTeachers) {
        System.out.println("All teachers: ");
        for (Teacher teacher : listTeachers) {
            System.out.println(teacher);
        }
        System.out.println();
    }
}