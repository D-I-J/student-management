package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.StudentCourseDto;
import io.student.studentmanagement.entity.StudentCourse;
import org.springframework.stereotype.Component;

@Component
public class StudentCourseMapper {

    public StudentCourseDto mapTODto(StudentCourse studentCourse){
        StudentCourseDto studentCourseDto = new StudentCourseDto();
        studentCourseDto.setStudentCoursedId(studentCourse.getStudentCoursedId());
        studentCourseDto.setGrade(studentCourse.getGrade());
        return studentCourseDto;
    }

    public StudentCourse dtoToEntity(StudentCourseDto studentCourseDto){
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStudentCoursedId(studentCourseDto.getStudentCoursedId());
        studentCourse.setGrade(studentCourseDto.getGrade());
        return studentCourse;
    }
}
