package classObjectAssignments;

public class Employee1 {
    String name;
    int salary;
    int numberOfHoursWorked;

    void acceptEmployeeDetails(String n, int sal, int hours){
        name = n;
        salary = sal;
        numberOfHoursWorked = hours;
    }
    void addSalary(){
        if(salary < 500){
            salary = salary + 10;
        }
    }
    void addWork(){
        if(numberOfHoursWorked > 6){
            salary = salary + 5;
        }
    }

    public static void main(String[] args) {
        Employee1 employee1 = new Employee1();
        employee1.acceptEmployeeDetails("abc",300,7);
        employee1.addSalary();
        System.out.println("Salary "+employee1.salary);
        employee1.addWork();
        System.out.println("Salary "+employee1.salary);

    }
}
