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

    @Override
    public String toString() {
        return "Assessment{" +
                "assessmentId=" + assessmentId +
                ", assessmentName='" + assessmentName + '\'' +
                ", marks=" + marks +
                '}';
    }
}