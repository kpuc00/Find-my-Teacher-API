package com.findmyteacher.api.student.repository;

import com.findmyteacher.api.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
