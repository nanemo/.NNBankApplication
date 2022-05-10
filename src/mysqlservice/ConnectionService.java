package mysqlservice;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionService {
    public Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/nnbankdata";
        String username = "root";
        String password = "12345";
        Connection c = DriverManager.getConnection(url, username, password);

        return c;
    }
}
