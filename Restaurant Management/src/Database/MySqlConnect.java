package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tarun
 */
public class MySqlConnect {
        /*
         * ************************************************************
         * This class is used to establish Connection with the Database under
         * The username 'tarun'   
         **************************************************************
         */
        
        /*
         * ***********************METHODS*****************************
         */
        /**
         * The below method is used to connect with Database.This is a static  method. so we can directly call with class name
         *
         * @param:Nothing
         * @return:Connection object
         */
        public static Connection connectDB() {
                try {
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "tarun", "tarun123");
                        return conn;
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Connection Unsuccessfull : " + e.getMessage(), "MySqlConnect", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Connection Unsuccessfull : " + e.getMessage(), "MySqlConnect", JOptionPane.ERROR_MESSAGE);
                }
                return null;
        }
}
