import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Marks {
    public static void main(String[] args) {

        // method for opening file
        BufferedReader in = null;
        String output = "";
        String[] arr = new String[60];
        String[] components = new String[60];
        int i = 0;

        try {
            in = new BufferedReader(new FileReader("Marks.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
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
                        components[k] = (Arrays.toString(arr[j].split(" ")));
                    }

                }

            }
        System.out.println(components[])

    }


