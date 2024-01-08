package com.example.studentservice.repo;

import com.example.studentservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentRepo  extends JpaRepository<Student, UUID> {
    public List<Student> findByCourseId(String id);
}
