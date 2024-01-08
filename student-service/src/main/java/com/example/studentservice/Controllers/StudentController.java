package com.example.studentservice.Controllers;

import com.example.studentservice.entities.Student;
import com.example.studentservice.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> save(
            @RequestBody Student student
    ) {
        return ResponseEntity.ok(service.saveStudent(student));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(service.findAllStudents());
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Student>> findAllStudentsByCourse(@PathVariable String id){
        return ResponseEntity.ok(service.findAllStudentsByCourse(id));
    }
}
