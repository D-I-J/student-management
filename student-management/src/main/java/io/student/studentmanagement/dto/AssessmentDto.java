package io.student.studentmanagement.dto;

import io.student.studentmanagement.entity.Course;

public class AssessmentDto {
    private Integer assessmentId;
    private String assessmentName;
    private Course course;

    public AssessmentDto() {

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    public AssessmentDto(Integer assessmentId, String assessmentName, int marks, Course course) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
        this.course = course;
    }
}