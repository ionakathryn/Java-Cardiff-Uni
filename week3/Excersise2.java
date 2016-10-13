import java.lang.*;

public class Excersise2 {

public static void main (String args[]){

    int speed = 0;
    int angle = 15;
    int range;
    for (int i=0; i <= 1; i++){
        
        speed +=10;
        angle = 15;
        
        for (int x=0; x<=2; x++){
            angle +=15;
            double radians = Math.toRadians(angle);
            range = speed * speed * Math.sin(2*radians) / 9.8;
            System.out.println (speed + "\t" + angle + "\t" + range);

        }
       }
}
}
