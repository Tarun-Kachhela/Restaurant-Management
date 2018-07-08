package UIDesign;

/**
 *
 * @author Tarun
 */
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;

public class TrayIconDemo {

        //This is just for testing

        public static void main(String[] args) throws AWTException, MalformedURLException {
                if (SystemTray.isSupported()) {
                        TrayIconDemo td = new TrayIconDemo();
//                        td.displayTray(null, null, null);
                } else {
                        System.err.println("System tray not supported!");
                }
        }

        /**
         * The below method will show the trayicon ,this will call when the food
         * is ready from the chef. the chef will send that the order is ready
         * then it will call
         *
         * @param:foodname,TAbleno,quantity
         * @return:Nothing
         *
         */
        public static void displayTray(String foodName, String tableNo, String quantity) throws AWTException, MalformedURLException {
                //Obtain only one instance of the SystemTray object
                SystemTray tray = SystemTray.getSystemTray();

                //If the icon is a file
                Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\dell\\Desktop\\picture\\bulb.gif");
                //Alternative (if the icon is on the classpath):
                //Image image = Toolkit.getToolkit().createImage(getClass().getResource("icon.png"));

                TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
                //Let the system resize the image if needed
//        trayIcon.setImageAutoSize(true);
                //Set tooltip text for the tray icon
                trayIcon.setToolTip("System tray icon demo");
                tray.add(trayIcon);

                trayIcon.displayMessage(foodName + " is ready!!", "on Table number: " + tableNo + "\n quantity : " + quantity, MessageType.INFO);

//         System.out.print("\0073"); // \007 is the ASCII bell
//         System.out.flush();
                Toolkit.getDefaultToolkit().beep();
        }

}
