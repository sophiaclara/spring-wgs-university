package com.example.wgsuniversity.repository;

import com.example.wgsuniversity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
