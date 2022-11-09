package oops.finalKeyword;

public class Demo2 {
    public static void main(String[] args) {
        final int a  =100;//final local primitive variable
//        a = 200;

        //student = final local reference variable
        final Student student = new Student(1,"abc");
//        student = null;
//        student = new Student(2,"xyz");
        final Student student1 = new Student(2,"xyz");
        student.id = 2;
        student.name = "xyz";
        System.out.println(student);
        System.out.println(student1);

    }
}
