package io.student.studentmanagement.repository;

import io.student.studentmanagement.entity.StudentCourseAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseAssessmentRepository extends JpaRepository<StudentCourseAssessment, Integer> {

}
