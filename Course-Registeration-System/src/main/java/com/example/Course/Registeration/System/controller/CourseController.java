package com.example.Course.Registeration.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.Registeration.System.model.Course;
import com.example.Course.Registeration.System.model.CourseRegistry;
import com.example.Course.Registeration.System.service.CourseService;

import java.util.*;

@RestController
@CrossOrigin(origins="*")
public class CourseController {
	@Autowired
	CourseService courseService;
	@GetMapping("courses")
	public List<Course> availableCourses(){
		return courseService.availableCourses();
	}
	
	@GetMapping("courses/enrolled")
	public List<CourseRegistry> enrolledStudnets(){
		return courseService.enrolledStudent();
		
	}
	@PostMapping("/courses/register")
	public String enrollCourse(@RequestParam("name") String name,
			@RequestParam("emailId") String emailId,
			@RequestParam("courseName") String courseName) {
		courseService.enrollCourse(name,emailId,courseName);
				return "Congratulations! "+name+" Enrollement Succesfuk for "+courseName;
						

}
}
