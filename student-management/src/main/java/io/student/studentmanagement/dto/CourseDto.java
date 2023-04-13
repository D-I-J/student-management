package io.student.studentmanagement.dto;

import io.student.studentmanagement.entity.Department;

import java.util.ArrayList;
import java.util.List;

public class CourseDto {
    private Integer courseId;
    private String courseName;
    private String Grade;

    private List<StudentDto> students = new ArrayList<>();

    private Department department;

    private List<AssessmentDto> assessments = new ArrayList<>();

    public CourseDto() {

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<StudentDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDto> students) {
        this.students = students;
    }

    public List<AssessmentDto> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<AssessmentDto> assessments) {
        this.assessments = assessments;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public CourseDto(Integer courseId, String courseName, String grade, List<AssessmentDto> assessments, List<StudentDto> students, Department department) {
        this.courseId = courseId;
        this.courseName = courseName;
        Grade = grade;
        this.assessments = assessments;
        this.students = students;
        this.department = department;
    }

}