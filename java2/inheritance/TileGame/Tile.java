import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tile {
    public static void main (String[] args) {

        //creates GUI
        TileFrame frame = new TileFrame();
        frame.setTitle("Tile Game");
        frame.setVisible(true);
    }
}

class TileFrame extends JFrame implements ActionListener, MouseListener{


    public TileFrame() {
        JFrame frame = new JFrame("TileGame");

        final int DEFAULT_FRAME_WIDTH = 500;
        final int DEFAULT_FRAME_HEIGHT = 500;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        shuffleButton = new JButton("Shuffle");
        panel1 = new Panel(new GridLayout(4, 4));
        panel2 = new Panel(new GridLayout(2, 2));
        frame.setTitle("Tile Game");

        for (int i = 0; i < 16; i++){
                buttons[i] = new JButton();
                buttons[i].addActionListener(this);
                buttons[i].setText(Integer.toString(i+1));
                panel1.add(buttons[i]);

        }
        add(panel1);
        blank = new JButton(" ");
        blank.addActionListener(this);


        shuffleButton.addActionListener(this);

        add(panel2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons[1]){
            if (count < 1){
                count = 1;
                firstClick = buttons[1];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[2]){
            if (count < 1){
                count = 1;
                firstClick = buttons[2];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[3]){
            if (count < 1){
                count = 1;
                firstClick = buttons[3];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[4]){
            if (count < 1){
                count = 1;
                firstClick = buttons[4];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[5]){
            if (count < 1){
                count = 1;
                firstClick = buttons[5];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[6]){
            if (count < 1){
                count = 1;
                firstClick = buttons[6];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[7]){
            if (count < 1){
                count = 1;
                firstClick = buttons[7];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[8]){
            if (count < 1){
                count = 1;
                firstClick = buttons[8];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[9]){
            if (count < 1){
                count = 1;
                firstClick = buttons[9];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[10]){
            if (count < 1){
                count = 1;
                firstClick = buttons[10];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[11]){
            if (count < 1){
                count = 1;
                firstClick = buttons[11];

            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[12]){
            if (count < 1){
                count = 1;
                firstClick = buttons[12];

            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[13]){
            if (count < 1){
                count = 1;
                firstClick = buttons[13];

            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[14]){
            if (count < 1){
                count = 1;
                firstClick = buttons[14];

            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }

        if (e.getSource() == buttons[15]){
            if (count < 1){
                count = 1;
                firstClick = buttons[15];

            }

            else {
                // check if firstClick and current are adjacent then swap
            }
        }

        if (e.getSource() == buttons[16]){
            if (count < 1){
                count = 1;
                firstClick = buttons[16];
            }

            else {
                // check if firstClick and current are adjacent then swap
            }

        }



    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }



    JButton shuffleButton,blank, firstClick;
    JButton[] buttons = new JButton[16];
    Panel panel1,panel2;
    int count = 0;


}
