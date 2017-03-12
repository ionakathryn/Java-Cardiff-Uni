import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String line = "";
    String[][] marks = new String[100][3];
    int nrows = 0;
    int ncols = 0;

    try { 
      in = new BufferedReader(new FileReader("Marks.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found!!");
      System.exit(0);
    }

    while (line != null) {
      try {
        StringTokenizer stk = new StringTokenizer(line);
        line = in.readLine();
        while (stk.hasMoreTokens()){
        marks[nrows][0] = stk.nextToken();
        marks[nrows][1] = stk.nextToken();
        marks[nrows][2] = stk.nextToken();
        nrows++;
        
      }
    }
      
        
      
      

      
       catch (IOException ioe) {
        System.out.println("I/O error");
        System.exit(1);
      }
      
      System.out.print (marks[0][0] + " ");
      System.out.print (marks[0][1] + " ");
      System.out.print (marks[0][2] + "\n");
      System.out.print (marks[1][0] + " ");
      System.out.print (marks[1][1] + " ");
      System.out.print (marks[1][2] + "\n");
      System.out.print (marks[2][0] + " ");
      System.out.print (marks[2][1] + " ");
      System.out.print (marks[2][2] + "\n");
      System.out.print (marks[3][0] + " ");
      System.out.print (marks[3][1] + " ");
      System.out.print (marks[3][2] + "\n");
      System.out.print (marks[4][0] + " ");
      System.out.print (marks[4][1] + " ");
      System.out.print (marks[4][2] + "\n");
      System.out.print (marks[5][0] + " ");
      System.out.print (marks[5][1] + " ");
      System.out.print (marks[5][2] + "\n");


      

      // traverse 3 elements, add to arr 0,1,2
      // traverse next3 elements, add to arr 1,1,2
      // traverse next3 elements, add to arr 2,1,2

      // create method to sort through all arrays and display

    

    }
  }
}
