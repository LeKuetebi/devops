package com.metro.brilland.devops.controller;

import com.metro.brilland.devops.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students", studentService.getStudents());
        return "pages/students";
    }

    @GetMapping("/")
    public String home(Model model){
        return "/students";
    }
}
