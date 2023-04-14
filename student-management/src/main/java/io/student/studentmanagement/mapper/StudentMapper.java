package io.student.studentmanagement.mapper;

import io.student.studentmanagement.dto.StudentDto;
import io.student.studentmanagement.entity.Student;
import org.springframework.stereotype.Component;


@Component
public class StudentMapper {

    public StudentDto mapTODto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentId(student.getStudentId());
        studentDto.setStudentName(student.getStudentName());
        studentDto.setDob(student.getDob());
        studentDto.setGender(student.isGender());
        return studentDto;
    }

    public Student dtoToEntity(StudentDto studentDto){
        Student student = new Student();
        student.setStudentId(studentDto.getStudentId());
        student.setStudentName(studentDto.getStudentName());
        student.setDob(studentDto.getDob());
        student.setGender(studentDto.isGender());
        return student;
    }

}
