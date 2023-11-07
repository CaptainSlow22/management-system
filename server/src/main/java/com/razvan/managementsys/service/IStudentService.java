package com.razvan.managementsys.service;

import com.razvan.managementsys.model.Student;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
