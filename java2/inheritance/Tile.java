import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.GridLayout;

public class Tile {
    public static void main (String[] args) {

        TileFrame frame = new TileFrame();
        frame.setTitle("Tile Game");
        frame.setVisible(true);
    }
}

class TileFrame extends Frame implements WindowListener{
    public TileFrame(){
        final int DEFAULT_FRAME_WIDTH = 500;
        final int DEFAULT_FRAME_HEIGHT = 500;
        setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT);

        panel1 = new Panel();
        panel2 = new Panel();
        panel1.setLayout(new GridLayout(4,4));
        panel2.setLayout(new GridLayout(1,2));
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
