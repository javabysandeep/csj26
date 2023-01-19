package coaching_app.service.impl;

import coaching_app.entities.Course;
import coaching_app.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Override
    public boolean create(Course course) {
        return false;
    }

    @Override
    public boolean update(Course course) {
        return false;
    }

    @Override
    public Course delete(Integer courseId) {
        return null;
    }

    @Override
    public Course findById(Integer courseId) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }
}
