//******************************************************************************************
// Lab 3 - Exercise 3  Kip Brower 07/27/20 CPSC-50100
//
// VowelCounter.java - a program to count each type of vowel and all consonants in a user-
// supplied string.
//******************************************************************************************

import java.util.Scanner;
import java.lang.String;

public class VowelCounter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String string;
		char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u', f = 'f', b = 'b', c = 'c', d = 'd', g = 'g', h = 'h', j = 'j',
				k = 'k', l = 'l', m = 'm', n = 'n', p = 'p', q = 'q', r = 'r', s = 's', t = 't', v = 'v', w = 'w',
				x = 'x', y = 'y', z = 'z';

		int max, acount = 0, ecount = 0, ocount = 0, icount = 0, ucount = 0, nvCount = 0;
		System.out.print("Type a phrase and this program will tell you ");
		System.out.println("how many of each type of vowel and number of consonants are in it: ");
		string = scan.nextLine();
		max = string.length();

		for (int index = 0; index < max; index++) { // loop for scanning through the User supplied string

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
			}

			// ----------------------------------------------------------------------------------------------------------
			// conditional statements identifying and counting consonants
			// ----------------------------------------------------------------------------------------------------------

			if (b == string.charAt((index))) {
				nvCount++;

			} else if (c == string.charAt((index))) {
				nvCount++;

			} else if (d == string.charAt((index))) {
				nvCount++;

			} else if (f == string.charAt((index))) {
				nvCount++;

			} else if (g == string.charAt((index))) {
				nvCount++;

			} else if (h == string.charAt((index))) {
				nvCount++;

			} else if (j == string.charAt((index))) {
				nvCount++;

			} else if (k == string.charAt((index))) {
				nvCount++;

			} else if (l == string.charAt((index))) {
				nvCount++;

			} else if (m == string.charAt((index))) {
				nvCount++;

			} else if (n == string.charAt((index))) {
				nvCount++;

			} else if (p == string.charAt((index))) {
				nvCount++;

			} else if (q == string.charAt((index))) {
				nvCount++;

			} else if (r == string.charAt((index))) {
				nvCount++;

			} else if (s == string.charAt((index))) {
				nvCount++;

			} else if (t == string.charAt((index))) {
				nvCount++;

			} else if (v == string.charAt((index))) {
				nvCount++;

			} else if (w == string.charAt((index))) {
				nvCount++;

			} else if (x == string.charAt((index))) {
				nvCount++;

			} else if (y == string.charAt((index))) {
				nvCount++;

			} else if (z == string.charAt((index))) {
				nvCount++;

			}

		}
		// ----------------------------------------------------------------------------------------------------------
		// conditional statements identifying and counting consonants
		// ----------------------------------------------------------------------------------------------------------

		System.out.println("There are " + acount + " lower case a letters");
		System.out.println("There are " + ecount + " lower case e letters");
		System.out.println("There are " + icount + " lower case i letters");
		System.out.println("There are " + ocount + " lower case o letters");
		System.out.println("There are " + ucount + " lower case u letters");
		System.out.println("There are " + nvCount + " non-vowels");

		scan.close();
	}

}
