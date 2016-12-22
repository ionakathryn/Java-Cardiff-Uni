/*
* Game2.java
*
* V004
*
* 07.12.2016
*
* Author: Iona-Kathryn Evans
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.io.InputStreamReader;

	public class Game2 {

	 // check if args[2] is an int
	 public static boolean CheckInt(String input) {
	  boolean valid = true;
	  for (int i = 0; i < input.length(); i++) {
	   String secondarg = input.substring(i, i + 1);
	   if (secondarg.compareTo("0") < 0 || secondarg.compareTo("9") > 0) {
	    valid = false;
	    System.out.println("First argument must be integer");
	    System.exit(1);
	   }

	  }
	  return valid;
	 }

	 public static boolean CheckArglength(int argsLength){
		boolean valid = true;
    	if (argsLength != 2)
    	{
    		System.out.println("Please enter two arguments");
    		valid = false;
    		System.exit(2);
    	}

    	return valid;

	}


	public static int getRandomNumber(int lengthOfWords){
    	Random generator = new Random();
    	int num  = generator.nextInt(lengthOfWords-0) + 0;
   	return num;
	}


	 public static void main(String[] args) {
	 BufferedReader reader = null;

	 boolean result1 = CheckArglength(args.length);

	 boolean result2 = CheckInt(args[1]);

	  // try to open file
	  try {
	   reader = new BufferedReader(new FileReader(args[0]));
	  } catch (FileNotFoundException fnfe) {
	   System.out.println("Error opening file" + args[0]);
	   System.exit(3);
	  }
	  boolean done = false;
	  String inputLine = null;
	  String[] words = null;
	  int length = 0;

	  while (!done) {
	   try {
	    inputLine = reader.readLine();
	   } catch (IOException ioe) {
	    System.out.println("I/O error");
	    System.exit(4);
	   }

	   //end of file
	   if (inputLine == null) {
	    done = true;
	   } else {
	    String line = inputLine;
	    String delimter = " ";
	    words = line.split(delimter);
	    length = words.length;
	   }
	  }

	  //random number generator to select word from array
	  int number = getRandomNumber(length);

	  //store chosen word
	  String chosen = words[number];

	  //convert string to char array
	  char[] chosenarr = chosen.toCharArray();
	  char[] output = new char[chosenarr.length];
	
	  for (int x = 0; x < output.length; x++) {
	   output[x] = '*';
	  }
	  System.out.println(new String(output));

	  //user guesses
	  int guessnum = Integer.parseInt(args[1]);
	   
	  BufferedReader userguess = new BufferedReader(new InputStreamReader(System.in));
	  String guess = " ";

	
	  char[] userlinechar = null;
	  String userlinestring = null;
	  String b = null;
	  String c = null;
	  int counttry = 0;



	  for (int a = 0; a < guessnum; a++) {
	  
	   
	   System.out.println("Guess a character..");

	   try {
	   	
	    //convert bufferedreader to chararray
	    guess = userguess.readLine();
	    userlinechar = guess.toCharArray();
	    if (guess.length() == 0)
	    {
	    	System.out.println("Enter valid input");
	    	System.exit(5);
	    }

	  
	    userlinestring = Character.toString(userlinechar[0]);

	    if (!userlinestring.matches("[A-Za-z]+") || userlinestring.matches(" ") || guess.length() !=1) 
	    {
	    	a = counttry;
	    	a--;
	    	System.out.println("Enter valid input");
	    	
	    } 
	    else {
	    	counttry++;
	    }
	    
	    
	    
	   
	    //compare user guess with chosen word
	    for (int x = 0; x < chosenarr.length; x++) {

	     
	    
	     for (int j = 0; j < output.length; j++) {
	        c = new String(chosenarr);
	        b = new String (output);
	      
	      if (Character.toLowerCase(userlinechar[0]) == Character.toLowerCase(chosenarr[x])) {
	        output[x] = Character.toLowerCase(userlinechar[0]);
	       
	      }
	      
	     }
	      
	     }
	     
	      if (b.equalsIgnoreCase(c)){
        break;
        }
        
        //print current output 
    		System.out.println(output);


	   } catch (IOException ioe) {
	    System.exit(6);
	   }
	  }
	  
	  System.out.println(new String(output));

	  // check if user has won
	  int countLose = 0;
	  
	  for (int i = 0; i < output.length; i++) {
	   if (output[i] == '*') {
	    countLose++;
	   }
	  }

	  if (countLose > 0) {
	   System.out.println("Hard luck");
	  } else {
	   System.out.println("Well done");
	  }
}
}
