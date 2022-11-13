package oops.objectClassDemos;

public class FinalizeDemo {
    public static void main(String[] args) {
        Course course1 = new Course(1,"java");
        Course course2 = new Course(2,"advance java");
        course1 = null;
        System.gc();
    }
}
