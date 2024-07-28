
package aptitudetestsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DataBaseConnection {
    
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    
    public DataBaseConnection()
    {
        String d="jdbc:sqlserver://localhost:1433;databaseName=AptitudeTestSystem;user=sa;password=123";
        try
        {
//            Connection Netbeans 7.0.2//
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            con=DriverManager.getConnection("JDBC:ODBC:AptitudeTestSystem");
//            st=(Statement) con.createStatement();
//            JOptionPane.showMessageDialog(null, "Connection Build Successfully");
//            End Connection Netbeans 7.0.2//
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(d);
            st=con.createStatement();
          //JOptionPane.showMessageDialog(null, "Connection Build Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Unsuccessfully Build");
        }
    }
}
