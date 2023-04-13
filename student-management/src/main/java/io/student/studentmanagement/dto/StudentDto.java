package io.student.studentmanagement.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDto {
    private Integer studentId;
    private String studentName;
    private Date dob;
    private boolean gender;

    private AddressDto address;

    private List<CourseDto> courses = new ArrayList<>();

    private DepartmentDto department;

    public StudentDto() {

    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
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

    public StudentDto(Integer studentId, String studentName, Date dob, boolean gender, AddressDto address, List<CourseDto> courses, DepartmentDto department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.courses = courses;
        this.department = department;
    }
}