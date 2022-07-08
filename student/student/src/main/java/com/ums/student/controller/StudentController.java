package com.ums.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/")
    String Welcome(){
        return "welcome";
    }
}
