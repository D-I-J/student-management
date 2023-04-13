package io.student.studentmanagement.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseDto {

    private Integer studentCoursedId;
    private StudentDto student;
    private CourseDto course;
    private List<StudentCourseAssessmentDto> studentCourseAssessments = new ArrayList<>();


    public Integer getStudentCoursedId() {
        return studentCoursedId;
    }

    public void setStudentCoursedId(Integer studentCoursedId) {
        this.studentCoursedId = studentCoursedId;
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public CourseDto getCourse() {
        return course;
    }

    public void setCourse(CourseDto course) {
        this.course = course;
    }

    public List<StudentCourseAssessmentDto> getStudentCourseAssessments() {
        return studentCourseAssessments;
    }

    public void setStudentCourseAssessments(List<StudentCourseAssessmentDto> studentCourseAssessments) {
        this.studentCourseAssessments = studentCourseAssessments;
    }

    public StudentCourseDto(Integer studentCoursedId, StudentDto student, CourseDto course, List<StudentCourseAssessmentDto> studentCourseAssessments) {
        this.studentCoursedId = studentCoursedId;
        this.student = student;
        this.course = course;
        this.studentCourseAssessments = studentCourseAssessments;
    }
}
