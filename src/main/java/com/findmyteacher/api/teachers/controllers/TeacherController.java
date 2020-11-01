package com.findmyteacher.api.teachers.controllers;

import com.findmyteacher.api.teachers.models.Teacher;
import com.findmyteacher.api.teachers.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //get all teachers that have made themselves visible
    @GetMapping("/teachers")
    public Set<Teacher> getAllVisibleTeachers() {
        return teacherService.getAllVisibleTeachers();
    }

    //get a single teacher
    @GetMapping("/teachers/{teacherPcn}")
    public Teacher getTeacherByPcn(@PathVariable int teacherPcn){
        return teacherService.getTeacherByPcn(teacherPcn);
    }

    //update an existing teacher (for changing teacher's info or toggling their location visibility)
    @PutMapping("/teachers/{teacherPcn}")
    public void updateTeacher(@PathVariable int teacherPcn, @RequestBody Teacher newTeacher) {
        teacherService.updateTeacher(teacherPcn, newTeacher);
    }

    //update all visible teachers (for updating all locations simultaneously)
    @PutMapping("/teachers")
    public void updateAllVisibleTeachers(@RequestBody Set<Teacher> newTeachers) {
        teacherService.updateTeachers(newTeachers);
    }

    //add a teacher
    @PostMapping("/teachers")
    public void addTeacher(@RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
    }
}
