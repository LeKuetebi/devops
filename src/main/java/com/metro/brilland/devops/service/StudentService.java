package com.metro.brilland.devops.service;

import com.metro.brilland.devops.dto.Student;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student("Hassan","Ali", "boy"),
                new Student("Mossallam","Moataz", "boy"),
                new Student("Kamga","Gael", "boy"),
                new Student("Wang","Larry", "boy"),
                new Student("Yung","Jing", "boy"),
                new Student("Aodele","Charles", "boy"),
                new Student("","Abissola","girl"),
                new Student("Bhutta","Mewhish","girl"),
                new Student("Jia","Chen", "boy"),
                new Student("Goody","Goody", "boy"),
        new Student("Goody","Goody", "boy"));
    }

    @PostConstruct
    void print(){
        System.out.println("Just constructed");
    }
}
