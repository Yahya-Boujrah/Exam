package com.example.coursesservice.repo;

import com.example.coursesservice.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoursesRepo extends JpaRepository<Course, UUID> {
}
