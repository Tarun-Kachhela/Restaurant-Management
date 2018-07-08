package Networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import chefui.ChefTable;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Client extends Thread {

        public ObjectOutputStream output;
        public ObjectInputStream input;
        ChefTable chef = null;
        JScrollPane tableModel = null;
        DefaultTableModel model = null;

        /**
         * ************************CONSTRUCTOR*****************************
         * This initialized the ChefTable  object
         */
        public Client(ChefTable chef) {
                this.chef = chef;
        }

        /**
         * ************************METHOD*****************************
         */
        /**
         * The below method use for reading the jJable object which is coming
         * from server class ,also initialized the ObjectInputStream &
         * ObjectOutputStream, set the table which is seen to chefTable class
         * i.e the data can be seen to to chefTable screen which coming from
         * manager
         *
         * @param:Nothng
         * @return:Nothing
         *
         */
        @Override
        public void run() {
                try {
                        Socket socket = new Socket("127.0.0.1", 8888);
                        input = new ObjectInputStream(socket.getInputStream());
                        output = new ObjectOutputStream(socket.getOutputStream());
                        while (true) {
                                model = null;
                                model = (DefaultTableModel) input.readObject();
                                chef.getPendingOrderTable().setModel(model);
                        }
                } catch (SocketTimeoutException e) {
                        JOptionPane.showMessageDialog(null, "sockettime out Exception :" + e.getMessage(), "Client", JOptionPane.ERROR_MESSAGE);
                } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "ioException : " + e.getMessage(), "Client", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception in client: " + e, "Client", JOptionPane.ERROR_MESSAGE);
                }
        }
}
