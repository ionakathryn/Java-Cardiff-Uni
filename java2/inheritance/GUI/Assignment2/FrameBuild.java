import javax.swing.*;
import java.awt.*;

public class FrameBuild {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java2: Assignment2");
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setLayout(new GridLayout(6,2,5,10));
        panel2.setLayout(new GridLayout(6,2,5,10));

        JLabel start = new JLabel("Start");
        JLabel end = new JLabel("End");
        JLabel increment = new JLabel ("Increment");
        JLabel clear = new JLabel ("Clear");
        JLabel exit = new JLabel ("Exit");

        JLabel label_10 = new JLabel("10");
        JLabel label_40 = new JLabel("40");
        JLabel label10 = new JLabel("10");
        JLabel table = new JLabel("Table");

        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        panel1.add(start);
        panel1.add(end);
        panel1.add(increment);
        panel1.add(clear);
        panel1.add(exit);

        panel2.add(label_10);
        panel2.add(label_40);
        panel2.add(label10);
        panel2.add(table);


        frame.add(panel1);
        frame.add(panel2);
    }
}
