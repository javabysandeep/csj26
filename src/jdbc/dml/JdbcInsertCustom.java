package jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsertCustom {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Get Connection
        String url ="jdbc:mysql://localhost:3306/cyber_succes";
        String username ="root";
        String password ="Root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. Execute the queries
        Statement statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name, email, phone, address");
        String name = scanner.next();
        String email = scanner.next();
        String phone = scanner.next();
        String address = scanner.next();

        String insertQuery = "INSERT INTO student" +
                "(name, email, phone, address) " +
                "values('"+name+"','"+email+"', '"+phone+"', '"+address+"')";
        int executeUpdate = statement.executeUpdate(insertQuery);
        System.out.println("Data inserted successfully "+executeUpdate);
        //5. close the connection
        connection.close();
    }
}
