package com.company.SpringBootStart.controller;


import com.company.SpringBootStart.Entity.Department;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){

    }
}
