package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DbUtil dbutil = new DbUtil();
        ResultSet rs = dbutil.readData("select * from MOCK_DATA limit 5");
        while (rs.next())
            System.out.println("id, first_name, last_name");
        int r = dbutil.writeData("insert into MOCK_DATA(id) value (null);");
        System.out.println("Return integer is: " + r);
        dbutil.closeConnection();
    }
}
