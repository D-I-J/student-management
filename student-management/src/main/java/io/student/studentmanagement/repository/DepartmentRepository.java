package io.student.studentmanagement.repository;

import io.student.studentmanagement.entity.Department;
import io.student.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("select d from Department d where d.isDeleted = null or d.isDeleted = false")
    List<Department> findAllAndIsNotDeleted();

    @Query("select d from Department d where (d.isDeleted is null or d.isDeleted = false) and d.departmentId = :departmentId")
    Department findByIdAndIsNotDelete(@Param("departmentId") Integer departmentId);





}