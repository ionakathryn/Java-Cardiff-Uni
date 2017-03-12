import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String line = "";
    String arr[] = new String[60];

    try { 
      in = new BufferedReader(new FileReader("Marks.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found!!");
      System.exit(0);
    }

    while (line != null) {
      try {
        StringTokenizer stk = new StringTokenizer(line);
        line = in .readLine();
      }
      

      
       catch (IOException ioe) {
        System.out.println("I/O error");
        System.exit(1);
      }

      for (int j = 0; j < arr.length ; j++){
        if (arr[j]!=null){
          System.out.println(arr[j]);
        }
      }


    

    }
  }
}
