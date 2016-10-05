public class Assignment1 {
    public static void main(String[] args) {
        int angle = 15;
        double range;
        int speed;
        
        
            for (angle = 15; angle <=75; angle+=15){
            double radians = Math.toRadians(angle);
            System.out.println("Speed = " + 80);
            System.out.println("Angle = " + angle);
            range = 80 * 80 * Math.sin(2 * radians) / 9.8;
            System.out.println("Range = " + range);
            
    }
    }
    
    
}
