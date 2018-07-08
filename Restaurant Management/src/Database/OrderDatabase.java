
package Database;

import UIDesign.Dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tarun
 */
public class OrderDatabase {

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;
        Dashboard dashboard;

        /**
         * ************************CONSTRUCTOR*****************************
         * This initialized the connection object & make connection to db &also  initialized the Dashboard  object
         */
        public OrderDatabase(Dashboard dashboard) {
                conn = MySqlConnect.connectDB();
                this.dashboard = dashboard;
        }
        
        /**
         * ************************METHODS*****************************
         */

        /**
                * The below method delete the particular order name to the database
                *
                * @param:tableNo,itemName ,quantity
                * @return:boolean 
                *
         */
        public boolean delete(int tblNo, String itemName, int quantity) {
                try {
                        String sql = "select * from orderitem where ordername='" + itemName + "' and quantity=" + quantity + " and tablenum=" + tblNo + " and status='ready'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();

                        if (rs.next()) {
                                sql = "delete from orderitem where ordername='" + itemName + "' and quantity=" + quantity + " and tablenum=" + tblNo + " and status='ready'";
                                preparedStatement = conn.prepareStatement(sql);
                                boolean value;
                                value = preparedStatement.execute(sql);
                                return (!value);
                        }
                        return false;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "OrderDatabase", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
        }
        /**
                * The below method insert the data to database(orderitem table in database)
                *
                * @param:tableNo,itemName ,quantity
                * @return:boolean 
                *
         */
        public boolean insert(String tblNo, String itemName, int quantity) {
                try {
                        String sql = "INSERT INTO orderitem(tablenum,ordername,quantity,status) VALUES (?,?,?,?)";
                        preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setString(1, tblNo);
                        preparedStatement.setString(2, itemName);
                        preparedStatement.setInt(3, quantity);
                        preparedStatement.setString(4, "not ready");

                        preparedStatement.execute();
                        return true;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "OrderDatabase", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

        }
        /**
                * The below method is use for update the order is ready whatever the id is passed
                *
                * @param:int id 
                * @return:boolean 
                *
         */
        public boolean updateStatus(int id) {
                try {
                        String sql = "select * from orderitem where id='" + id + "'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();

                        if (rs.next()) {

                                sql = "update orderitem set status='ready' where id='" + id + "'";
                                preparedStatement = conn.prepareStatement(sql);
                                preparedStatement.execute(sql);
                                return true;
                        }
                        return false;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "OrderDatabase", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
        }
        /**
                * The below method get the row whatever id is passed then row will be got
                *
                * @param:tableNo,itemName ,quantity
                * @return:boolean 
                *
         */
        public String getRowData(int id, int coloumNum) {
                try {
                        String sql = "select * from orderitem where id='" + id + "'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();

                        if (rs.next()) {
                                String getData = rs.getString(coloumNum);
                                return getData;
                        }
                        return null;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "OrderDatabase", JOptionPane.ERROR_MESSAGE);
                        return null;
                }
        }
        /**
                * The below method get the ready orders in database
                *
                * @param:Nothing 
                * @return:int
                *
         */
        public int getReadyOrder() {
                try {
                        String sql;
                        sql = "SELECT * FROM orderitem Where status='ready'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();
                        int i = 0;
                        while (rs.next()) {
                                i++;
                        }
                        return i;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage() + " getAllItems", "ItemsDatabase", JOptionPane.ERROR_MESSAGE);
                        return -1;
                }
        }
        /**
                * The below method get the turn over 
                *
                * @param:Nothing 
                * @return:int
                *
         */
        public int getTurnOver() {
                try {
                        String sql;
                        sql = "SELECT * FROM orderitem WHERE status = 'ready'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();
                        int totalTurnOver = 0;
                        while (rs.next()) {
                                int price = dashboard.itemsDatabase.getPrice(rs.getString("ordername"));
                                int quantity = rs.getInt(4);
                                totalTurnOver += price * quantity;
                        }
                        return totalTurnOver;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception : " + e.getMessage() + " getTurnOver ", "ItemsDatabase", JOptionPane.ERROR_MESSAGE);
                        return -1;
                }
        }
}
