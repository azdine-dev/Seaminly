package com.azdine.dev.repositories;


import com.azdine.dev.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByFirstNameStartingWith(String firstName);
    public List<Student> findByFirstName(String firstName);
    @Query("select p from Student p where p.firstName like :x")
    public List<Student> searchStudentsWhereNameContains(@Param("x") String firstName);
}
