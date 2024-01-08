package com.example.studentservice.services;

import com.example.studentservice.entities.Student;
import com.example.studentservice.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public Student saveStudent(Student student) {
       return  studentRepo.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    public List<Student> findAllStudentsByCourse(String id){
        return studentRepo.findByCourseId(id);
    }

}
