package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11,"Vikram",5690000);
        Employee employee2 = new Employee(1,"Yash",78000);
        Employee employee3 = new Employee(17,"Sanket",13200);
        Employee employee4 = new Employee(3,"Shaunak",50000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        employeeList.forEach(System.out::println);
        System.out.println("Sorted employees");

        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);
    }
}











