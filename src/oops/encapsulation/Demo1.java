package oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"abc",54000);
       /* employee.employeeId=1;
        employee.employeeName="abc";
        employee.employeeSalary=540000;*/
        employee.setEmployeeId(100);
        employee.setEmployeeName("Cyber");
        employee.setEmployeeSalary(100);
        employee.setAge(-30);
       // employee.age = -20;
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeSalary());
        System.out.println(employee.getAge());

    }
}
