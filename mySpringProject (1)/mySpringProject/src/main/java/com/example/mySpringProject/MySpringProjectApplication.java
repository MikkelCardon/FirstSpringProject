package com.example.mySpringProject;

import com.example.mySpringProject.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MySpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringProjectApplication.class, args);
	}



}
