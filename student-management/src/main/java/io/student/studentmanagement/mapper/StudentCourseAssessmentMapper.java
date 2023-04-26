package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.StudentCourseAssessmentDto;
import io.student.studentmanagement.entity.StudentCourseAssessment;

public class StudentCourseAssessmentMapper {

    public StudentCourseAssessmentDto mapTODto(StudentCourseAssessment studentCourseAssessment){
        StudentCourseAssessmentDto studentCourseAssessmentDto = new StudentCourseAssessmentDto();
        studentCourseAssessmentDto.setStudentCourseAssessmentId(studentCourseAssessment.getStudentCourseAssessmentId());
        studentCourseAssessmentDto.setObtainedMarks(studentCourseAssessment.getObtainedMarks());
        return studentCourseAssessmentDto;
    }

    public StudentCourseAssessment dtoToEntity(StudentCourseAssessmentDto studentCourseAssessmentDto){
        StudentCourseAssessment studentCourseAssessment = new StudentCourseAssessment();
        studentCourseAssessment.setStudentCourseAssessmentId(studentCourseAssessmentDto.getStudentCourseAssessmentId());
        studentCourseAssessment.setObtainedMarks(studentCourseAssessmentDto.getObtainedMarks());
        return studentCourseAssessment;
    }
}
