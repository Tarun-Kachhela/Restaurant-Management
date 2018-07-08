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
public class CategoryDatabase {

        //Data Members
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;

        /**
         * *******************************************************
         *
         * This Class is used to perform insert delete or selecting  operations on the creating the
         * category database
         *
         ********************************************************
         */
        
          /**
         * ************************CONSTRUCTOR*****************************
         * This initialized the connection object & make connection to db
         */
        public CategoryDatabase() {
                conn = MySqlConnect.connectDB();
        }

        /**
         * ************************METHODS*****************************
         */

        /**
                * The below method delete the particular category name to the database
                *
                * @param:categoryName 
                * @return:boolean 
                *
         */
        public boolean delete(String categoryName) {
                try {
                        String sql = "select * from category where categoryname='" + categoryName + "'";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();
                        if (rs.next()) {
                                sql = "delete from category where categoryname='" + categoryName + "'";
                                preparedStatement = conn.prepareStatement(sql);
                                boolean value;
                                value = preparedStatement.execute(sql);
                                return (!value);
                        }
                        return false;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "CategoryDatabase", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
        }
        /**
                * The below method insert the category name into the database
                *
                * @param:categoryName 
                * @return:boolean 
                *
         */
        public boolean insert(String categoryName) {
                try {
                        String sql = "INSERT INTO category(categoryname) VALUES (?)";
                        preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setString(1, categoryName);
                        boolean value;
                        value = preparedStatement.execute();
                        return true;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage(), "CategoryDatabase", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
        }
        /**
                * The below method get all the categories name which is store into the vector 
                *
                * @param:Nothing 
                * @return:Vector  
                *
         */
        public Vector getAllCategories() {
                Vector categories = new Vector();
                int i = 0;
                try {
                        String sql;
                        sql = "SELECT * FROM category";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();
                        while (rs.next()) {
                                categories.add(rs.getString("categoryname"));
                        }
                        return categories;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage() + " getAllCategories", "CategoryDatabase", JOptionPane.ERROR_MESSAGE);
                        return null;
                }
        }
        /**
                * The below method Returns how much categories  are already present into the database
                *
                * @param:Nothing 
                * @return:int
                *
         */
        public int getCategoryCount() {
                int i = 0;
                try {
                        String sql;
                        sql = "SELECT * FROM category";
                        preparedStatement = conn.prepareStatement(sql);
                        rs = preparedStatement.executeQuery();
                        while (rs.next()) {
                                i++;
                        }
                        return i;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception:" + e.getMessage() + " getAllCategories", "CategoryDatabase", JOptionPane.ERROR_MESSAGE);
                        return -1;
                }

        }
}
