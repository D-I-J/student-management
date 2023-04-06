package io.student.studentmanagement.controller;

import io.student.studentmanagement.entity.Course;
import io.student.studentmanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping
    public List<Course> allCourses(){
        return courseService.getAllCourses();
    }
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        courseService.deleteCourse(id);
    }
}
