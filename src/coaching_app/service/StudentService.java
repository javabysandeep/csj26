package coaching_app.service;

import coaching_app.entities.Student;

import java.util.List;

public interface StudentService {
    boolean create(Student student);
    boolean update(Student student);
    boolean delete(Integer studentId);
    Student findById(Integer studentId);
    List<Student> findAll();

}
