package classObjectAssignments;

public class Employee {
    String employeeName;
    int yearOfJoining;
    String address;
    int salary;

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.employeeName = "Robert";
        employee1.yearOfJoining = 2021;
        employee1.address = "Warje";
        employee1.salary = 45000;

        Employee employee2 = new Employee();
        employee2.employeeName = "Sam";
        employee2.yearOfJoining = 2022;
        employee2.address = "shivajinagar";
        employee2.salary = 20000;

        Employee employee3 = new Employee();
        employee3.employeeName = "JOhn";
        employee3.yearOfJoining = 2022;
        employee3.address = "swargate";
        employee3.salary = 4000;

        //printing the objects
        System.out.println(employee1.employeeName + "\t" +
                employee1.yearOfJoining +
                "\t" + employee1.address +
                "\t" + employee1.salary);

        System.out.println(employee2.employeeName + "\t" +
                employee2.yearOfJoining +
                "\t" + employee2.address +
                "\t" + employee2.salary);

        System.out.println(employee3.employeeName + "\t" +
                employee3.yearOfJoining +
                "\t" + employee3.address +
                "\t" + employee3.salary);
    }
}
