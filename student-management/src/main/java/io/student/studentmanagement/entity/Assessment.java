package io.student.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "assessment")
public class Assessment extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_id", nullable = false)
    private Integer assessmentId;
    private String assessmentName;

    @OneToMany(mappedBy = "assessment", cascade = CascadeType.ALL)
    private List<StudentCourseAssessment> studentCourseAssessments;

    // relationship for Bidirectional relation for course and assessments one-to-may relationship
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    @JsonIgnoreProperties("assessments")
    private Course course;

    public List<StudentCourseAssessment> getStudentCourseAssessments() {
        return studentCourseAssessments;
    }

    public void setStudentCourseAssessments(List<StudentCourseAssessment> studentCourseAssessments) {
        this.studentCourseAssessments = studentCourseAssessments;
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

    public Assessment() {
    }

    public Assessment(Integer assessmentId, String assessmentName) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
    }

    public Assessment(Integer assessmentId, String assessmentName, Course course) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
        this.course = course;
    }

    public Assessment(Integer assessmentId, String assessmentName, List<StudentCourseAssessment> studentCourseAssessments, Course course) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
        this.studentCourseAssessments = studentCourseAssessments;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "assessmentId=" + assessmentId +
                ", assessmentName='" + assessmentName + '\'' +
                ", studentCourseAssessments=" + studentCourseAssessments +
                ", course=" + course +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isDeleted=" + isDeleted +
                ", updatedBy=" + updatedBy +
                ", createdBy=" + createdBy +
                '}';
    }
}