package com.example.sqlite.service;

import android.content.Context;

import com.example.sqlite.dao.StudentDao;
import com.example.sqlite.dao.StudentDaoImpl;
import com.example.sqlite.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl(Context context) {
        studentDao = new StudentDaoImpl(context);
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public void insert(Student student) {
        studentDao.insert(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public void delete(String StudentName) {
        studentDao.delete(StudentName);
    }
}
