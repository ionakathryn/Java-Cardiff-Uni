public class Assignment1 {
    public static void main(String[] args) {
        int angle = 15;
        double range;
        int speed;
        
        for (speed = 80; speed <=140; speed +=20){
        	System.out.println("");
            
            for (angle = 15; angle <=75; angle+=15){
            double radians = Math.toRadians(angle);
            System.out.println("Speed (m/s) = " + speed);
            System.out.println("Angle (degrees) = " + angle);
            range = speed * speed * Math.sin(2 * radians) / 9.8;
            System.out.println("Range (m) = " + range);
            }
    }
    System.out.println("");
    }
    
    
}
