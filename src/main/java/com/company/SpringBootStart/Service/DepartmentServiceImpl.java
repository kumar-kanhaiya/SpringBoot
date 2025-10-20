package com.company.SpringBootStart.Service;


import com.company.SpringBootStart.Entity.Department;
import com.company.SpringBootStart.error.DepartmentNotFoundException;
import com.company.SpringBootStart.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
    public Department fetchDepartmentById(long id) throws DepartmentNotFoundException {

        Optional<Department> department =  repository.findById(id);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department not found");
        }
        return department.get();
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

    @Override
    public Department updateDepartment(long id, Department department) {
        Department depDB = repository.findById(id).get();

        if(Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAdd()) &&
                !"".equalsIgnoreCase(department.getDepartmentAdd())) {
            depDB.setDepartmentAdd(department.getDepartmentAdd());
        }

        return repository.save(depDB);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return repository.findByDepartmentNameIgnoreCase(departmentName);
    }


}
