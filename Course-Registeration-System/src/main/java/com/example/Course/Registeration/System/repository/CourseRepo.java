package com.example.Course.Registeration.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Course.Registeration.System.model.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course,String> {

}
