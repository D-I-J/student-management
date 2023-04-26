package io.student.studentmanagement.controller;

import io.student.studentmanagement.dto.StudentDto;
import io.student.studentmanagement.entity.Student;
import io.student.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<StudentDto> allStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @PostMapping
    public StudentDto addStudent(@RequestBody StudentDto student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }

}
