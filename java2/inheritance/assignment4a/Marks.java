import java.io.*;
import java.util.Arrays;

public class Marks {
    public static void main(String[] args) {

        // method for opening file
        BufferedReader in = null;
        String output = "";
        String[] arr = new String[60];
        String[] arrSplit = new String[60];
        String[] sorted = new String[60];
        int i = 0;


        try {
            in = new BufferedReader(new FileReader("Marks.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!!");
            System.exit(0);
        }

        while (output != null) {
            try {
                output = in.readLine();
                arr[i] = output;
                i++;

            } catch (IOException ioe) {
                System.out.println("I/O error");
                System.exit(1);
            }
        }
        

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != null) {
                for (int k = 0; k < arr.length; k++) {
                    arrSplit[j] = (Arrays.toString(arr[j].split(" ")));
                }

            }

        }
        
        for (int x = 0; x < arrSplit.length; x++){
            if (arrSplit[x] != null){
                System.out.println(arrSplit[x]);
            }
        }
        
        
        Arrays.sort(arrSplit);
        
        for (int c = 0; c < arrSplit.length; c++){
            if (arrSplit[c] !=null){
                for (int d= 0; d < arrSplit.length; d++)
                    sorted[c] = (arrSplit[c]);
            }
        }
        
    }
}
