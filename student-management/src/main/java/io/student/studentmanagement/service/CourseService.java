package io.student.studentmanagement.service;

import io.student.studentmanagement.entity.Course;
import io.student.studentmanagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAllAndIsNotDelete();
    }

    public Course getCourse(int id){
        return courseRepository.findByIdAndIsNotDelete(id);
    }

    public Course addCourse(Course course){
        course.setCourseId(0);
        return courseRepository.save(course);
    }

    public void deleteCourse(int id){
        Course course = courseRepository.findById(id).get();
        course.setDeleted(true);
        courseRepository.save(course);
    }
}
