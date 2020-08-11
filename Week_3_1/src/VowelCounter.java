//******************************************************************************************
// Lab 3 - Exercise 3  Kip Brower 07/27/20 CPSC-50100
//
// VowelCounter.java - a program to count each type of vowel and all non-vowel characters
//(including spaces) in a user-supplied string.
//
//******************************************************************************************

import java.util.Scanner;
import java.lang.String;

public class VowelCounter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
		int max, acount = 0, ecount = 0, ocount = 0, icount = 0, ucount = 0, nvCount = 0;
		
		System.out.print("This program tells you ");
		System.out.println("how many of each type of vowel and the number of non-vowel characters that are in a phrase you will input.");
		System.out.println("Please enter your phrase: ");
		String string = scan.nextLine();
		max = string.length();

		for (int index = 0; index < max; index++) { // loop for scanning through the user-supplied string

			// ----------------------------------------------------------------------------------------------------------
			// conditional statements identifying and counting vowels
			// ----------------------------------------------------------------------------------------------------------

			if (a == string.charAt((index))) {
				acount++;

			} else if (e == string.charAt((index))) {
				ecount++;

			} else if (i == string.charAt((index))) {
				icount++;

			} else if (o == string.charAt((index))) {
				ocount++;

			} else if (u == string.charAt((index))) {
				ucount++;

			// ----------------------------------------------------------------------------------------------------------
			// conditional statements identifying, counting non-vowel characters
			// ----------------------------------------------------------------------------------------------------------

			} else if (a != string.charAt((index))) {
				nvCount++;

			} else if (e != string.charAt((index))) {
				nvCount++;

			} else if (i != string.charAt((index))) {
				nvCount++;

			} else if (o != string.charAt((index))) {
				nvCount++;

			} else if (u != string.charAt((index))) {
				nvCount++;

			}

		}
		System.out.println("Your phrase was: " + string);
		System.out.println("There are " + acount + " lower case a letters.");
		System.out.println("There are " + ecount + " lower case e letters.");
		System.out.println("There are " + icount + " lower case i letters.");
		System.out.println("There are " + ocount + " lower case o letters.");
		System.out.println("There are " + ucount + " lower case u letters.");
		System.out.println("There are " + nvCount + " non-vowel characters, including spaces.");

		scan.close();
	}

}
