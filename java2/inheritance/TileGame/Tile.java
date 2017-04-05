import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.AWTEvent;


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
        JButton buttons[] = new JButton[16],blank;
        JFrame frame = new JFrame ("TileGame");

        final int DEFAULT_FRAME_WIDTH = 500;
        final int DEFAULT_FRAME_HEIGHT = 500;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,0));

        setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT); 
        JButton shuffleButton = new JButton("Shuffle");
        panel1 = new Panel(new GridLayout(4,4));
        panel2 = new Panel(new GridLayout(2,2));
        frame.setTitle("Tile Game");       
        

        for (int i = 0; i < 16; i++){
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            buttons[i].setText(Integer.toString(i+1));
            panel1.add(buttons[i]);
           
        }

        blank = new JButton(" ");
        panel1.add(blank);
        panel2.add(shuffleButton);
        add(panel1);
        add(panel2);

    }

    public void actionPerformed(ActionEvent e){
        System.out.println("test");

    }
}

/*public void Shuffle(ActionEvent e){
    // implement fishers shuffle algorithm here

}
*/

/*public class MouseAdapter implements MouseListener{

}
*/


