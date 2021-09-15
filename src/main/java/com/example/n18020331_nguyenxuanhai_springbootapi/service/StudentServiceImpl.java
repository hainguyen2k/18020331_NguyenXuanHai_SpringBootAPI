package com.example.n18020331_nguyenxuanhai_springbootapi.service;

import com.example.n18020331_nguyenxuanhai_springbootapi.entity.Student;
import com.example.n18020331_nguyenxuanhai_springbootapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student Save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> GetAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student GetById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void DeleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student UpdateById(Long id, Student student) {
        Student student1 = studentRepository.findById(id).get();

        return studentRepository.save(student1);
    }
}
