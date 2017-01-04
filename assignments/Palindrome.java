/*
 * Palindrome.java
 * 
 * V001
 *
 * 30.11.2016
 * 
 * Author: Iona-Kathryn Evans
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Palindrome {
	public static void main(String[] args)
		throws IOException {

		// user enters string
		System.out.println ("Please enter string");

		InputStreamReader input = new InputStreamReader (System.in);
		BufferedReader reader = new BufferedReader (input);
		String userinput = "";
		userinput = reader.readLine();

		// test if string is valid
			if (!userinput.matches("[A-Za-z]+")){
				System.out.println ("Invalid Input");
				System.exit(1);
			}

			else if (userinput.length() > 10){
				System.out.println ("String too long");
				System.exit(2);
			}


		String stringReverse = "";
		for (int i = userinput.length()-1; i >= 0; i--){
			stringReverse += String.valueOf(userinput.charAt(i));
		}

		if (userinput.equalsIgnoreCase(stringReverse)){
			System.out.println ("String is a Palindrome");
			System.exit(0);
		}

		else if (userinput != stringReverse) {
			System.out.println ("String is not a Palindrome");
			System.exit(0);
		}

		}

}
