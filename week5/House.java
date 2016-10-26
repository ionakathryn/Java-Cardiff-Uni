import java.applet.Applet;
import java.awt.Graphics;

public class Line extends Applet {
	public void paint (Graphics g){
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

	g.drawRect (140,200, 40, 20);
	g.drawRect (240,200, 40, 20);
	g.drawRect (140,260, 40, 20);
	g.drawRect (240,260, 40, 20);
	g.drawRect (200,260, 20, 40);
	}
}
