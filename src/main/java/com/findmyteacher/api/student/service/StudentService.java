package com.findmyteacher.api.student.service;

import com.findmyteacher.api.student.model.Student;
import com.findmyteacher.api.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getByIPcn(String iPcn) {
        return this.studentRepository.findById(iPcn).orElse(null);
    }

    public void edit(Student student) {
        this.studentRepository.save(student);
    }

    public void destroy(String iPcn) {
        this.studentRepository.deleteById(iPcn);
    }

}
