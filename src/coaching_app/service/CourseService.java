package coaching_app.service;

import coaching_app.entities.Course;

import java.util.List;

public interface CourseService {
    boolean create(Course course);
    boolean update(Course course);
    Course delete(Integer courseId);
    Course findById(Integer courseId);
    List<Course> findAll();

}
