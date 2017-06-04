import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class client {
    public static void main(String[] args) {
        panel p = new panel();
        p.setVisible(true);
        JFrame jf = new JFrame();
        jf.setTitle("temperature converter");
        jf.setSize(500, 250);
        jf.setVisible(true);
        jf.add(p);
    }
}
        class panel extends JPanel implements ActionListener {
            JLabel centigrade, fahrenheit, status, temperatureCon;
            JButton clear, convert, done;
            JTextField centigradeVal, fahrenheitVal, statusVal;
            GridBagConstraints gbc = new GridBagConstraints();

            public panel() {
                setLayout(new GridBagLayout());
                temperatureCon = new JLabel("temperature conversion");
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridheight = 1;
                gbc.gridwidth = 8;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                add(temperatureCon, gbc);

                centigrade = new JLabel("centigrade");
                centigrade.setSize(100,100);
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.gridheight = 1;
                gbc.gridwidth = 1;
                add(centigrade, gbc);


                centigradeVal = new JTextField();
                gbc.gridx = 4;
                gbc.gridy = 1;
                add(centigradeVal, gbc);

                fahrenheitVal = new JTextField();
                gbc.gridx = 4;
                gbc.gridy = 2;
                add(fahrenheitVal, gbc);

                statusVal = new JTextField();
                gbc.gridx = 4;
                gbc.gridy = 5;
                add(statusVal, gbc);

                fahrenheit = new JLabel("fahrenheit");
                gbc.gridx = 1;
                gbc.gridy = 2;
                add(fahrenheit, gbc);

                status = new JLabel("status");
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


            }


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
