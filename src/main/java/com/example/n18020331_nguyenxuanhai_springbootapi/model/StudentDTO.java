package com.example.n18020331_nguyenxuanhai_springbootapi.model;

import com.example.n18020331_nguyenxuanhai_springbootapi.entity.Student;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StudentDTO {
    private Long id;
    private String firstName;
    private String  lastName;
    private String email;

    public StudentDTO(Student student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
    }
}
