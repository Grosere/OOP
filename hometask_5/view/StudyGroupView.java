package hometask_5.view;

import hometask_5.model.StudyGroup;

import java.util.List;

public class StudyGroupView {
    public void printListStudyGroups(List<StudyGroup> listStudyGroup) {
        System.out.println("All study group: ");
        for (StudyGroup studyGroup : listStudyGroup) {
            System.out.println(studyGroup);
        }
        System.out.println();
    }
}