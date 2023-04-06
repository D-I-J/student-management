package io.student.studentmanagement.repository;

import io.student.studentmanagement.entity.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Integer> {
    @Query("select a from Assessment a where a.isDeleted is null or a.isDeleted = false")
    List<Assessment> findAllAndIsNotDelete();

    @Query(" select a from Assessment a where a.isDeleted is null or a.isDeleted = false and a.assessmentId = :assessmentId")
    Assessment findByIdAndIsNotDelete(@Param("assessmentId") Integer assessmentId);




}