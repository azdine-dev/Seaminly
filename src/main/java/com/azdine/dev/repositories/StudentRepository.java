package com.azdine.dev.repositories;


import com.azdine.dev.entities.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student,Long> {

}
