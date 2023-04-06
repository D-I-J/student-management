package io.student.studentmanagement.repository;

import io.student.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select s from Student s where s.isDeleted = null")
    List<Student> findAllAndIsNotDeleted();

    @Query("select s from Student s where (s.isDeleted = false or s.isDeleted = null) and s.studentId = :studentId")
    Student findByIdAndIsNotDeleted(@Param("studentId") Integer studentId);

}