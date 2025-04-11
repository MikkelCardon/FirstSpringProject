package com.example.mySpringProject.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Mikkel",
                "mik@mail.com",
                LocalDate.of(2002, 5, 17),
                21));
    }

}
