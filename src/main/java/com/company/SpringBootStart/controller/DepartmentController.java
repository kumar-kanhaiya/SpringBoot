package com.company.SpringBootStart.controller;


import com.company.SpringBootStart.Entity.Department;
import com.company.SpringBootStart.Service.DepartmentService;
import com.company.SpringBootStart.Service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger logger =
            LoggerFactory.getLogger(DepartmentController.class);


    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        logger.info("Inside save department of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        logger.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();

    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id")  long id){
        return departmentService.fetchDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") long id ){
        return departmentService.deleteDepartmentById(id);
    }

    @PutMapping("departments/{id}")
    public Department updateDepartment(@PathVariable("id") long id
            ,@RequestBody Department department ){
        return departmentService.updateDepartment(id,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
