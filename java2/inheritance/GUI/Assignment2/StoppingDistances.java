import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		// set layout
		GridLayout layout = new GridLayout( 4, 2 );
		setLayout(layout);
		add(new Label("Start"));
		
		startSpeed = new TextField();
		add(startSpeed);
		
		
		add(new Label("End"));
		
		endSpeed = new TextField();
		add(endSpeed);
		endSpeed.setEditable(false);
	    }
	    public void actionPerformed(ActionEvent e )
	    {

	    }
	    private TextField startSpeed,endSpeed;	
   }
