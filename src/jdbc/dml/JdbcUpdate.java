package jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
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
        String updateQuery = "update student set email='Tushar@gmail.com' where id=3";
        int executeUpdate = statement.executeUpdate(updateQuery);
        System.out.println("Data Updated successfully "+executeUpdate);
        //5. close the connection
        connection.close();
    }
}
