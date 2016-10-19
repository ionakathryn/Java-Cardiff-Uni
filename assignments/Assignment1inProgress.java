import java.io.PrintStream;

public class Assignment1.1
{
    public static void main(String[] args) 
    {
    	PrintStream output = new PrintStream(System.out);

        int angle = 15;
        double range;
        int speed;
        System.out.println("******************************************");
      	output.format("* Speed(m/s) * Angle(degrees) * Range(m)*");
        
        System.out.println(" ");
        
        for (speed = 80; speed <=140; speed +=20)
        {
            for (angle = 15; angle <=75; angle+=15)
            {
            double radians = Math.toRadians(angle);
            output.format("* %8d   *", speed);
            output.format(" %8d   *", angle);
            range = speed * speed * Math.sin(2 * radians) / 9.8;
            output.format(" %8.2f   *\t\n",range);
            }
        }
    	output.format("");
    }
    
    
}
