package hometask_5.service;

import java.util.List;

import hometask_5.model.StudyGroup;

public interface ServiceStudyGroup {
    StudyGroup create(StudyGroup studyGroup);

    List<StudyGroup> read();

    List<Integer> readAllGroupMembersId(StudyGroup studyGroup);
}