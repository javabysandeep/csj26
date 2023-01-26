package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url =  "jdbc:mysql://localhost:3306/cyber_succes";
        String username =  "root";
        String password =  "Root@1234";

        //1. load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. get connection
        Connection connection = DriverManager.getConnection(url, username, password);
        //3. Execute the queries
        String query = "call course_proc()";
        CallableStatement callableStatement = connection.prepareCall(query);

        boolean execute = callableStatement.execute();
        System.out.println("Procedure is called successfully");

        connection.close();

    }
}
