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

class TileFrame extends JFrame implements WindowListener,ActionListener{


    public TileFrame(){
        JFrame frame = new JFrame ("TileGame");

        final int DEFAULT_FRAME_WIDTH = 500;
        final int DEFAULT_FRAME_HEIGHT = 500;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,4));

        setSize(DEFAULT_FRAME_WIDTH,DEFAULT_FRAME_HEIGHT);
        JButton shuffleButton = new JButton("Shuffle");
        panel1 = new Panel(new GridLayout(4,4));
        panel2 = new Panel(new GridLayout(1,2));
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



    private Panel panel1,panel2;
    private JButton buttons[] = new JButton[16],blank;

    public void actionPerformed(ActionEvent event)
    {
       if (event.getSource() != "blank"){
        System.out.println("Error: move not valid");
        System.exit(1);
       }
       if (event.getSource() == blank){
        
       }      
    }

    public void MouseClicked (MouseEvent e){
        final int index = MouseEvent.getPoint();
    }

    public void mouseExited(MouseEvent e){};
    public void mouseEntered(MouseEvent e){};
    public void mousePressed(MouseEvent e){};
    public void mouseReleased(MouseEvent e){};




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
