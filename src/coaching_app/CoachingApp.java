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

import java.util.List;


public class CoachingApp {
    public static void main(String[] args) {
        //student onboarding
        StudentService studentService = new StudentServiceImpl();
        Student student1 = new Student(1,"abc","1234","abc@gmail.com");
        Student student2 = new Student(2,"abc","1234","abc@gmail.com");
        studentService.create(student1);
        studentService.create(student2);

        List<Student> studentList = studentService.findAll();
        studentList.forEach(System.out::println);

        System.out.println("After removal");
        studentService.delete(1);
        studentList.forEach(System.out::println);

        //teacher onboarding
        TeacherService teacherService = new TeacherServiceImpl();

        //course onboarding
        CourseService courseService = new CourseServiceImpl();

        //batch onboarding
        BatchService batchService = new BatchServiceImpl();
    }
}
