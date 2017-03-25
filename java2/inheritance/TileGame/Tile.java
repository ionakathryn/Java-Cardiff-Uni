import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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

        setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT);
        Button buttons[] = new Button[16];
        Button shuffleButton = new Button("Shuffle");
        panel1 = new Panel();
        panel1.setLayout(new GridLayout(4,0));
        panel2 = new Panel();
        panel2.setLayout(new GridLayout(4,2));

        for (int i = 0; i < 16; i++){
            buttons[i] = new Button("hello");
            panel1.add(buttons[i]);
        }
        panel2.add(shuffleButton);
        add(panel1);
        add(panel2);

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
