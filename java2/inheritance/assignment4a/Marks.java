import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String line = "";
    String[] name = new String[60];
    String[] marks = new String[60];
    int count = 0;

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
            name[count] = stk.nextToken() + " " + stk.nextToken();
            marks[count] = stk.nextToken();
            count ++;
          }
      }
            
       catch (IOException ioe) {
        System.out.println("I/O error");
        System.exit(1);
      }
          }

      String temp = "";
      String print;
      print = String.format("%-7s %9s", "Name", "Marks");
      System.out.println(print);
          for (int i = 0; i < name.length-1; i++){
            for (int j = 0; j < name.length-1; j++){
              if ((name[i]!=null) && (name[i+1]!=null)){
              if (name[i].compareTo(name[i+1]) < 0){
                temp = name[i];
                name[i] = name[i+1];
                name[i+1] = temp;
}
              }
            }
            
          }
          for (int a = 0; a < name.length; a++){
            if (name[a]!= null){
            print = String.format("%-7s", name[a]);
            System.out.println(print);
          }
        }
        
    }
  
}
