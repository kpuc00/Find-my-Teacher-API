package com.findmyteacher.api.teachers.controllers;

import com.findmyteacher.api.teachers.models.Teacher;
import com.findmyteacher.api.teachers.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //return teacher by IPcn
    @GetMapping("/{iPcn}/location")
    public ResponseEntity<Teacher> getByIPcn(@PathVariable String iPcn) {
        return ResponseEntity.ok(this.teacherService.getByIPcn(iPcn));
    }

    //create/update teacher
    @PutMapping("/edit/location")
    public void edit(@RequestBody Teacher teacher) {
        this.teacherService.edit(teacher);
    }

    //delete teacher
    @DeleteMapping("/delete/{iPcn}/location")
    public void destroy(@PathVariable String iPcn) {
        this.teacherService.destroy(iPcn);
    }
}
