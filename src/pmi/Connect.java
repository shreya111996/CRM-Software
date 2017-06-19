
package pmi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
     static Connection createcon() throws ClassNotFoundException, SQLException
     {
         Connection conn =null;     
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmi_database?autoReconnect=true&useSSL=false","root","pmi@902");
            return conn;
     }
}
