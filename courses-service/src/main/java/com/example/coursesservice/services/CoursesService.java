package com.example.coursesservice.services;

import com.example.coursesservice.dtos.CourseDto;
import com.example.coursesservice.dtos.StudentDto;
import com.example.coursesservice.entities.Course;
import com.example.coursesservice.feignClient.StudentFeignClient;
import com.example.coursesservice.repo.CoursesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CoursesService {

    private final CoursesRepo courseRepo;
    private final StudentFeignClient client;

    public Course saveCourse(Course course) {
        return  courseRepo.save(course);
    }

    public List<Course> findAllCourses() {
        return courseRepo.findAll();
    }

    public CourseDto findAllStudentsByCourse(UUID id) {
        Course course = courseRepo.findById(id).orElseThrow();

        List<StudentDto> students = client.findAllStudentsByCourse(id);
        return CourseDto.builder()
                .name(course.getName())
                .students(students)
                .build();
    }

}
