import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;


public class Client {
    public static void main(String[] args) {
        panel p = new panel();
        p.setVisible(true);
        JFrame jf = new JFrame();
        // WindowCloser listener = new WindowCloser();
        jf.setSize(500, 250);
        jf.setVisible(true);
        jf.add(p);
        p.waitForPackets();
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
        clear.addActionListener(this);
        add(clear,gbc);

        convert = new JButton("convert");
        gbc.gridx = 2;
        gbc.gridy = 3;
        convert.addActionListener(this);
        add(convert,gbc);

        done = new JButton("done");
        gbc.gridx = 3;
        gbc.gridy = 3;
        done.addActionListener(this);
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
    private DatagramPacket sendPacket,recievePacket;



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert){
            System.out.println("convert pressed");
            isNumeric(centigradeVal.getText());

                    /* begin connection with server */
            try{

                byte[] data = centigradeVal.getText().getBytes();
                sendPacket = new DatagramPacket( data, data.length,
                        InetAddress.getLocalHost(), 5000 );
                socket.send(sendPacket);
                System.out.println("data sent to server...");
            }
            catch(IOException ioe){
                System.out.println(ioe.toString());
                System.exit(1);
            }

        }

        if (e.getSource() == clear){
            fahrenheitVal.setText("");
            centigradeVal.setText("");
            statusVal.setText("");
        }

        if(e.getSource() == done){
            System.exit(1);
        }
    }



    public void isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            statusVal.setText("Please enter numeric value for farenheit");
        }

    }

    public void waitForPackets(){
        while(true){
            try{
                byte[] data = new byte[1024];
                recievePacket = new DatagramPacket(data,data.length);
                socket.receive(recievePacket);
                String str = new String(recievePacket.getData());
                System.out.println("result is..." + str);
            }
            catch(IOException ioe){
                ioe.printStackTrace();
                System.exit(1);
            }
        }
    }

}


            
