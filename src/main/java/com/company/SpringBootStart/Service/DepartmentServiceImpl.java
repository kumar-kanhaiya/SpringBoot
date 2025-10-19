package com.company.SpringBootStart.Service;


import com.company.SpringBootStart.Entity.Department;
import com.company.SpringBootStart.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;


    @Override
    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return repository.findAll();
    }

    @Override
    public Department fetchDepartmentById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public String deleteDepartmentById(long id) {
        if(repository.findById(id)!= null){
            repository.deleteById(id);
            return "Successfully deleted from database";
        }
        else{
            return "id does not place in database";
        }
    }
}
