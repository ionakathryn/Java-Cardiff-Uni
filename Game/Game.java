import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Game {

	// check if args[2] is an int
	public static boolean CheckInt(String input)
	{
        boolean valid = true;
		for (int i = 0; i < input.length(); i++)
		{
			String secondarg = input.substring(i, i+1);
			if (secondarg.compareTo ("0") < 0 || secondarg.compareTo ("9") > 0)
			{
				valid = false;
				System.out.println ("First arg must be integer");
				System.exit(1);
			}
		}	
		return valid;
	}

	public static void main (String[] args)
	{
	BufferedReader reader = null;


	if (args.length != 2)
	{
		System.out.println("Please enter two arguments");
		System.exit(2);
	}

	boolean result = CheckInt(args[1]);

	// try to open file
			try
			{
				reader = new BufferedReader(new FileReader(args[0]));
			}

			catch (FileNotFoundException fnfe)
			{
				System.out.println ("Error opening file" + args[0]);
				System.exit(3);
			}

			boolean done = false;
			String inputLine = null;
			String [] words = null;
			int length = 0;

			while (! done)
			{
				try 
				{
					inputLine = reader.readLine();
				}

				catch (IOException ioe)
				{
					System.out.println ("I/O error");
					System.exit(4);
				}

				//end of file
				if(inputLine==null)
				{
					done = true;
				}

				else
				{
					String line = inputLine;
					String delimter = " ";
				    words = line.split(delimter);
				    length = words.length;
				}
			}

	//random number generator to select word from array
	Random generator = new Random();
	int num = generator.nextInt(length - 0) + 0;

	//store chosen word
	String chosen = words[num];
	System.out.println (chosen);

	//convert string to char array
	char[] chosenarr = chosen.toCharArray();
	char[] output = new char[chosenarr.length];

	for (int x = 0; x < output.length; x++)
	{
		System.out.print ("*");
	}
	System.out.println("\n");



	//user guesses
	//convert string to int
	int count = 0;
	int guessnum = Integer.parseInt(args[1]);
	char finalGuess = 'a' ;
    BufferedReader userguess = new BufferedReader(new InputStreamReader(System.in));

    for (int a = 0; a < guessnum; a++)
    {
    count++;
	System.out.println ("Guess a character...");


	try
	{
	//convert bufferedreader to chararray
	String userline = userguess.readLine();
	char[] userlinech = userline.toCharArray();
	finalGuess = userlinech[0];

	for (int b = 0; b < chosenarr.length; b++)
	{
		for (int c = 0; c < output.length; c++)
		if (finalGuess == chosenarr[b])
		{
			System.out.println ("Good guess");
			output[c] = chosenarr[b];
		}
	}
		System.out.println (output);

	}


		catch( IOException ioe)
		{
			System.exit(4);
		}
	}
}
		}
