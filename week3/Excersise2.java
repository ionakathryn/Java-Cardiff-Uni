import java.lang.*;
  import java.io.PrintStream;


  public class Excersise2 {

  public static void main (String args[]){
      PrintStream output = new PrintStream (System.out);
      System.out.println("   *************************************************");

      output.format("   *  Speed(m/s) *  Angle(degrees)  *   Range(m)   *\n");
      System.out.println("   *************************************************");

      int speed = 0;
      int angle = 15;
      double range;
      for (int i=0; i <= 1; i++){
          
          speed +=10;
          angle = 15;
          
          for (int x=0; x<=2; x++){
              angle +=15;
              double radians = Math.toRadians(angle);
              range = speed * speed * Math.sin(2*radians) / 9.8;
              output.format ("   * %8d    * %8d         * %8.2f     * \n", speed, angle,range);

          }
         }
                 System.out.println("   *************************************************");

  }
  }
