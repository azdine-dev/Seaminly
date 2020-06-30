package com.azdine.dev.repositories;


import com.azdine.dev.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
