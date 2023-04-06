package io.student.studentmanagement.service;

import io.student.studentmanagement.entity.Student;
import io.student.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAllAndIsNotDeleted();
    }

    public Student getStudent(int id){
        return studentRepository.findByIdAndIsNotDeleted(id);
    }

    public Student addStudent(Student student){
        student.setStudentId(0);
        return studentRepository.save(student);
    }

    public void deleteStudent(int id){
        Student student  = studentRepository.findById(id).get();
        student.setDeleted(true);
        studentRepository.save(student);
    }
}
