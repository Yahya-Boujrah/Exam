package com.example.coursesservice.dtos;

import com.example.coursesservice.entities.Course;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {

    private String name;
    private List<StudentDto> students;
}
