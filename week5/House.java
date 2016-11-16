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
	g.drawLine (200, 220, 200,200);
	g.drawLine (200, 200, 220, 200);
	g.drawLine (200, 220, 220, 220);
	g.drawLine (220,200, 200, 200);
	g.drawLine (220, 220, 220, 200);

	// windows and door of house
	g.setColor (Color.white);
	g.fillRect (140,200, 40, 20);
	g.fillRect (240,200, 40, 20);
	g.fillRect (140,260, 40, 20);
	g.fillRect (240,260, 40, 20);
	g.setColor (Color.black);
	g.drawRect (200,260, 20, 40);
	g.fillRect (200,260, 20,40);

	// draw roof
	g.drawLine (160,140, 120, 180);
	g.drawLine (260, 140, 300,180);
	g.drawLine (160, 140, 260, 140);

	//sunshine
	g.setColor (Color.orange);
	g.fillOval (90, 90, 30, 30);
	g.drawLine (90,90, 90,90);

	}
