package com.example.studentservice.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "course-service" )
public class CoursesFeignClient {

//    @GetMapping("/api/v1/courses")
//    ResponseEntity<> getCourseForStudent(@PathVariable String studentId);


}
