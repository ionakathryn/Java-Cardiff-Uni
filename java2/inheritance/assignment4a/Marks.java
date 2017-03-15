import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String line = "";
    String[] firstName = new String[60];
    String[] surName = new String[60];
    String[] marks = new String [60];
    int i = 0;

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
        		firstName[i] = stk.nextToken();
        		surName[i] = stk.nextToken();
        		marks[i] = stk.nextToken();
        		i++;
        	}
	    }
		        
		    

      
        
      
      

      
       catch (IOException ioe) {
        System.out.println("I/O error");
        System.exit(1);
      }
	        }


     // bubble sort surName array


    
  
}
	public static void BubbleSort(String[] arr){
			char[] charArr = arr.toCharArray();
  			int a;
  			boolean swap = true;
  			String temp;

  			while (swap){
  				swap = false;
  				for (a = 0; a < arr.length-1; a++){
  					if (charArr[a].compareTo([charArr[a+1])){
  						temp = charArr[a];
  						charArr[a] = charArr[a+1];
  						charArr[a+1] = temp;
  						swap = true;
  					}
  				}
  			}
  		}

}

  	
