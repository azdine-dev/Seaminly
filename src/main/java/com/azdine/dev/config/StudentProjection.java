package com.azdine.dev.config;

import com.azdine.dev.entities.Student;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = {Student.class})
public interface StudentProjection {
    public String getFirstName();
}
