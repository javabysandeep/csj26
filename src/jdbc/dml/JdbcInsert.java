package jdbc.dml;
import java.sql.*;
public class JdbcInsert {
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
        String insertQuery = "INSERT INTO student" +
                "(name, email, phone, address) " +
                "values('Anirudh','anirudh@gmail.com','123456','pune')";
        int executeUpdate = statement.executeUpdate(insertQuery);
        System.out.println("Data inserted successfully "+executeUpdate);
        //5. close the connection
        connection.close();
    }
}
