package com.findmyteacher.api.student.controller;

import com.findmyteacher.api.student.model.Student;
import com.findmyteacher.api.student.service.StudentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{iPcn}/favourites")
    public ResponseEntity<Student> getByIPcn(@PathVariable String iPcn) {
        return ResponseEntity.ok(this.studentService.getByIPcn(iPcn));
    }

    @PutMapping("/edit/favourites")
    public void edit(@RequestBody Student student) {
        this.studentService.edit(student);
    }

    @DeleteMapping("/delete/{iPcn}/favourites")
    public void delete(@PathVariable String iPcn) {
        this.studentService.destroy(iPcn);
    }
}
