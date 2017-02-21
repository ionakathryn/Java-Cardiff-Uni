import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Panel;
import java.io.PrintStream;

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

            // create two new panels
            panel1 = new Panel();
            panel1.setLayout(new GridLayout(5,2));

            panel1.add(new Label("Start"));
            startSpeed = new TextField();
            panel1.add(startSpeed);


            panel1.add(new Label("End"));
            endSpeed = new TextField();
            panel1.add(endSpeed);

            panel1.add(new Label ("Increment"));
            incrementSpeed = new TextField();
            panel1.add(incrementSpeed);


            clear = new Button("Clear");
            panel1.add(clear);
            clear.addActionListener(this);

            table = new Button("Table");
            panel1.add(table);
            table.addActionListener(this);

            exit = new Button("Exit");
            panel1.add(exit);
            exit.addActionListener(this);

            panel2 = new Panel();
            panel2.setLayout(new GridLayout(1,1) );
            area = new TextArea( "", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY );
            area.setEditable(false);
            panel2.add(area);
            setLayout(new GridLayout(2,1));

            add(panel1);
            add(panel2);



        }

        public void actionPerformed( ActionEvent e){
            if (e.getSource() == clear)
            {
                startSpeed.setText(" ");
                incrementSpeed.setText(" ");
                endSpeed.setText(" ");
                area.setText(" ");
            }
            else if (e.getSource() == exit) {
                System.exit(0);
            }
            else if (e.getSource() == table) {
                public static boolean isInteger(String )
                } else {

                    {
                        area.append("   ********************************************\n");
                        area.append("   * Speed(mph) *  Distance(feet)  *\n");
                        area.append("   ********************************************\n");

                        start = Double.parseDouble(startSpeed.getText());
                        end = Double.parseDouble(endSpeed.getText());
                        increment = Double.parseDouble(incrementSpeed.getText());
                        for (double currentSpeed = start; currentSpeed <= end; currentSpeed += increment) {
                            stoppingDistance = (currentSpeed * currentSpeed) / 20 + currentSpeed;
                            area.append(currentSpeed + "\t \t" + stoppingDistance + "\n");
                        }


                    }
                }
            }
        }
        private TextField startSpeed,endSpeed,incrementSpeed;
        private Button clear,table,exit;
        private Panel panel1,panel2;
        private TextArea area;
        private double start,end,increment, stoppingDistance;
    }

