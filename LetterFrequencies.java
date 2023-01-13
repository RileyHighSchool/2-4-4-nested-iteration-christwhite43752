/*
 * Activity 2.4.4
 */
import java.util.Scanner;

public class LetterFrequencies
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to see how many of each letter it has. ");


		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = sc.nextLine();

		phrase = phrase.toLowerCase();

		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
	for (int i=0; i<26; i++){
		String letter = letters.substring(i,i+1);

		int count = 0;
		for (int inner=0; inner < phrase.length(); inner++ ){

			String phraseLet = phrase.substring(inner, inner +1);

			if (letter.equals(phraseLet)){
				count++;
			}
		}
		System.out.println(letter + " appears "+ count + " time(s).");
		}
	}
}
