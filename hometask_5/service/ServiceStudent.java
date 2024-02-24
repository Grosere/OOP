package hometask_5.service;

import java.util.List;

import hometask_5.model.Student;
import hometask_5.model.User;

public interface ServiceStudent {
    Student create(User user);

    List<Student> read();
}
