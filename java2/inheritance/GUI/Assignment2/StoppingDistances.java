import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Panel;

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

            	

           		checkValidVals();
           		checkNumeric(startSpeed.getText());
           		checkNumeric(endSpeed.getText());
           		checkNumeric(incrementSpeed.getText());
           		checkNumericValue(startSpeed.getText(), endSpeed.getText());
             
                    {
                        area.append("   ********************************************\n");
                        area.append("   * Speed(mph) *  Distance(feet)  *\n");
                        area.append("   ********************************************\n");

                        start = Integer.parseInt(startSpeed.getText());
                        end = Integer.parseInt(endSpeed.getText());
                        increment = Integer.parseInt(incrementSpeed.getText());
                        for (int currentSpeed = start; currentSpeed <= end; currentSpeed += increment) {
                            stoppingDistance = (currentSpeed * currentSpeed) / 20 + currentSpeed;
                            area.append(currentSpeed + "\t \t" + stoppingDistance + "\n");
                        }


                    
                }
                }
            
        }
        private TextField startSpeed,endSpeed,incrementSpeed;
        private Button clear,table,exit;
        private Panel panel1,panel2;
        private TextArea area;
        private int start,end,increment, stoppingDistance;

        public void checkValidVals()
            	{
            		if (startSpeed.getText().equals("") || endSpeed.getText().equals("") || incrementSpeed.getText().equals(""))
            	{
            		area.append ("Enter valid values");
            	}

            	}

        public boolean checkNumeric(String input)
        {
        	try
        	{
        		Integer.parseInt(input);
        		return true;
        	}
        	catch (NumberFormatException nonNumeric)
        	{
        		area.append ("Enter numeric values");
        		return false;
        	}
            
        }

        public boolean checkNumericValue(String input, String input2)
        {
        
        int startval = Integer.parseInt(input);
        int endval = Integer.parseInt(input2);

        if (endval < startval)
        {
        	area.append ("End value must be larger than start value");
        	return false;
        }
        else
        {
        	return true;
        }
    	}
    }        
