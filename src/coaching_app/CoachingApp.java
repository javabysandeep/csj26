package coaching_app;

import coaching_app.entities.Student;
import coaching_app.service.BatchService;
import coaching_app.service.CourseService;
import coaching_app.service.StudentService;
import coaching_app.service.TeacherService;
import coaching_app.service.impl.BatchServiceImpl;
import coaching_app.service.impl.CourseServiceImpl;
import coaching_app.service.impl.StudentServiceImpl;
import coaching_app.service.impl.TeacherServiceImpl;


public class CoachingApp {
    public static void main(String[] args) {
        //student onboarding
        StudentService studentService = new StudentServiceImpl();
        Student student = new Student(1,"abc","1234","abc@gmail.com");
        studentService.create(student);

        //teacher onboarding
        TeacherService teacherService = new TeacherServiceImpl();

        //course onboarding
        CourseService courseService = new CourseServiceImpl();

        //batch onboarding
        BatchService batchService = new BatchServiceImpl();
    }
}
