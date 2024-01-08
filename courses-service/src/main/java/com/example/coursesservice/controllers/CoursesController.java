package com.example.coursesservice.controllers;


import com.example.coursesservice.dtos.CourseDto;
import com.example.coursesservice.entities.Course;
import com.example.coursesservice.repo.CoursesRepo;
import com.example.coursesservice.services.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CoursesController {

    private final CoursesService coursesService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Course> save(
            @RequestBody Course course
    ) {
        return ResponseEntity.ok(coursesService.saveCourse(course));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Course>> findAllCourses() {
        return ResponseEntity.ok(coursesService.findAllCourses());
    }


    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> findAllCoursesWithStudent(
            @PathVariable UUID id
    ) {
        return ResponseEntity.ok(coursesService.findAllStudentsByCourse(id));
    }
}
