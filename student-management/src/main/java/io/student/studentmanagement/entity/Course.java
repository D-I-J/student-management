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
    private String Grade;

    //inverse relationship for Bidirectional relation for student and courses many-to-many relationship
    @ManyToMany(mappedBy = "courses", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("courses")
    private List<Student> students = new ArrayList<>();

    // relationship for Bidirectional relation for course and department one-to-many relationship
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    //inverse relationship for Bidirectional relation for course and assessments one-to-may relationship
    @OneToMany(mappedBy = "course")
    private List<Assessment> assessments = new ArrayList<>();

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public Course() {
    }

    public Course(Integer courseId, String courseName, String grade) {
        this.courseId = courseId;
        this.courseName = courseName;
        Grade = grade;
    }

    public Course(Integer courseId, String courseName, String grade, List<Assessment> assessments) {
        this.courseId = courseId;
        this.courseName = courseName;
        Grade = grade;
        this.assessments = assessments;
    }

    public Course(Integer courseId, String courseName, String grade, List<Assessment> assessments, List<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        Grade = grade;
        this.assessments = assessments;
        this.students = students;
    }

    public Course(Integer courseId, String courseName, String grade, List<Assessment> assessments, List<Student> students, Department department) {
        this.courseId = courseId;
        this.courseName = courseName;
        Grade = grade;
        this.assessments = assessments;
        this.students = students;
        this.department = department;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", Grade='" + Grade + '\'' +
                ", assessments=" + assessments +
                ", students=" + students +
                ", department=" + department +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isDeleted=" + isDeleted +
                ", updatedBy=" + updatedBy +
                ", createdBy=" + createdBy +
                '}';
    }
}