
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Arrays;
import javax.swing.JComponent;

public class ButtonArray
        {
public static void main( String[] args )
        {
        ButtonArrayFrame frame = new ButtonArrayFrame();
        frame.setTitle( "Button Array" );
        frame.setVisible(true);
      

        }
        }

class ButtonArrayFrame extends Frame implements ActionListener
{
    public ButtonArrayFrame()
    {
    	
        final int DEFAULT_FRAME_WIDTH = 150;
        final int DEFAULT_FRAME_HEIGHT = 150;
        setSize( DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT );
        WindowCloser listener = new WindowCloser();
        addWindowListener(listener);
        setLayout( new GridLayout( 4, 4 ) );
        message = new TextField();
        message.setEditable( false );
        add( message );
        button = new Button[16];
        for ( int i = 0; i < 16; i++ )
        {
            button[i] = new Button();
            button[i].setLabel( Integer.toString( i + 1 ) );
            button[i].addActionListener( this );
            add( button[i] );
        }
        button[2].setLabel( "" );
        index = 2;
        shuffle = new Button();
        shuffle.addActionListener(this);
        shuffle.setLabel("shuffle");
        add(shuffle);
    }

    public void actionPerformed( ActionEvent e )
    {
    	if (e.getSource() == shuffle){
        	message.setText("blabla");
        	for ( int i = 0; i < 16; i++ )
        {
            button[i].setLabel( "test");
        }

        	
        }

        for ( int i = 0; i < 16; i++ )
        {
            if ( e.getSource() == button[i] )
            {
                if ( i != index )
                {
                    int row = index % 4;
                    if ( ( i % 4 == row - 1 ) || ( i % 4 == row + 1 ) )
                    {
                        button[ index ].setLabel( button[ i ].getLabel() );
                        button[ i ].setLabel( "" );
                        index = i;
                        message.setText( "" );
                    }
                    else
                        message.setText( "Bad Move" );
                }
            }
        }
    }
    private class WindowCloser extends WindowAdapter
    {
        public void windowClosing( WindowEvent event )
        {
            System.exit( 0 );
        }
    }

    private TextField message;
    private Button[] button;
    private Button shuffle;
    private int index;
}
