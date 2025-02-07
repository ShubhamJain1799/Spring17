package com.example.EmployeeMS.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetLearner {
    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello World";
    }
}
