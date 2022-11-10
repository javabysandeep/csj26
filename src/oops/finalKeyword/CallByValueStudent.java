package oops.finalKeyword;

public class CallByValueStudent {
    public static void main(String[] args) {
        Student student = new Student(1,"abc");
        changeMe(student);// 2 xyz
        System.out.println(student.id+"\t"+student.name);// 1 abc
    }

    private static void changeMe(Student student) {
        student = new Student(2,"xyz");
        System.out.println(student.id+"\t"+student.name);
    }
}
