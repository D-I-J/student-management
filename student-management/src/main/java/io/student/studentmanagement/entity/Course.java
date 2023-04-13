package io.student.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", nullable = false)
    private Integer courseId;
    private String courseName;

    // relationship for Bidirectional relation for course and department one-to-many relationship
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    @JsonIgnoreProperties("courses")
    private Department department;

    //inverse relationship for Bidirectional relation for course and assessments one-to-many relationship
    @OneToMany(mappedBy = "course")
    @JsonIgnoreProperties("course")
    private List<Assessment> assessments = new ArrayList<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<StudentCourse> studentCourses = new ArrayList<>();

    public List<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
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

    public Course() {
    }

    public Course(Integer courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Course(Integer courseId, String courseName, List<Assessment> assessments) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.assessments = assessments;
    }

    public Course(Integer courseId, String courseName, Department department, List<Assessment> assessments, List<StudentCourse> studentCourses) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.department = department;
        this.assessments = assessments;
        this.studentCourses = studentCourses;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", department=" + department +
                ", assessments=" + assessments +
                ", studentCourses=" + studentCourses +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isDeleted=" + isDeleted +
                ", updatedBy=" + updatedBy +
                ", createdBy=" + createdBy +
                '}';
    }
}