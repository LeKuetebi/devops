package com.metro.brilland.devops.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = StudentController.class)
class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getStudents() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/students"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("pages/students"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("students"))
                .andReturn()
                .getModelAndView();
    }
}