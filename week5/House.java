import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class House extends Applet {
	public void paint (Graphics g){
	// skyscraper1
	g.fillRect (280, 110, 50, 200);
	g.setColor (Color.white);
	g.fillRect (280, 120, 10, 10);
	g.fillRect (300, 120, 10, 10);
	g.fillRect (320, 120, 10, 10);
	g.fillRect (280, 140, 10, 10);
	g.fillRect (300, 140, 10, 10);
	g.fillRect (320, 140, 10, 10);

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

	// windows and door
	g.setColor (Color.white);
	g.fillRect (140,200, 40, 20);
	g.fillRect (240,200, 40, 20);
	g.fillRect (140,260, 40, 20);
	g.fillRect (240,260, 40, 20);
	g.setColor (Color.black);
	g.drawRect (200,260, 20, 40);

	// draw roof
	g.drawLine (160,140, 120, 180);
	g.drawLine (260, 140, 300,180);
	g.drawLine (160, 140, 260, 140);

	// skyscraper2
	g.fillRect (60, 120, 80, 220);


	}
}
