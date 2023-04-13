package io.student.studentmanagement.dto;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDto {
    private Integer departmentId;
    private String departmentName;
    private List<StudentDto> students;
    private List<CourseDto> courses = new ArrayList<>();

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

    public List<StudentDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDto> students) {
        this.students = students;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
    }


    public DepartmentDto(Integer departmentId, String departmentName, List<StudentDto> students, List<CourseDto> courses) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.students = students;
        this.courses = courses;
    }
}
