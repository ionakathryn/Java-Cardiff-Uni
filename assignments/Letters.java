import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class Letters
{
    public static void main (String[] args)
    {
    BufferedReader reader = null;
        if (args.length !=1 )
        {
            System.out.println("No filename specified");
            System.exit(1);
        }

        //open text file
        try
        {
            reader = new BufferedReader(new FileReader(args[0]));
        }

        catch (FileNotFoundException fnfe)
        {
            System.out.println ("Error on opening file " + args[0]);
            System.exit(2);
        }

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        int countG = 0;
        int countH = 0;
        int countI = 0;
        int countJ = 0;
        int countK = 0;
        int countL = 0;
        int countM = 0;
        int countN = 0;
        int countO = 0;
        int countP = 0;
        int countQ = 0;
        int countR = 0;
        int countS = 0;
        int countT = 0;
        int countU = 0;
        int countV = 0;
        int countW = 0;
        int countX = 0;
        int countY = 0;
        int countZ = 0;

        boolean done = false;
        String inputLine = null;

        while (!done)
        {
            try
            {
                inputLine = reader.readLine();
            }
            catch (IOException ioe)
            {
                System.out.println ("Error reading file");
                System.exit(3);
            }

            if (inputLine == null)
            {
                done = true;
            }

            else
            {
                char[] lineArray = inputLine.toCharArray();
                for (int i = 0; i < inputLine.length(); i++)
                {
                    if (lineArray[i] == 'A' || lineArray[i] == 'a')
                    {
                        countA++;
                    }

                    else if (lineArray[i] == 'B' || lineArray[i] == 'b')
                    {
                        countB++;
                    }

                    else if (lineArray[i] == 'C' || lineArray[i] == 'c')
                    {
                        countC++;
                    }

                    else if (lineArray[i] == 'D' || lineArray[i] == 'd')
                    {
                        countD++;
                    }

                    else if (lineArray[i] == 'E' || lineArray[i] == 'e')
                    {
                        countE++;
                    }

                    else if (lineArray[i] == 'F' || lineArray[i] == 'f')
                    {
                        countF++;
                    }

                    else if (lineArray[i] == 'G' || lineArray[i] == 'g')
                    {
                        countG++;
                    }

                    else if (lineArray[i] == 'H' || lineArray[i] == 'h')
                    {
                        countH++;
                    }

                    else if (lineArray[i] == 'I' || lineArray[i] == 'i')
                    {
                        countI++;
                    }

                    else if (lineArray[i] == 'J' || lineArray[i] == 'j')
                    {
                        countJ++;
                    }

                    else if (lineArray[i] == 'K' || lineArray[i] == 'k')
                    {
                        countK++;
                    }

                    else if (lineArray[i] == 'L' || lineArray[i] == 'l')
                    {
                        countL++;
                    }

                    else if (lineArray[i] == 'M' || lineArray[i] == 'm')
                    {
                        countM++;
                    }

                    else if (lineArray[i] == 'N' || lineArray[i] == 'n')
                    {
                        countN++;
                    }

                    else if (lineArray[i] == 'O' || lineArray[i] == 'o')
                    {
                        countO++;
                    }

                    else if (lineArray[i] == 'P' || lineArray[i] == 'p')
                    {
                        countP++;
                    }

                    else if (lineArray[i] == 'Q' || lineArray[i] == 'q')
                    {
                        countQ++;
                    }

                    else if (lineArray[i] == 'R' || lineArray[i] == 'r')
                    {
                        countR++;
                    }

                    else if (lineArray[i] == 'S' || lineArray[i] == 's')
                    {
                        countS++;
                    }

                    else if (lineArray[i] == 'T' || lineArray[i] == 't')
                    {
                        countT++;
                    }

                    else if (lineArray[i] == 'U' || lineArray[i] == 'u')
                    {
                        countU++;
                    }

                    else if (lineArray[i] == 'V' || lineArray[i] == 'v')
                    {
                        countV++;
                    }

                    else if (lineArray[i] == 'W' || lineArray[i] == 'w')
                    {
                        countW++;
                    }

                    else if (lineArray[i] == 'X' || lineArray[i] == 'x')
                    {
                        countX++;
                    }

                    else if (lineArray[i] == 'Y' || lineArray[i] == 'y')
                    {
                        countY++;
                    }

                    else if (lineArray[i] == 'Z' || lineArray[i] == 'z')
                    {
                        countZ++;
                    }
                }

            }
        }

        try
        {
            reader.close();
        }
        catch (IOException ioe)
        {
            System.out.println("Error closing file...");
        }

        System.out.println("A = " + countA);

    }
}
