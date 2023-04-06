package io.student.studentmanagement.repository;

import io.student.studentmanagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query("select c from Course c where (c.isDeleted is null or c.isDeleted = false)")
    List<Course> findAllAndIsNotDelete();

    @Query("select c from Course c where (c.isDeleted is null or c.isDeleted = false) and c.courseId = :courseId")
    Course findByIdAndIsNotDelete(@Param("courseId") Integer courseId);


}