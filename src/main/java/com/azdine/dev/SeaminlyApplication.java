package com.azdine.dev;

import com.azdine.dev.entities.Student;
import com.azdine.dev.entities.Training;
import com.azdine.dev.repositories.StudentRepository;
import com.azdine.dev.repositories.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class SeaminlyApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(SeaminlyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        //expose IDS
        repositoryRestConfiguration.exposeIdsFor(Training.class, Student.class);


        Training  t1=  trainingRepository.save(new Training(null,"PHP", 30,null));
        Training  t2=  trainingRepository.save(new Training(null,"java8", 30,null));
        Training  t3=  trainingRepository.save(new Training(null,"Spring boot", 30,null));
        Training  t4=  trainingRepository.save(new Training(null,"Oracle", 30,null));



        Student  student1 = new Student(null, "azdine", "bnh", "azdine.bnh@gmail.com",  new Date(), t1);
        Student  student2 = new Student(null, "azdine", "bnh2", "azdine.bnh@gmail.com", new Date(), t2);
        Student  student3 = new Student(null, "azdine", "bnh3", "azdine.bnh@gmail.com", new Date(), t3);
        Student  student4 = new Student(null, "azdine", "bnh4", "azdine.bnh@gmail.com", new Date(), t4);


        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);

    }
}
