package oops.objectClassDemos;

public class HashCodeDemo {
    public static void main(String[] args) {
        Student student1 = new Student(1,"abc");
        Student student2 = new Student(1,"abc");

        student1= student2;

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
