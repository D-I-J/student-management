package io.student.studentmanagement.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "student_course_assessment")
public class StudentCourseAssessment extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_course_assessment_id", nullable = false)
    private Integer studentCourseAssessmentId;
    private int obtainedMarks;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "student_course_id", referencedColumnName = "student_course_id")
    private StudentCourse studentCourse;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "assessment_id", referencedColumnName = "assessment_id")
    private Assessment assessment;

    public int getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public StudentCourse getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(StudentCourse studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public Integer getStudentCourseAssessmentId() {
        return studentCourseAssessmentId;
    }

    public void setStudentCourseAssessmentId(Integer studentCourseAssessmentId) {
        this.studentCourseAssessmentId = studentCourseAssessmentId;
    }

    public StudentCourseAssessment() {
    }

    public StudentCourseAssessment(Integer studentCourseAssessmentId, int obtainedMarks, StudentCourse studentCourse, Assessment assessment) {
        this.studentCourseAssessmentId = studentCourseAssessmentId;
        this.obtainedMarks = obtainedMarks;
        this.studentCourse = studentCourse;
        this.assessment = assessment;
    }



    @Override
    public String toString() {
        return "StudentCourseAssessment{" +
                "studentCourseAssessmentId=" + studentCourseAssessmentId +
                ", obtainedMarks=" + obtainedMarks +
                ", studentCourse=" + studentCourse +
                ", assessment=" + assessment +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isDeleted=" + isDeleted +
                ", updatedBy=" + updatedBy +
                ", createdBy=" + createdBy +
                '}';
    }
}
