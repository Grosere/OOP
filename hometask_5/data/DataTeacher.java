package hometask_5.data;

import java.util.ArrayList;
import java.util.List;

import hometask_5.model.Teacher;
import hometask_5.model.User;
import hometask_5.service.ServiceTeacher;

public class DataTeacher implements ServiceTeacher {
    List<Teacher> listTeachers = new ArrayList<>();

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherId(listTeachers.size() + 1);
        listTeachers.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return listTeachers;
    }
}