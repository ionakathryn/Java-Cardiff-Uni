import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Housefinal extends Applet {
	public void paint (Graphics g){
	
	

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

	g.setColor (Color.white);
	g.fillRect (140,200, 40, 20);
	g.fillRect (240,200, 40, 20);
	g.fillRect (140,260, 40, 20);
	g.fillRect (240,260, 40, 20);

	g.setColor (Color.magenta);
	g.fillRect (155, 235, 10,10);
	g.fillRect (255, 235, 10, 10);

	g.fillRect (200, 200, 20, 20);
	g.fillRect (205, 230, 10, 10);


	//door
	g.setColor (Color.red);
	g.fillRect (200,260, 20,40);
	g.setColor (Color.black);
	g.fillOval (212, 280, 5, 5);

	// draw roof
	g.drawLine (160,140, 120, 180);
	g.drawLine (260, 140, 300,180);
	g.drawLine (160, 140, 260, 140);


	//hotizontal lines
	g.drawLine (123, 175, 295, 175);
	g.drawLine (127, 170, 290, 170);
	g.drawLine (136, 165, 286, 165);
	g.drawLine (140, 160, 280, 160);
	g.drawLine (143, 155, 277, 155);
	g.drawLine (150, 150, 270, 150);
	g.drawLine (156, 145, 265, 145);

	g.setColor (Color.magenta);
	//vertical lines
	g.drawLine (130, 170, 130, 180);
	g.drawLine (140, 160, 140, 180);
	g.drawLine (150, 150, 150, 180);
	g.drawLine (160, 140, 160, 180);
	g.drawLine (170, 140, 170, 180);
	g.drawLine (180, 140, 180, 180);
	g.drawLine (190, 140, 190, 180);
	g.drawLine (200, 140, 200, 180);
	g.drawLine (210, 140, 210, 180);
	g.drawLine (220, 140, 220, 180);
	g.drawLine (230, 140, 230, 180);
	g.drawLine (240, 140, 240, 180);
	g.drawLine (250, 140, 250, 180);
	g.drawLine (260, 140, 260, 180);
	g.drawLine (270, 150, 270, 180);
	g.drawLine (280, 160, 280, 180);
	g.drawLine (290, 170, 290, 180);


	//sunshine
	g.setColor (Color.yellow);
	g.fillOval (90, 90, 25, 25);
	g.drawLine (100,80, 100,130);
	g.drawLine (80, 100, 130, 100);
	g.drawLine (80, 80, 140,140);
	g.drawLine (120, 70, 80, 135);

	//background
	setBackground (Color.cyan);
	g.setColor (Color.green);
	g.fillRect (0, 300, 400, 100);
	g.setColor (Color.lightGray);
	g.fillRect (0, 320, 400, 100);

	//path 
	g.setColor (Color. darkGray);
	g.fillRect (200, 300, 20, 100);
	g.setColor (Color.yellow);
	g.fillRect (209, 300, 10, 100);

	//clouds
	g.setColor (Color.white);
	g.fillOval (280, 70, 30,20);
	g.fillOval (300, 80, 30, 10);
	g.fillOval (280, 50, 45, 25);
	g.fillOval (300, 60, 75, 50);

	//fence
	g.setColor (Color.red);
	g.drawLine (90, 400, 130, 340);
	g.drawLine (130, 340, 180, 340);
	g.drawLine (240, 340, 290, 340);
	g.drawLine (290, 340, 340, 400);
	g.drawLine (130, 340, 290, 340);

	//smoke
	g.setColor (Color.orange);
	g.setColor (Color.red);
	g.fillOval (210, 90, 40, 23);
	g.fillOval (205, 93, 50, 40);
	g.fillOval (190, 93, 35, 20);
	g.fillOval (230, 90, 40, 30);
	g.fillOval (240, 80, 30, 30);
	

	//chimney
	g.setColor (Color. black);
	g.fillRect (200, 120, 20,20);

	//window panes
	g.drawLine (160, 220, 160, 200);
	g.drawLine (140, 210, 180, 210);
	g.drawLine (260, 200, 260, 220);
	g.drawLine (240, 210, 280, 210);
	g.drawLine (160, 260, 160, 280);
	g.drawLine (140, 270, 180, 270);
	g.drawLine (160, 260, 160, 280);
	g.drawLine (260, 260, 260, 280);
	g.drawLine (240, 270, 280, 270);



	}


	
}
