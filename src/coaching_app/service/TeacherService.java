package coaching_app.service;

import coaching_app.entities.Teacher;

import java.util.List;

public interface TeacherService {
    boolean create(Teacher teacher);
    boolean update(Teacher teacher);
    Teacher delete(Integer teacherId);
    Teacher findById(Integer teacherId);
    List<Teacher> findAll();

}
