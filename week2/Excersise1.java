
import java.io.PrintStream;

public class Excersise1 {

public static void main (String args[]){
	
	int speed;
	int distance;

	System.out.println ("Speed" + "    " + "Distance");
	for (speed=10; speed<=40; speed +=10){
		distance = (speed*speed) / 20 + speed;
		System.out.println(speed + "    " + distance);
	}
}
}
