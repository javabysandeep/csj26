package jdbc.dml.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBatch {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Get Connection
        String url = "jdbc:mysql://localhost:3306/cyber_succes";
        String username = "root";
        String password = "Root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. Execute the queries
        Statement statement = connection.createStatement();
        String insertQuery1 = "INSERT INTO course(name, duration, fees) values('java','3 months','1000')";
        String insertQuery2 = "INSERT INTO course(name, duration, fees) values('python','3 months','1000')";
        String insertQuery3 = "INSERT INTO course(name, duration, fees) values('testing','3 months','1000')";
        String insertQuery4 = "INSERT INTO course(name, duration, fees) values('UI','3 months','1000')";
        String insertQuery5 = "INSERT INTO course(name, duration, fees) values('Cloud','3 months','1000')";

        statement.addBatch(insertQuery1);
        statement.addBatch(insertQuery2);
        statement.addBatch(insertQuery3);
        statement.addBatch(insertQuery4);
        statement.addBatch(insertQuery5);

        int[] ints = statement.executeBatch();

        System.out.println("Data Inserted successfully ");

        //5. close the connection
        connection.close();
    }
}
