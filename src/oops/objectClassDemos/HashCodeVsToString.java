package oops.objectClassDemos;

public class HashCodeVsToString {
    public static void main(String[] args) {

        Course course = new Course();
        //hashCode() returns integer value which is not a direct memory address
        // it is just number which presents that actual memory address
        System.out.println(Integer.toHexString(course.hashCode()));
        System.out.println(course.toString());
    }
}
