package io.student.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Integer studentId;
    private String studentName;
    private Date dob;
    private boolean gender;

    // relationship for Bidirectional relation for student and address one-to-one relationship
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    @JsonManagedReference
    private Address address;

    // relationship for Bidirectional relation for department and student one-to-many relationship
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    @JsonIgnoreProperties("students")
    private Department department;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    public Student(Integer studentId, String studentName, Date dob, boolean gender, Address address, Department department, List<StudentCourse> studentCourses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.studentCourses = studentCourses;
    }

    public Student(Integer studentId, String studentName, Date dob, boolean gender, Address address, Department department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", dob=" + dob +
                ", gender=" + gender +
                ", address=" + address +
                ", department=" + department +
                ", studentCourses=" + studentCourses +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isDeleted=" + isDeleted +
                ", updatedBy=" + updatedBy +
                ", createdBy=" + createdBy +
                '}';
    }
}