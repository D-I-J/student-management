package io.student.studentmanagement.dto;

import io.student.studentmanagement.entity.Assessment;
import io.student.studentmanagement.entity.StudentCourse;
import jakarta.persistence.*;

public class StudentCourseAssessmentDto {
    private Integer studentCourseAssessmentId;
    private int marks;
    private StudentCourseDto studentCourse;
    private AssessmentDto assessment;

    public StudentCourseAssessmentDto() {

    }

    public Integer getStudentCourseAssessmentId() {
        return studentCourseAssessmentId;
    }

    public void setStudentCourseAssessmentId(Integer studentCourseAssessmentId) {
        this.studentCourseAssessmentId = studentCourseAssessmentId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public StudentCourseDto getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(StudentCourseDto studentCourse) {
        this.studentCourse = studentCourse;
    }

    public AssessmentDto getAssessment() {
        return assessment;
    }

    public void setAssessment(AssessmentDto assessment) {
        this.assessment = assessment;
    }

    public StudentCourseAssessmentDto(Integer studentCourseAssessmentId, int marks, StudentCourseDto studentCourse, AssessmentDto assessment) {
        this.studentCourseAssessmentId = studentCourseAssessmentId;
        this.marks = marks;
        this.studentCourse = studentCourse;
        this.assessment = assessment;
    }
}
