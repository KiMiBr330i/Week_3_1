import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class VowelCounter {

	public static void main(String[] args) {
		// read a user supplied string
		// Search the string for each of the vowels individually
		// determine if there is a vowel of whatever kind in the string
		// identify the vowels in the string
		// count the number of each vowel in the string
		// determines how many of each lowercase vowel appear in the entire string
		// have a separate counter for each vowel
		// find the non-vowel characters in the string
		// count and print the number of non-vowel characters
		//

		Scanner scan = new Scanner(System.in);
		String string, aString;
		int max;
		char a = 'a', e = 'e'; //i = 'i', o = 'o', u = 'u';
		System.out.println("Type something with vowels in it: ");
		string = scan.nextLine();
		System.out.println("This is what you typed: " + string);
		max = string.length();

		
			for (int aCharA = 0 ; aCharA < max ; aCharA++)
				//what method do I get at a particular letter in the string
				System.out.println(string.charAt(aCharA));
		
			// System.out.println(string.lastIndexOf('a'));

		}
}

