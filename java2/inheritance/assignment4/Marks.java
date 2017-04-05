import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String line = "";
    String[] name = new String[60];
    String[] surName = new String[60];
    String[] marks = new String[60];

    String tempMark = "";
    String temp = "";
    String tempName = "";
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
            surName[count] = stk.nextToken();
            name[count] = " " + stk.nextToken();
            marks[count] = stk.nextToken();
            count ++;
          }
      }
            
       catch (IOException ioe) {
        System.out.println("I/O error");
        System.exit(1);
      }
          }

      String print;
      print = String.format("Name          Marks");
      System.out.println(print);

        boolean swap = true;
        while(swap)
        {
          swap = false;
          for (int i = 0; i < name.length-1; i++){
            for (int j = 0; j < name.length-1; j++){
              if ((surName[i]!=null) && (surName[i+1]!=null)){
                {if (surName[i].compareTo(surName[i+1]) > 0){
              
                temp = surName[i];
                surName[i] = surName[i+1];
                surName[i+1] = temp;

                tempMark = marks[i];
                marks[i] = marks[i+1];
                marks[i+1] = tempMark;

                tempName = name[i];
                name[i] = name[i+1];
                name[i+1] = tempName;

                swap = true;
        }
        else if (surName[i].compareTo(surName[i+1]) == 0){
          if (name[i].compareTo(name[i+1]) > 0){

                temp = surName[i];
                surName[i] = surName[i+1];
                surName[i+1] = temp;

                tempMark = marks[i];
                marks[i] = marks[i+1];
                marks[i+1] = tempMark;

                tempName = name[i];
                name[i] = name[i+1];
                name[i+1] = tempName;

                swap = true;

          }
        }
        
        
        }
      
    }
      }
    }


              
            
            
          }
          for (int a = 0; a < name.length; a++){
            if (name[a]!= null){
            print = String.format("%-4s %4s     %-7s", name[a], surName[a], marks[a]);
            System.out.println(print);
          }
        }
        
    }
}
