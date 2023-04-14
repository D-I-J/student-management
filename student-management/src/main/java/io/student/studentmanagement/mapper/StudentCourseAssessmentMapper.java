package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.StudentCourseAssessmentDto;
import io.student.studentmanagement.entity.StudentCourseAssessment;

public class StudentCourseAssessmentMapper {

    public StudentCourseAssessmentDto mapTODto(StudentCourseAssessment studentCourseAssessment){
        StudentCourseAssessmentDto studentCourseAssessmentDto = new StudentCourseAssessmentDto();
        studentCourseAssessmentDto.setStudentCourseAssessmentId(studentCourseAssessment.getStudentCourseAssessmentId());
        studentCourseAssessmentDto.setMarks(studentCourseAssessment.getMarks());
        return studentCourseAssessmentDto;
    }

    public StudentCourseAssessment dtoToEntity(StudentCourseAssessmentDto studentCourseAssessmentDto){
        StudentCourseAssessment studentCourseAssessment = new StudentCourseAssessment();
        studentCourseAssessment.setStudentCourseAssessmentId(studentCourseAssessmentDto.getStudentCourseAssessmentId());
        studentCourseAssessment.setMarks(studentCourseAssessmentDto.getMarks());
        return studentCourseAssessment;
    }
}
