import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String line = "";
    String[][] marks = new String[100][5];
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
        while(line!=null){
          while (stk.hasMoreTokens()){
        System.out.println("test");
        marks[nrows][1] = stk.nextToken();
        marks[nrows][2] = stk.nextToken();
        marks[nrows][3] = stk.nextToken();
        nrows++;
        
      }
    }
  }
      
        
      
      

      
       catch (IOException ioe) {
        System.out.println("I/O error");
        System.exit(1);
      }

      for (int i = 0; i < nrows; i++){
        for (int j = 0; j <= 3; j++){
        if (marks[i][j]!=null){
          System.out.println(marks[i][j]);
        }
    }
    }
      // traverse 3 elements, add to arr 0,1,2
      // traverse next3 elements, add to arr 1,1,2
      // traverse next3 elements, add to arr 2,1,2

      // create method to sort through all arrays and display

    

    }
  }
}
