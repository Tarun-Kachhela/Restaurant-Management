package networking;

import java.net.*;
import UIDesign.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Server extends Thread {

        Socket clientSocket = null;
        Notification notification = null;
        Dashboard dashboard = null;
        Thread readingThread = null;

        /**
         * ************************CONSTRUCTOR*****************************
         * This initialized the Notification obj & Dashboard object
         */
        public Server(Notification notification, Dashboard dashboard) {
                this.notification = notification;
                this.dashboard = dashboard;
                startReading();
        }

        public void run() {
                try {
                } catch (Exception e) {
//                e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Exception 1:" + e, "Server", JOptionPane.ERROR_MESSAGE);
                }
        }
//    public void initStream(){
//          try {
//            System.out.println("inside initstream" + clientSocket.getInputStream() + "output :" +clientSocket.getOutputStream());
//            in = new ObjectInputStream(clientSocket.getInputStream());
//            System.out.println("after input stream" + in);
//            out = new ObjectOutputStream(clientSocket.getOutputStream());
//            System.out.println("after output:" + out);
//        } catch (IOException ex) {
//            System.out.println(ex);
//            JOptionPane.showMessageDialog(null,"tp","Server",JOptionPane.ERROR_MESSAGE);
//        }
//    }

        /**
         * ************************METHODS*****************************
         */

        /**
         * The below method start reading the ID(string) which is ready order & insert the data to ready order table & Remove the data from 
         * the not ready table
         *
         * @param:Nothing
         * @return:Nothing
         *
         */
        public void startReading() {
                new Thread(() -> {

                        try {
                                ServerSocket serverSocket = new ServerSocket(8888);
                                /*class which create the server socket & tell the server socket to listen the 
                                 specific port*/
                                clientSocket = serverSocket.accept();
                                dashboard.initStream();

                                while (true) {
                                        String getID = null;
                                        getID = (String) dashboard.in.readObject();
                                        int getReadyOrderID = Integer.parseInt(getID);
                                        if (dashboard.orderDatabase.updateStatus(getReadyOrderID)) {
                                                String tableNum = dashboard.orderDatabase.getRowData(getReadyOrderID, 2);
                                                String orderName = dashboard.orderDatabase.getRowData(getReadyOrderID, 3);
                                                String quantity = dashboard.orderDatabase.getRowData(getReadyOrderID, 4);
                                                TrayIconDemo.displayTray(orderName, tableNum, quantity);

                                                dashboard.dashboardPanel.setAllValues();

                                                dashboard.customJTable.insertInJtable(notification.getTblPendingOrder(), "orderitem", "not ready");
                                                dashboard.customJTable.insertInJtable(notification.getTblReadyOrder(), "orderitem", "ready");
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Status is not update : ", "Server", JOptionPane.ERROR_MESSAGE);
                                        }

                                }
                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Exception 2: " + e, "Server", JOptionPane.ERROR_MESSAGE);
                        }
                }).start();
        }
        
        /**
         * The below method Write the DefaultTableModel object to ObjectOutputStream That can be ready from client 
         *
         * @param:JTable object
         * @return:Boolean
         *
         */
        public boolean sendTableToChef(JTable table) {
                try {
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        dashboard.out.writeObject(model);
                        dashboard.out.flush();
                        return true;
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Exception 3:" + e, "Server", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
        }
        //getter
        public Socket getClientSocket() {
                return clientSocket;
        }
}
