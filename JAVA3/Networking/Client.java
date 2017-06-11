import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Client {
    public static void main(String[] args) {
        panel p = new panel();
        p.setVisible(true);
        JFrame jf = new JFrame();
        WindowCloser listener = new WindowCloser();
        jf.addWindowListener( listener );
        jf.setSize(500, 250);
        jf.setVisible(true);
        jf.add(p);
    }
}
        class panel extends JPanel implements ActionListener {
            

            public panel() {
                setLayout(new GridBagLayout());
                temperatureCon = new JLabel("                  temperature conversion     ");
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weightx = 3;
                gbc.gridheight = 1;
                gbc.gridwidth = 8;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                add(temperatureCon, gbc);

                centigrade = new JLabel("     centigrade");
                centigrade.setSize(100,100);
                gbc.weightx = 0;
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.gridheight = 1;
                gbc.gridwidth = 1;
                add(centigrade, gbc);


                centigradeVal = new JTextField();
                gbc.gridx = 3;
                gbc.gridy = 1;
                centigradeVal.setSize(100,100);
                add(centigradeVal, gbc);

                fahrenheitVal = new JTextField();
                gbc.gridx = 3;
                gbc.gridy = 2;
                fahrenheitVal.setEditable(false);
                add(fahrenheitVal, gbc);

                statusVal = new JTextField();
                gbc.gridx = 2;
                gbc.gridy = 5;
                gbc.weightx = 3;
                statusVal.setEditable(false);
                add(statusVal, gbc);

                fahrenheit = new JLabel("     fahrenheit");
                gbc.gridx = 1;
                gbc.gridy = 2;
                add(fahrenheit, gbc);

                status = new JLabel("      status");
                gbc.gridx = 1;
                gbc.gridy = 5;
                gbc.gridwidth = 1;
                add(status, gbc);

                clear = new JButton("clear");
                gbc.gridx = 1;
                gbc.gridy = 3;
                add(clear,gbc);

                convert = new JButton("convert");
                gbc.gridx = 2;
                gbc.gridy = 3;
                add(convert,gbc);

                done = new JButton("done");
                gbc.gridx = 3;
                gbc.gridy = 3;
                add(done,gbc);

                try{
                    socket = new DatagramSocket();
                }
                catch(SocketException se){
                    statusVal.setText("Cannot connect to server...");
                    System.exit(1);
                }
            }


            
            private JLabel centigrade, fahrenheit, status, temperatureCon;
            private JButton clear, convert, done;
            private JTextField centigradeVal, fahrenheitVal, statusVal;
            private GridBagConstraints gbc = new GridBagConstraints();
            private DatagramSocket socket;



            public void actionPerformed(ActionEvent e) {

            }

        }


        /*try (Socket s = new Socket("127.0.0.1",3000)) {
            System.out.println("Connection established!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        */
