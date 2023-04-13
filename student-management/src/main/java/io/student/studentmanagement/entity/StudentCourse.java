package io.student.studentmanagement.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student_course")
public class StudentCourse extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_course_id", nullable = false)
    private Integer studentCoursedId;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;

    @OneToMany(mappedBy = "studentCourse",cascade = {CascadeType.ALL})
    private List<StudentCourseAssessment> studentCourseAssessments = new ArrayList<>();

    private String grade;

    public StudentCourse() {
    }

    public Integer getStudentCoursedId() {
        return studentCoursedId;
    }

    public void setStudentCoursedId(Integer studentCoursedId) {
        this.studentCoursedId = studentCoursedId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        grade = grade;
    }

    public StudentCourse(Integer studentCoursedId, Student student, Course course, String grade) {
        this.studentCoursedId = studentCoursedId;
        this.student = student;
        this.course = course;
        grade = grade;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "studentCoursedId=" + studentCoursedId +
                ", student=" + student +
                ", course=" + course +
                ", grade='" + grade + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isDeleted=" + isDeleted +
                ", updatedBy=" + updatedBy +
                ", createdBy=" + createdBy +
                '}';
    }
}
