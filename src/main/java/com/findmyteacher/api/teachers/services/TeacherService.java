package com.findmyteacher.api.teachers.services;

import com.findmyteacher.api.teachers.models.Teacher;
import com.findmyteacher.api.teachers.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Set<Teacher> getAllVisibleTeachers(){
        Set<Teacher> teachers = new HashSet<>();
        for (Teacher teacher: teacherRepository.getTeachers()) {
            if(teacher.isVisible()){
                teachers.add(teacher);
            }
        }
        return teachers;
    }

    public Teacher getTeacherByPcn(int pcn){
        for (Teacher teacher: teacherRepository.getTeachers()) {
            if(teacher.getPcn() == pcn){
                return teacher;
            }
        }
        return null;
    }

    public void updateTeacher(int pcn, Teacher newTeacher){
        Teacher oldTeacher = getTeacherByPcn(pcn);
        Set<Teacher> teachers = teacherRepository.getTeachers();
        teachers.remove(oldTeacher);
        teachers.add(newTeacher);
        teacherRepository.setTeachers(teachers);
    }

    public void updateTeachers(Set<Teacher> newTeachers){
        Set<Teacher> teachers = teacherRepository.getTeachers();

        Teacher[] newTeachersArray = new Teacher[newTeachers.size()];
        newTeachersArray = newTeachers.toArray(newTeachersArray);

        for (int i = 0; i <= newTeachers.size(); i++) {
            teachers.remove(getTeacherByPcn(newTeachersArray[i].getPcn()));
            teachers.add(newTeachersArray[i]);
        }

        teacherRepository.setTeachers(teachers);
    }

    public void addTeacher(Teacher teacher){
        Set<Teacher> teachers = teacherRepository.getTeachers();
        teachers.add(teacher);
        teacherRepository.setTeachers(teachers);
    }
}
