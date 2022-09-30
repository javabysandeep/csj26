package classObjectAssignments;

public class EmployeeSimplified {
    String employeeName;
    int yearOfJoining;
    String address;
    int salary;

    void setEmployeeDetails(String en, int yj, String add, int sal){
        employeeName = en;
        yearOfJoining = yj;
        address = add;
        salary = sal;
    }

    void printEmployeeDetails(){
        System.out.println(employeeName + "\t" +
                yearOfJoining +
                "\t" + address +
                "\t" + salary);
    }

    public static void main(String[] args) {
        EmployeeSimplified employee1 = new EmployeeSimplified();
        employee1.setEmployeeDetails("Rober",2021,"pune",4000);
        employee1.printEmployeeDetails();

        EmployeeSimplified employee2 = new EmployeeSimplified();
        employee2.setEmployeeDetails("Sam",2022,"mumbai",500);
        employee2.printEmployeeDetails();

        EmployeeSimplified employee3 = new EmployeeSimplified();
        employee3.setEmployeeDetails("Ganesh",2022,"Wai",500);
        employee3.printEmployeeDetails();


    }
}
