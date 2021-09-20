package com.example.n18020331_nguyenxuanhai_springbootapi.controller;

import com.example.n18020331_nguyenxuanhai_springbootapi.entity.Student;
import com.example.n18020331_nguyenxuanhai_springbootapi.repository.StudentRepository;
import com.example.n18020331_nguyenxuanhai_springbootapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //    @PostMapping("/students")
//    public Student Save(@RequestBody Student student){
//        return studentService.Save(student);
//    }
    @PostMapping("/employees")
    ResponseEntity<Student> saveEmployee(@Valid  @RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.Save(student), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public List<Student> GetAll() {
        return studentService.GetAll();
    }

    @GetMapping("/students/{id}")
    public Student GetById(@PathVariable("id") Long id) {
        return studentService.GetById(id);
    }

    @DeleteMapping("/students/{id}")
    String DeleteById(@PathVariable("id") Long id) {
        studentService.DeleteById(id);
        return "OK";
    }

    @PutMapping("/students/{id}")
    Student UpdateById(@PathVariable("id") Long id, @RequestBody Student student) {
        return studentService.UpdateById(id, student);
    }


}
