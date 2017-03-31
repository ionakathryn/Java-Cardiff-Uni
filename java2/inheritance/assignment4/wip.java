import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String line = "";
    String[] name = new String[60];
    String[] marks = new String[60];
    String tempMark = "";
    int count = 0;
    StringTokenizer stk = new StringTokenizer("");

    try { 
      in = new BufferedReader(new FileReader("Marks.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found!!");
      System.exit(0);
    }
  
 String read = "";

   try{
    
      while (read != null){
      read = in.readLine();
      stk = new StringTokenizer(read);
    }
  }
  catch (IOException e){
    System.out.println("I/O error");
    System.exit(1);
  }
    
          
      

        while (stk.hasMoreTokens()){
            name[count] = stk.nextToken() + " " + stk.nextToken();
            marks[count] = stk.nextToken();
            count ++;
          }

      String temp = "";
      String print;
      print = String.format("\033[4m%4s\033[0m" + "\t            \033[4m%-5s\033[0m", "Name", "Marks");
      System.out.println(print);
      
          for (int i = 0; i < name.length-1; i++){
            for (int j = 0; j < name.length-1; j++){
              if ((name[i]!=null) && (name[i+1]!=null)){
              if (name[i].compareTo(name[i+1]) > 0){
                temp = name[i];
                tempMark = marks[i];
                marks[i] = marks[i+1];
                name[i] = name[i+1];
                name[i+1] = temp;
                marks[i+1] = tempMark;
                }
              }
            }
            
          }
          for (int a = 0; a < name.length; a++){
            if (name[a]!= null){
            print = String.format("%4s\t    %-7s", name[a], marks[a]);
            System.out.println(print);
          }
        }
  }
  }
  
