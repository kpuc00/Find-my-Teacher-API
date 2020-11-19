package com.findmyteacher.api.teachers.repositories;

import com.findmyteacher.api.teachers.models.Teacher;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class TeacherRepository {

    private final Set<Teacher> teachers = new HashSet<>();

    public Set<Teacher> getTeachers() {
        return teachers;
    }

}
