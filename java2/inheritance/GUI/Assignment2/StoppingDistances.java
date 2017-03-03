import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoppingDistances {
    public static void main(String[] args) {
        SpeedFrame frame = new SpeedFrame();
        frame.setTitle("Stopping Distances");
        frame.setVisible(true);
    }
}
class SpeedFrame extends Frame implements ActionListener {
    public SpeedFrame() {
        // set frame size
        final int DEFAULT_FRAME_WIDTH = 450;
        final int DEFAULT_FRAME_HEIGHT = 250;
        setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);

        // create two new panels
        panel1 = new Panel();
        panel1.setLayout(new GridLayout(5, 2));

        Label start = new Label("Start",Label.CENTER);
        start.setBackground(new Color(255, 255, 153));
        panel1.add(start);

        startSpeed = new TextField();
        panel1.add(startSpeed);

        Label end = new Label("End",Label.CENTER);
        end.setBackground(new Color(255, 255, 153));
        panel1.add(end);

        endSpeed = new TextField();
        panel1.add(endSpeed);

        Label increment = new Label("Increment",Label.CENTER);
        increment.setBackground(new Color(255, 255, 153));
        panel1.add(increment);

        incrementSpeed = new TextField();
        panel1.add(incrementSpeed);
        clear = new Button("Clear");
        clear.setBackground(new Color(0, 153, 0));
        panel1.add(clear);
        clear.addActionListener(this);

        table = new Button("Table");
        table.setBackground(new Color(0, 153, 0));
        panel1.add(table);
        table.addActionListener(this);

        exit = new Button("Exit");
        exit.setBackground(new Color(0, 153, 0));
        panel1.add(exit);
        exit.addActionListener(this);
        panel2 = new Panel();
        panel2.setLayout(new GridLayout(1, 1));
        area = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        area.setEditable(false);
        panel2.add(area);
        setLayout(new GridLayout(2, 1));
        add(panel1);
        add(panel2);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {


            startSpeed.setText("");
            incrementSpeed.setText("");
            endSpeed.setText("");
            area.setText("");
        } else if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == table) {
            checkValidVals();
            checkNumeric(startSpeed.getText());
            checkNumeric(endSpeed.getText());
            checkNumeric(incrementSpeed.getText());

            if (checkNumericValue(startSpeed.getText(), endSpeed.getText()) == true &&
                    checkNumeric(startSpeed.getText()) == true && checkNumeric(endSpeed.getText()) == true
                    && checkNumeric(incrementSpeed.getText()) == true) {
                {
                    area.append(" *********************************\n");
                    area.append(" * Speed(mph) * Distance(feet) *\n");
                    area.append(" *********************************\n");




                    start = Integer.parseInt(startSpeed.getText());
                    end = Integer.parseInt(endSpeed.getText());
                    increment = Integer.parseInt(incrementSpeed.getText());
                    for (int currentSpeed = start; currentSpeed <= end; currentSpeed += increment) {
                        stoppingDistance = (currentSpeed * currentSpeed) / 20 + currentSpeed;
                        area.append("*" + currentSpeed + "\t \t" + "*" + stoppingDistance + "\n");
                        area.append(" *********************************\n");

                    }
                }
            }
        }
    }
    private TextField startSpeed, endSpeed, incrementSpeed;
    private Button clear, table, exit;
    private Panel panel1, panel2;
    private TextArea area;
    private int start, end, increment, stoppingDistance;

    public void checkValidVals() {
        if (startSpeed.getText().equals("") || endSpeed.getText().equals("") || incrementSpeed.getText().equals("")) {
            area.append("Enter valid values\n");
        }
    }
    public boolean checkNumeric(String input) {
        try {
            int i = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException nonNumeric) {
            area.append("Enter numeric value\n");
            return false;
        }
    }
    public boolean checkNumericValue(String input, String input2) {
        int startval = Integer.parseInt(input);
        int endval = Integer.parseInt(input2);
        if (endval < startval) {
            area.append("End value must be larger than start value\n");
            return false;
        } else {
            return true;
        }
    }
}
