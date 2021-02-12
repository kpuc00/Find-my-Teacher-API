package com.findmyteacher.api.teachers.services;

import com.findmyteacher.api.teachers.models.Teacher;
import com.findmyteacher.api.teachers.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher getByIPcn(String iPcn) {
        for (Teacher t : this.teacherRepository.getTeachers()) {
            if (t.getiPcn().equals(iPcn))
                return t;
        }
        return null;
    }

    @Async
    public void edit(Teacher teacher) { //create/update teachers
        boolean updated = false; //keep track wether obj in new or exiting

        for (Teacher t: this.teacherRepository.getTeachers()) { //check if obj exists
            if (t.equals(teacher)) {
                this.teacherRepository.getTeachers().remove(t);
                this.teacherRepository.getTeachers().add(teacher);
                updated = true;
                break;
            }
        }

        if (!updated) //add to the end if not exists
            this.teacherRepository.getTeachers().add(teacher);
    }

    @Async
    public void destroy(String iPcn) {
        this.teacherRepository.getTeachers().remove(this.getByIPcn(iPcn));
    }
}
