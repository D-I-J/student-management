package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.CourseDto;
import io.student.studentmanagement.entity.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public Course dtoToEntity(CourseDto courseDto) {
        Course course = new Course();
        course.setCourseId(courseDto.getCourseId());
        course.setCourseName(courseDto.getCourseName());
        return course;
    }

    public CourseDto mapTODto(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.setCourseId(course.getCourseId());
        courseDto.setCourseName(course.getCourseName());
        return courseDto;
    }
}
