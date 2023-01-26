package jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAlterTable {
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
        String query = "ALTER TABLE course rename COLUMN course_fees to fees";
        boolean status = statement.execute(query);
        System.out.println("Table altered successfully "+status);
        //5. close the connection
        connection.close();
    }
}
