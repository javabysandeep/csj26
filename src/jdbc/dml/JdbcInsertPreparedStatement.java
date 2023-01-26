package jdbc.dml;

import java.sql.*;
import java.util.Scanner;

public class JdbcInsertPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Get Connection
        String url ="jdbc:mysql://localhost:3306/cyber_succes";
        String username ="root";
        String password ="Root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. Execute the queries
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name, email, phone, address");
        String name = scanner.next();
        String email = scanner.next();
        String phone = scanner.next();
        String address = scanner.next();

        String insertQuery = "INSERT INTO student (name, email, phone, address) values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(insertQuery);
        statement.setString(1,name);
        statement.setString(2,email);
        statement.setString(3,phone);
        statement.setString(4,address);

        int executeUpdate = statement.executeUpdate();
        System.out.println("Data inserted successfully "+executeUpdate);
        //5. close the connection
        connection.close();
    }
}
