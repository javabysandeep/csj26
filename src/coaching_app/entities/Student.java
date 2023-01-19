package coaching_app.entities;

import java.util.List;
import java.util.Objects;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentContact;
    private String studentEmail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Student() {
    }

    public Student(Integer studentId, String studentName, String studentContact, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.studentEmail = studentEmail;
    }
}
