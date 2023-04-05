package io.student.studentmanagement.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Integer studentId;
    private String studentName;
    private Date dob;
    private boolean gender;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Student() {
    }

    public Student(Integer studentId, String studentName, Date dob, boolean gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = dob;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", dob=" + dob +
                ", gender=" + gender +
                '}';
    }
}