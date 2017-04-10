import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.util.Random;
import java.util.Arrays;

public class Tile {
    public static void main (String[] args) {

        TileFrame frame = new TileFrame();
        frame.setTitle("Tile Game");
        frame.setVisible(true);
    }
}

class TileFrame extends JFrame implements ActionListener{


    public TileFrame(){
        Panel panel1,panel2;
        JFrame frame = new JFrame ("TileGame");

        final int DEFAULT_FRAME_WIDTH = 500;
        final int DEFAULT_FRAME_HEIGHT = 500;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,4));

        setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT);
        shuffleButton = new JButton("Shuffle");
        panel1 = new Panel(new GridLayout(4,4));
        panel2 = new Panel(new GridLayout(2,2));
        frame.setTitle("Tile Game");

        // add button arr to frame
        for (int i = 0; i < 16; i++){
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            buttons[i].setText(Integer.toString(i+1));
            panel1.add(buttons[i]);

        }

        blank = new JButton(" ");
        blank.addActionListener(this);
        panel1.add(blank);
        shuffleButton.addActionListener(this);
        panel2.add(shuffleButton);
        add(panel1);
        add(panel2);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == shuffleButton){
            System.out.println("shuffletruffle");
            Shuffle(buttons);
            System.out.println(Arrays.toString(buttons));
        }

        if(e.getSource() == buttons[10]) {
            System.out.println("test");
        }

    }

    JButton shuffleButton,blank;
    JButton[] buttons = new JButton[16];

    public void Shuffle(JButton[] arr){
        int numOfElements = arr.length-1;
        for (int i = 0; i < numOfElements-1; i++){
            int index = i + (int) (Math.random() * (numOfElements-2));
            JButton temp = arr[index];
            arr[i] = temp;
        }
    }
}






/*public class MouseAdapter implements MouseListener{
}
*/
