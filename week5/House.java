import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class House extends Applet {
	public void paint (Graphics g){
	g.fillRect (280, 110, 50, 200);
	g.setColor (Color.white);
	g.fillRect (280, 120, 10, 10);
	g.fillRect (300, 120, 10, 10);
	g.fillRect (320, 120, 10, 10);

	g.fillRect (280, 140, 10, 10);
	g.fillRect (300, 140, 10, 10);
	g.fillRect (320, 140, 10, 10);

	g.fillRect (280, 160, 10, 10);
	g.fillRect (300, 160, 10, 10);
	g.fillRect (320, 160, 10, 10);

	g.fillRect (280, 180, 10, 10);
	g.fillRect (300, 180, 10, 10);
	g.fillRect (320, 180, 10, 10);

	g.fillRect (280, 200, 10, 10);
	g.fillRect (300, 200, 10, 10);
	g.fillRect (320, 200, 10, 10);

	g.fillRect (280, 220, 10, 10);
	g.fillRect (300, 220, 10, 10);
	g.fillRect (320, 220, 10, 10);

	g.fillRect (280, 240, 10, 10);
	g.fillRect (300, 240, 10, 10);
	g.fillRect (320, 240, 10, 10);

	//skyscraper door
	g.fillRect (297, 270, 20, 40);

	// house outline
	g.drawLine (120, 300, 300, 300);
	g.drawLine (120,300,120,180);
	g.drawLine (300,300, 300, 180);
	g.drawLine (120,180, 300, 180);
	g.drawLine (200, 140, 220, 140);
	g.drawLine (200, 120, 220,120);
	g.drawLine (200,140,220,140);
	g.drawLine (200,140, 200, 120);
	g.drawLine (220,140, 220, 120);
	g.setColor (Color.black);
	g.fillRect (120, 180, 180, 120);

	// windows 
	g.setColor (Color.magenta);
	g.fillRect (140,200, 40, 20);
	g.fillRect (240,200, 40, 20);
	g.fillRect (140,260, 40, 20);
	g.fillRect (240,260, 40, 20);
	g.setColor (Color.black);

    g.drawLine (200, 220, 200,200);
	g.drawLine (200, 200, 220, 200);
	g.drawLine (200, 220, 220, 220);
	g.drawLine (220,200, 200, 200);
	g.drawLine (220, 220, 220, 200);

	//door
	g.setColor (Color.red);
	g.fillRect (200,260, 20,40);

	// draw roof
	g.drawLine (160,140, 120, 180);
	g.drawLine (260, 140, 300,180);
	g.drawLine (160, 140, 260, 140);
	g.setColor (Color. black);
	g.fillRect (200, 120, 20,20);

	


	//sunshine
	g.setColor (Color.orange);
	g.fillOval (90, 90, 25, 25);
	g.drawLine (100,80, 100,130);
	g.drawLine (80, 100, 130, 100);
	g.drawLine (80, 80, 140,140);
	g.drawLine (120, 70, 80, 135);

	//background
	setBackground (Color.cyan);
	g.setColor (Color.green);
	g.fillRect (0, 300, 400, 100);

	//path 
	g.setColor (Color.white);
	g.drawLine (180, 300, 180, 400);
	g.drawLine (240, 300, 240, 400);
	g.setColor (Color. orange);
	g.fillRect (204, 300, 20, 100);

	//clouds
	g.setColor (Color.white);
	g.fillOval (280, 70, 30,20);
	g.fillOval (300, 80, 30, 10);
	g.fillOval (280, 50, 45, 25);
	g.fillOval (300, 60, 75, 50);

	//fence


	}


	
}
