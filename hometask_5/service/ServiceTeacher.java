package hometask_5.service;

import java.util.List;

import hometask_5.model.Teacher;
import hometask_5.model.User;

public interface ServiceTeacher {
    Teacher create(User user);

    List<Teacher> read();
}
