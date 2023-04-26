package io.student.studentmanagement.controller;

import io.student.studentmanagement.dto.DepartmentDto;
import io.student.studentmanagement.entity.Department;
import io.student.studentmanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping
    public List<DepartmentDto> allDepartment(){
        return departmentService.allDepartments();
    }
    @GetMapping("/{id}")
    public DepartmentDto getDepartment(@PathVariable int id){
        return departmentService.getDepartment(id);
    }

    @PostMapping
    public DepartmentDto addDepartment(@RequestBody DepartmentDto department){
        return departmentService.addDepartment(department);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable int id){
        departmentService.deleteDepartment(id);
    }
}
