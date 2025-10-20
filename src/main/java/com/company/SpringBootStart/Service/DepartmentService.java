package com.company.SpringBootStart.Service;

import com.company.SpringBootStart.Entity.Department;
import com.company.SpringBootStart.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {


    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(long id) throws DepartmentNotFoundException;

    public String deleteDepartmentById(long id);

    public Department updateDepartment(long id, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
