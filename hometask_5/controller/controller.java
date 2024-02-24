package hometask_5.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hometask_5.data.DataStudyGroup;
import hometask_5.data.DataStudent;
import hometask_5.data.DataTeacher;
import hometask_5.model.StudyGroup;
import hometask_5.model.Student;
import hometask_5.model.Teacher;
import hometask_5.model.User;
import hometask_5.view.StudyGroupView;
import hometask_5.view.StudentView;
import hometask_5.view.TeacherView;

public class controller {
    private final DataStudent dataStudent;
    private final DataTeacher dataTeacher;
    private final DataStudyGroup dataStudyGroup;
    private final StudentView studentView;
    private final TeacherView teacherView;
    private final StudyGroupView studyGroupView;

    public void start() {
        User u1 = new Student(14, "Первый", 4.5);
        User u2 = new Teacher(37, "Первый учитель", "Математика");
        User u3 = new Student(17, "Второй", 4.5);
        User u4 = new Student(15, "Третий", 4.8);
        User u5 = new Teacher(52, "Второй учитель", "Физика");
        createStudent(u1);
        createTeacher(u2);
        createStudent(u3);
        createStudent(u4);
        createTeacher(u5);

        StudyGroup sg1 = new StudyGroup(
                (Teacher) u5,
                new ArrayList<>(Arrays.asList((Student) u1, (Student) u4)));
        createStudyGroup(sg1);

        List<Student> studentList = dataStudent.read();
        List<Teacher> teacherList = dataTeacher.read();
        List<StudyGroup> studyGroupList = dataStudyGroup.read();

        studentView.printListStudents(studentList);
        teacherView.printListTeachers(teacherList);
        studyGroupView.printListStudyGroups(studyGroupList);

    }

    public void createStudent(User student) {
        dataStudent.create(student);
    }

    public void createTeacher(User teacher) {
        dataTeacher.create(teacher);
    }

    public void createStudyGroup(StudyGroup studyGroup) {
        dataStudyGroup.create(studyGroup);
    }

    public controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        dataStudyGroup = new DataStudyGroup();
        studentView = new StudentView();
        teacherView = new TeacherView();
        studyGroupView = new StudyGroupView();
    }
}