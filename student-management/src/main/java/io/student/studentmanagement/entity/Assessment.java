package io.student.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "assessment")
public class Assessment extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_id", nullable = false)
    private Integer assessmentId;
    private String assessmentName;
    private int marks;

    // relationship for Bidirectional relation for course and assessments one-to-may relationship
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Assessment() {
    }

    public Assessment(Integer assessmentId, String assessmentName, int marks) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
        this.marks = marks;
    }

    public Assessment(Integer assessmentId, String assessmentName, int marks, Course course) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
        this.marks = marks;
        this.course = course;
    }

    @Override
    public String toString() {
        return "AssessmentDto{" +
                "assessmentId=" + assessmentId +
                ", assessmentName='" + assessmentName + '\'' +
                ", marks=" + marks +
                ", course=" + course +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isDeleted=" + isDeleted +
                ", updatedBy=" + updatedBy +
                ", createdBy=" + createdBy +
                '}';
    }
}