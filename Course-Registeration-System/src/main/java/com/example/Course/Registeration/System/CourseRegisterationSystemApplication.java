package com.example.Course.Registeration.System;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Course.Registeration.System.model.Course;
import com.example.Course.Registeration.System.repository.CourseRepository;

@SpringBootApplication
public class CourseRegistrationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseRegistrationSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner loadCourses(CourseRepository repository) {

        return args -> {

            if (repository.count() == 0) {

                repository.save(new Course(
                    "C101",
                    "Java",
                    "John",
                    6
                ));

                repository.save(new Course(
                    "C102",
                    "Python",
                    "David",
                    8
                ));

                repository.save(new Course(
                    "C103",
                    "SQL",
                    "Smith",
                    5
                ));

                repository.save(new Course(
                    "C104",
                    "Web Development",
                    "Alex",
                    7
                ));

            }
        };
    }
}
