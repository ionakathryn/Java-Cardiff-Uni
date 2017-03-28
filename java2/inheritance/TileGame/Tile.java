import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;


public class Tile {
    public static void main (String[] args) {

        TileFrame frame = new TileFrame();
        frame.setTitle("Tile Game");
        frame.setVisible(true);
    }
}

class TileFrame extends JFrame implements WindowListener{

    public TileFrame(){
        JFrame frame = new JFrame ("TileGame");

        final int DEFAULT_FRAME_WIDTH = 500;
        final int DEFAULT_FRAME_HEIGHT = 500;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,4));

        setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT);
        JButton buttons[] = new JButton[16];
        JButton shuffleButton = new JButton("Shuffle");
        panel1 = new Panel(new GridLayout(4,4));
        frame.setTitle("Tile Game");       
        

        for (int i = 0; i < 16; i++){
            buttons[i] = new JButton();
            buttons[i].setLabel(Integer.toString(i+1));
            panel1.add(buttons[i]);
           
        }
        panel1.add(shuffleButton);
        add(panel1);
        

    }

    private Panel panel1,panel2;

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
