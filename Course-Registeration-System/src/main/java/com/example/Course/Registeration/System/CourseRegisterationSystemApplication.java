
package com.example.Course.Registeration.System;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Course.Registeration.System.model.Course;
import com.example.Course.Registeration.System.repository.CourseRepo;

@SpringBootApplication
public class CourseRegisterationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseRegisterationSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner loadCourses(CourseRepo courseRepo) {

        return args -> {

            System.out.println("===== DATA LOADER IS RUNNING =====");

            if (courseRepo.count() == 0) {

                courseRepo.save(new Course(
                    "C101",
                    "Java",
                    "John",
                    6
                ));

                courseRepo.save(new Course(
                    "C102",
                    "Python",
                    "David",
                    8
                ));

                courseRepo.save(new Course(
                    "C103",
                    "SQL",
                    "Smith",
                    5
                ));

                courseRepo.save(new Course(
                    "C104",
                    "Web Development",
                    "Alex",
                    7
                ));

                System.out.println("===== COURSES INSERTED =====");

            } else {

                System.out.println("===== COURSES ALREADY EXIST =====");
            }
        };
    }
}

