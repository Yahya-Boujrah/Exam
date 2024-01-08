package com.example.coursesservice.feignClient;

import com.example.coursesservice.dtos.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentFeignClient {

    @GetMapping("/api/v1/students/{id}")
    List<StudentDto> findAllStudentsByCourse(@PathVariable UUID id);


}
