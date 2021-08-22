package jdbc;

import java.sql.*;

public class DbUtil {
    //Open connection
    //Execute a query (read/ write)
    //Close connection
    final String className = "com.mysql.jdbc.Driver";
    private Connection connection;
    private Statement statement;

    final String url = "jdbc:mysql://localhost:3306/MOCK_DATA";
    final String root = "root";
    final String password = "";

    public DbUtil() throws ClassNotFoundException, SQLException {
        System.out.println("Class is being created");
        Class.forName(className);
        connection = DriverManager.getConnection(url,root,password);
    }
    public ResultSet readData(String query) throws SQLException {
        statement = connection.createStatement();
        return statement.executeQuery(query);
    }
    public int writeData(String query) throws SQLException {
        statement = connection.createStatement();
        return statement.executeUpdate(query);
    }
    public void closeConnection () throws SQLException {
        statement.close();
        connection.close();
    }
}
