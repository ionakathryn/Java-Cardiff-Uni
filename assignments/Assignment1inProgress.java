public class Assignment1 {
    public static void main(String[] args) {
        int angle = 15;
        double range;
        int speed;
        System.out.printf("Speed\t" + "Angle\t" + "Range\n");
        
        for (speed = 80; speed <=140; speed +=20){
            for (angle = 15; angle <=75; angle+=15){
            double radians = Math.toRadians(angle);
            System.out.printf(speed + "\t");
            System.out.printf(angle + "\t");
            range = speed * speed * Math.sin(2 * radians) / 9.8;
            System.out.printf(range +"\n");
            }
    }
    System.out.println("");
    }
    
    
}
