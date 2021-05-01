

package Question2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectionfile {
    
    public connectionfile getConnection(){
    connectionfile obj1 = null;
        try {
            try {  
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(connectionfile.class.getName()).log(Level.SEVERE, null, ex);
            }
            obj1 = (connectionfile) DriverManager.getConnection("jdbc:sqlserver://DESKTOP-E5IBCL1\\SQLEXPRESS;user=alirazaaslam;password=1234567890;database=midterm");
            System.out.println("Connected with database");
        } catch (SQLException sqle) {
            System.out.print("Connection Error!");
        }       
        return obj1;       
    }    
}
