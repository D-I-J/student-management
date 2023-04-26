package io.student.studentmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class Department extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    private Integer departmentId;
    private String departmentName;

    // inverse relationship for Bidirectional relation for department and students one-to-may relationship
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("department")
    private List<Student> students;

    // inverse relationship for Bidirectional relation for department and courses one-to-may relationship
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("department")
    private List<Course> courses = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public Department(Integer departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department(Integer departmentId, String departmentName, List<Student> students, List<Course> courses) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.students = students;
        this.courses = courses;
    }

}