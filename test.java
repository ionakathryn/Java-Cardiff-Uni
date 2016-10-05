
import java.io.PrintStream;

public class test {

public static void main (String args[]){
	PrintStream d = new PrintStream (System.out);
	PrintStream s = new PrintStream (System.out);
	
	d.format ("%7", d);
	s.format ("%7", s);

	int speed;
	int distance;

	System.out.println ("%7Speed" + "    " + "%7Distance");
	for (speed=10; speed<=40; speed +=10){
		distance = (speed*speed) / 20 + speed;
		System.out.println(speed + "    " + distance);
	}
}
}