public class Assignment1 {
    public static void main(String[] args) {
        int angle = 15;
        double range;
        int speed;
        
        for (speed = 80; speed <=140; speed +=20){
        	System.out.println("");
            
            for (angle = 15; angle <=75; angle+=15){
            double radians = Math.toRadians(angle);
            System.out.printf("Speed (m/s) = " + speed + "\t");
            System.out.printf("Angle (degrees) = " + angle + "\t");
            range = speed * speed * Math.sin(2 * radians) / 9.8;
            System.out.printf("Range (m) = " + range +"\n");
            }
    }
    System.out.println("");
    }
    
    
}
