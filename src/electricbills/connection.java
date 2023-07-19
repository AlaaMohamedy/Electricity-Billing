
package electricbills;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class connection {
   
    public static Connection getconnection(){
        Connection c = null;
        try {
            try {
                /*String file="jdbc:sqlserver://localhost:1433;databaseName=Electricbills";
                String name="s";
                String pass="123";
                Connection con=DriverManager.getConnection(file, name, pass);*/
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
            c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ElectricBills","user","user");
            
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}

