package com.azdine.dev.entities;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
i
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
@Entity
@Data
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateNaissance;
}
