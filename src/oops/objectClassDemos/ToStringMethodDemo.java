package oops.objectClassDemos;

public class ToStringMethodDemo {
    public static void main(String[] args) {

        int number = 10;//decimal number system
        System.out.println("Binary "+ Integer.toBinaryString(number));
        System.out.println("Octal "+ Integer.toOctalString(number));
        System.out.println("Hexadecimal "+ Integer.toHexString(number));


        Course  course = new Course();
        int hashCode = course.hashCode();
        System.out.println("Decimal hashCode "+hashCode);
        System.out.println("Hexadecimal hashCode "+Integer.toHexString(hashCode));

        //oops.objectClassDemos.Course @ 1b6d3586
        System.out.println(course.toString());
    }
}
