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
        jf.setTitle("**** Plaintext to Encyption ****");
        jf.add(p);
        p.waitForPackets();
    }
}

class panel extends JPanel implements ActionListener {


    public panel() {
        setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 8;
        gbc.fill = GridBagConstraints.HORIZONTAL;


        plaintext = new JLabel("     !=== Plaintext to Encrypt ===!");
        plaintext.setSize(100,100);
        gbc.weightx = 0;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        add(plaintext, gbc);


        plaintextVal = new JTextField("");
        gbc.gridx = 3;
        gbc.gridy = 1;
        plaintextVal.setSize(100,100);
        add(plaintextVal, gbc);

        encryptedVal = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 2;
        encryptedVal.setEditable(false);
        add(encryptedVal, gbc);

        statusVal = new JTextField();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.weightx = 3;
        statusVal.setEditable(false);
        add(statusVal, gbc);

        encrypted = new JLabel("     !=== Encrypted Result      ===!");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(encrypted, gbc);


        status = new JLabel("      Status");
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(status, gbc);

        clear = new JButton("Clear");
        gbc.gridx = 1;
        gbc.gridy = 4;
        clear.addActionListener(this);
        add(clear,gbc);

        convert = new JButton("Convert");
        gbc.gridx = 2;
        gbc.gridy = 4;
        convert.addActionListener(this);
        add(convert,gbc);

        done = new JButton("Done");
        gbc.gridx = 3;
        gbc.gridy = 4;
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



    private JLabel encrypted, plaintext, status, conv;
    private JButton clear, convert, done;
    private JTextField encryptedVal, plaintextVal, statusVal;
    private GridBagConstraints gbc = new GridBagConstraints();
    private DatagramSocket socket;
    private DatagramPacket sendPacket,recievePacket,recievedPacket;



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert){
            System.out.println("convert pressed");
            // isNumeric(binaryVal.getText());

                    /* begin connection with server */
            try{

                byte[] data = plaintextVal.getText().getBytes();
                sendPacket = new DatagramPacket(data, data.length,
                        InetAddress.getLocalHost(), 5000 );
                socket.send(sendPacket);
                System.out.println("Plaintext sent to server...");

            }
            catch(IOException ioe){
                System.out.println(ioe.toString());
                System.exit(1);
            }

        }

        if (e.getSource() == clear){
            plaintextVal.setText("");
            encryptedVal.setText("");
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
                recievedPacket = new DatagramPacket(data,data.length);
                socket.receive(recievedPacket);
                String str = new String(recievedPacket.getData());
                System.out.println("result is..." + str);
                encryptedVal.setText(str);
            }
            catch(IOException ioe){
                ioe.printStackTrace();
                System.exit(1);
            }
        }
    }

}


            
