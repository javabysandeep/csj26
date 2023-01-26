package jdbc.select;

import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException {
        // Java App -->          Translator[Java calls to SQL & vice versa , DB vendor company]  DBMS ---> DB
        String url = "jdbc:mysql://localhost:3306/cyber_succes";
        String username = "root";
        String password = "Root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getString(3) + "\t" +
                    resultSet.getString(4) + "\t" +
                    resultSet.getString(5)
            );
        }

    }
}
