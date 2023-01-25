package coaching_app.service.impl;

import coaching_app.entities.Student;
import coaching_app.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    static List<Student> studentList = new ArrayList<>();

    @Override
    public boolean create(Student student) {
        return studentList.add(student);
    }

    @Override
    public boolean update(Student student) {
        Student student1 = studentList.get(student.getStudentId());
        return false;
    }

    @Override
    public boolean delete(Integer studentId) {
        Student student = studentList.get(studentId);
        return studentList.remove(student);
    }

    @Override
    public Student findById(Integer studentId) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
