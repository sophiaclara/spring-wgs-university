package com.example.wgsuniversity.repository;

import com.example.wgsuniversity.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
