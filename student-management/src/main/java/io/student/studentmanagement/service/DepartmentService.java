package io.student.studentmanagement.service;

import io.student.studentmanagement.entity.Department;
import io.student.studentmanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department>  allDepartments(){
        return departmentRepository.findAll();
    }

    public Department getDepartment(int id){
        return departmentRepository.findById(id).get();
    }

    public Department addDepartment(Department department){
        department.setDepartmentId(0);
        return departmentRepository.save(department);
    }

    public void deleteDepartment(int id){
        departmentRepository.deleteById(id);
    }


}
