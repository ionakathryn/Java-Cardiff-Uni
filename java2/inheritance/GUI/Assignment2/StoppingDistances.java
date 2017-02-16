import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoppingDistances
    {
        public static void main(String[] args)
        {
            SpeedFrame frame = new SpeedFrame();
            frame.setTitle("Stopping Distances");
            frame.setVisible (true);
        }
    }
    class SpeedFrame extends Frame implements ActionListener
    {
        public SpeedFrame()
        {
            // set frame size
            final int DEFAULT_FRAME_WIDTH = 450;
            final int DEFAULT_FRAME_HEIGHT = 250;
            setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);

            // set layout
            GridLayout layout = new GridLayout( 5, 2);
            setLayout(layout);
            add(new Label("Start"));

            // create two new panels
            panel1 = new Panel();
            panel2 = new Panel();


            startSpeed = new TextField();
            add(startSpeed);


            add(new Label("End"));

            endSpeed = new TextField();
            add(endSpeed);
            endSpeed.setEditable(true);

            add(new Label ("Increment"));

            incrementSpeed = new TextField();
            add(incrementSpeed);
            incrementSpeed.setEditable(true);

            clear = new Button("Clear");
            add(clear);
            clear.addActionListener(this);

            table = new Button("Table");
            add(table);
            table.addActionListener(this);

            exit = new Button("Exit");
            add(exit);
            exit.addActionListener(this);

            add(panel2);
        }

        public void actionPerformed( ActionEvent e){
            if (e.getSource() == clear)
            {
                startSpeed.setText(" ");
                incrementSpeed.setText(" ");
                endSpeed.setText(" ");
            }
            else if (e.getSource() == exit) {
                System.exit(0);
            }
        }
        private TextField startSpeed,endSpeed,incrementSpeed;
        private Button clear,table,exit;
        private Panel panel1, panel2;
    }

