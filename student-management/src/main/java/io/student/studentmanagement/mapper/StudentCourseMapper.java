package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.StudentCourseDto;
import io.student.studentmanagement.entity.StudentCourse;

public class StudentCourseMapper {

    public StudentCourseDto mapTODto(StudentCourse studentCourse){
        StudentCourseDto studentCourseDto = new StudentCourseDto();
        studentCourseDto.setStudentCoursedId(studentCourse.getStudentCoursedId());
        return studentCourseDto;
    }

    public StudentCourse dtoToEntity(StudentCourseDto studentCourseDto){
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStudentCoursedId(studentCourseDto.getStudentCoursedId());
        return studentCourse;
    }
}
