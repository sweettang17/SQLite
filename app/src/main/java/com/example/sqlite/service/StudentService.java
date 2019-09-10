package com.example.sqlite.service;

import com.example.sqlite.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void insert(Student student);

    void update(Student student);

    void delete(String StudentName);
}
