package io.student.studentmanagement.repository;

import io.student.studentmanagement.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    @Query("select a from Address a where a.isDeleted is null or a.isDeleted = false")
    List<Address> findAllAndIsNotDelete();

    @Query("select a from Address a where a.isDeleted = false or a.isDeleted is null and a.addressId = :addressId")
    Address findByIdAndIsDelete(@Param("addressId") Integer addressId);



}