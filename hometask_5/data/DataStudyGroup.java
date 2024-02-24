package hometask_5.data;

import java.util.ArrayList;
import java.util.List;

import hometask_5.model.StudyGroup;
import hometask_5.service.ServiceStudyGroup;

public class DataStudyGroup implements ServiceStudyGroup {
    List<StudyGroup> listStudyGroup = new ArrayList<>();

    @Override
    public StudyGroup create(StudyGroup studyGroup) {
        studyGroup.setStudyGroupId(listStudyGroup.size() + 1);
        listStudyGroup.add(studyGroup);
        return studyGroup;
    }

    @Override
    public List<StudyGroup> read() {
        return listStudyGroup;
    }

    @Override
    public List<Integer> readAllGroupMembersId(StudyGroup studyGroup) {
        return studyGroup.getAllGroupMembersId();
    }
}