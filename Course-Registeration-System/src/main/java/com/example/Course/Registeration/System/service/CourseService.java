package com.example.Course.Registeration.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Course.Registeration.System.model.Course;
import com.example.Course.Registeration.System.model.CourseRegistry;
import com.example.Course.Registeration.System.repository.CourseRegistryRepo;
import com.example.Course.Registeration.System.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
	public List<Course> availableCourses() {
		
		return courseRepo.findAll();
	}
	public List<CourseRegistry> enrolledStudent() {
		
		return courseRegistryRepo.findAll();
	}
	public void enrollCourse(String name, String emailId, String courseName) {
		CourseRegistry courseRegistry =new CourseRegistry(name,emailId, courseName);
		courseRegistryRepo.save(courseRegistry);
	}

}
