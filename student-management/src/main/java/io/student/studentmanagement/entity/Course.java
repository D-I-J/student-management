package io.student.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", nullable = false)
    private Integer courseId;
    private String courseName;
    private String Grade;
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

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }
}