package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tarun
 */
public class CustomJTable {

        /**
         * ************************METHODS*****************************
         */
        /**
         * The below method is used for insert the data to the jTable & fetching the data from the database
         *
         * @param:JTable ,String tableName,String status 
         * @return:boolean 
	*
         */
        public static boolean insertInJtable(JTable jtb, String table, String status) {
                try {
                        Connection conn = MySqlConnect.connectDB();
                        String sql = "SELECT * FROM " + table + " WHERE status ='" + status + "'";
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        ResultSet rs = preparedStatement.executeQuery();
                        //if(rs.next())
                        jtb.setModel(DbUtils.resultSetToTableModel(rs));
                        return true;
                } catch (Exception e) {
//            e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Exception : " + e.getMessage(), "JCustomJTable", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
        }
}
