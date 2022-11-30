package com.metro.brilland.devops.service;

import com.metro.brilland.devops.dto.Student;
import org.springframework.stereotype.Service;

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
                new Student("Adeyomoye","Abissola","girl"),
                new Student("Bhutta","Mewhish","girl"),
                new Student("Jia","Chen", "boy"),
      //          new Student("Brilland","Tago", "boy"),
                new Student("Tabi","Godwill", "boy"));
    }

}
