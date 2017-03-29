import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class Results {
 public static void main(String[] args) {

  // method for opening file
  BufferedReader in = null;
  Vector < String > namesV = new Vector < String > ();
  Vector < Integer > marksV = new Vector < Integer > ();

  String[] names = new String[60];
  String[] marks = new String[60];
  String line = "";
  int count = 0;
  int temp;
  String tempName;


  try { in = new BufferedReader(new FileReader("Marks.txt"));
  } catch (FileNotFoundException e) {
   System.out.println("File Not Found!!");
   System.exit(0);
  }

  while (line != null) {
   try {
    StringTokenizer stk = new StringTokenizer(line);
    line = in .readLine();
    while (stk.hasMoreTokens()) {
     names[count] = stk.nextToken() + " " + stk.nextToken();
     marks[count] = stk.nextToken();
     count++;
    }
   } catch (IOException ioe) {
    System.out.println("I/O error");
    System.exit(1);
   }
  }

  for (int a = 0; a < marks.length; a++) {
   if (marks[a] != null) {
    marksV.add(new Integer(marks[a]));
   }
  }

  for (int x = 0; x < names.length; x++) {
   if (names[x] != null) {
    namesV.add(new String(names[x]));
   }
  }
  for (int b = 0; b < marksV.size() - 1; b++) {
   for (int c = 0; c < marksV.size() - b - 1; c++) {
    if (marksV.get(c) > marksV.get(c + 1)) {
     temp = marksV.get(c);
     tempName = namesV.get(c);
     namesV.set(c, namesV.get(c + 1));
     marksV.set(c, marksV.get(c + 1));
     namesV.set(c + 1, tempName);
     marksV.set(c + 1, temp);
    }
   }
  }

  String print;
  print = String.format("%-10s    %10s", "Name", "Marks");
  System.out.println(print);


  for (int i = 0; i < marksV.size(); i++) {
   if (marksV.get(i) != null) {
    print = String.format("%-10s  %10s", namesV.get(i), marksV.get(i));
    System.out.println(print);
   }
  }


 }


}
