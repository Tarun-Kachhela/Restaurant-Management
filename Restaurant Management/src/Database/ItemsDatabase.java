package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Tarun
 */
public class ItemsDatabase {
//        data members

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;

        /**
         * *******************************************************
         *
         * This Class is used to perform insert delete or selecting operations
         * on the creating the category database
         *
         ********************************************************
         */
        /**
         * ************************CONSTRUCTOR*****************************
         * This initialized the connection object & make connection to db
         */
        public ItemsDatabase() {
                conn = MySqlConnect.connectDB();
        }

        /**
         * ************************METHODS*****************************
         */
        /**
         * The below method delete the particular Item name into the database
         *
         * @param:itemName
         * @return:boolean
         *
         */
        public boolean delete(String itemName) {
                try {
                        String sql = "select * from items where itemname='" + itemName + "'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();

                        if (rs.next()) {
                                sql = "delete from items where itemname='" + itemName + "'";
                                preparedStatement = conn.prepareStatement(sql);
                                boolean value;
                                value = preparedStatement.execute(sql);
                                return (!value);
                        }
                        return false;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "ItemsDatabase", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

        }
        
        /**
                * The below method insert the data in the database
                *
                * @param:categoryName,itemName,price 
                * @return:boolean
                *
         */
        public boolean insert(String categoryName, String itemName, int price) {
                try {
                        String sql = "INSERT INTO items(category,itemname,rate) VALUES (?,?,?)";
                        preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setString(1, categoryName);
                        preparedStatement.setString(2, itemName);
                        preparedStatement.setInt(3, price);

                        boolean value;
                        value = preparedStatement.execute();
                        return (!value);

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "ItemsDatabase", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

        }
        
        /**
                * The below method will give you the items of this particular  category
                *
                * @param:Category 
                * @return:vector 
                *
         */
        public Vector getAllItems(String Category) throws Exception {
                Vector items = new Vector();
                try {
                        String sql;
                        sql = "SELECT * FROM items where category='" + Category + "'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();
                        while (rs.next()) {
                                items.add(rs.getString("itemname"));
                        }
                        return items;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage() + " getAllItems", "ItemsDatabase", JOptionPane.ERROR_MESSAGE);
                        throw e;
                }
        }
        
        /**
                * The below method get the price of the item
                *
                * @param:items 
                * @return:int
                *
         */
        public int getPrice(String items) {
                int price = 0;
                try {
                        String sql;
                        sql = "SELECT rate FROM items where itemname='" + items + "'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();
                        while (rs.next()) 
                                price = rs.getInt("rate");
                        return price;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage() + " getAllItems", "ItemsDatabase", JOptionPane.ERROR_MESSAGE);
                        return -1;
                }
        }
        
        /**
                * The below method get the integer when tell how many items are there
                *
                * @param:Nothing 
                * @return:int
                *
         */
        public int getAllItems() {
                try {
                        String sql;
                        sql = "SELECT * FROM items";
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
                        ResultSet rs = preparedStatement.executeQuery();
                        int totalTurnOver = 0;
                        while (rs.next()) {
                                int quantity = rs.getInt("quantity");
                                int price = getPrice(rs.getString("ordername"));
                                System.out.println("goes" + quantity);

                                totalTurnOver += price * quantity;
                                System.out.println("total : " + totalTurnOver);
                        }
                        return totalTurnOver;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception : " + e.getMessage() + " getTurnOver ", "ItemsDatabase", JOptionPane.ERROR_MESSAGE);
                        return -1;
                }
        }
}
