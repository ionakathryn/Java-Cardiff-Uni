import java.io.*;
import java.util.Arrays;

public class Marks {
  public static void main(String[] args) {

    // method for opening file
    BufferedReader in = null;
    String output = "";
    String[] arr = new String[60];
    String[] arrSplit = new String[60];
    String[] sorted = new String[arrSplit.length];
    int i = 0;
    String delimiters = "[0-9]";

    try { in = new BufferedReader(new FileReader("Marks.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found!!");
      System.exit(0);
    }

    while (output != null) {
      try {
        output = in .readLine();
        arr[i] = output;
        i++;

      } catch (IOException ioe) {
        System.out.println("I/O error");
        System.exit(1);
      }
    }

    // split string when int is found
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != null) {
        for (int k = 0; k < arr.length; k++) {
          arrSplit[j] = (Arrays.toString(arr[j].split(delimiters)));
        }

      }

    }

    for (int a = 0; a < arrSplit.length; a++) {
      if (arrSplit[a] != null) {
        sorted[a] = arrSplit[a];
      }
    }

    removeElements(arr);
    for (int z = 0; z < arr.length; z++) {
      if (arr[z] != null) {
        for (int q = 0; q < arr.length; q++) {
          sorted[q] = (Arrays.toString(arr[z].split(" ")));
        }
      }
    }

  }

  public static void removeElements(String[] allElements) {
    // 1 : count
    int n = 0;

    for (int o = 0; o < allElements.length; o++) {
      if (allElements[o] != null) {
        n++;
      }
    }

    // 2 : allocate new array
    String[] localAllElements = new String[n];
    int newIndex = 0;

    // 3 : copy not null elements
    for (int q = 0; q < allElements.length; q++) {
      if (allElements[q] != null) {
        localAllElements[newIndex] = allElements[q];
        newIndex++;
      }

    }

    Arrays.sort(localAllElements);
    System.out.println(Arrays.toString(localAllElements));

  }
}
