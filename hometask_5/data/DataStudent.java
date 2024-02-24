package hometask_5.data;

import java.util.ArrayList;
import java.util.List;

import hometask_5.model.Student;
import hometask_5.model.User;
import hometask_5.service.ServiceStudent;

public class DataStudent implements ServiceStudent {
    List<Student> listStudents = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(listStudents.size() + 1);
        listStudents.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return listStudents;
    }
}