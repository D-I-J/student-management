package io.student.studentmanagement.service;

import io.student.studentmanagement.entity.Course;
import io.student.studentmanagement.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourse(int id){
        return courseRepository.findById(id).get();
    }

    public Course addCourse(Course course){
        course.setCourseId(0);
        return courseRepository.save(course);
    }

    public void deleteCourse(int id){
        courseRepository.deleteById(id);
    }
}
