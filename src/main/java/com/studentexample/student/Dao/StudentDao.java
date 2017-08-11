package com.studentexample.student.Dao;

import com.studentexample.student.Entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentDao {
    public static Map<Integer, Student> students ;
        static {
            students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Shkumbin", "Computer Science"));
                put(2, new Student(2, "Fatjeta", "Web Design"));
                put(3, new Student(3, "Mihai", "Programming"));
            }
        };


    }
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public void removeStudentById(int id) {
        this.students.remove(id);
    }
}
