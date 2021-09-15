package com.example.n18020331_nguyenxuanhai_springbootapi.service;

import com.example.n18020331_nguyenxuanhai_springbootapi.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public Student Save(Student student);
    public List<Student> GetAll();
    public Student GetById(Long id);
    public void DeleteById(Long id);
    public Student UpdateById(Long id, Student student);

}
