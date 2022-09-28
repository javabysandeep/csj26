package classObjectAssignments;

public class Student {
    //instance variables
    int rollNumber;
    String name;
    String address;
    int phoneNumber;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "Sam";
        student1.address ="Warje";
        student1.phoneNumber = 9999999;

        Student student2 = new Student();
        student2.rollNumber=2;
        student2.name = "John";
        student2.address = "Swargate";
        student2.phoneNumber= 888888;

        //print the student details

        System.out.println(student1.rollNumber+"\t" + student1.name+"\t"+
                student1.address+"\t"+student1.phoneNumber);

        System.out.println(student2.rollNumber+"\t" + student2.name+"\t"+
                student2.address+"\t"+student2.phoneNumber);

    }
}
