package com.example.n18020331_nguyenxuanhai_springbootapi.controller;

import com.example.n18020331_nguyenxuanhai_springbootapi.entity.Student;
import com.example.n18020331_nguyenxuanhai_springbootapi.repository.StudentRepository;
import com.example.n18020331_nguyenxuanhai_springbootapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student Save(@RequestBody Student student){
        return studentService.Save(student);
    }
    @GetMapping("/students")
    public List<Student> GetAll(){
        return studentService.GetAll();
    }
    @GetMapping("/students/{id}")
    public Student GetById(@PathVariable("id") Long id){
        return studentService.GetById(id);
    }
    @DeleteMapping("/students/{id}")
    String DeleteById(@PathVariable("id") Long id){
        studentService.DeleteById(id);
        return "OK";
    }
    @PutMapping("/students/{id}")
    Student UpdateById(@PathVariable("id") Long id, @RequestBody Student student){
        return studentService.UpdateById(id, student);
    }



}
