package mypackage;

import java.util.Random;
import java.util.Scanner;

public class GuessSecretNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num; // users guess
		String continuePlaying = null;
		boolean userGaveUp = false; // true if user voluntarily quits
		
		// given code to generate a random num between 1-11
		Random r = new Random();
		int secretNum = 1 + r.nextInt(10);
//		System.out.println("secretNum is: " + secretNum);
		
		// keep asking the user for a new guess until they guess it, or say N or n to quit
		do {
			System.out.println("Enter your number: ");
			num = scanner.nextInt();
			
			if(num > secretNum) { // entered num is too high
				System.out.println("You guessed too high, try again? (Y/N)");
				continuePlaying = scanner.next();
				if(continuePlaying.equalsIgnoreCase("n"))
					userGaveUp = true;
			}
			if(num < secretNum) { // entered num is too low
				System.out.println("You guessed too low, try again? (Y/N)");
				continuePlaying = scanner.next();
				if(continuePlaying.equalsIgnoreCase("n"))
					userGaveUp = true;
			}
			if(num == secretNum) { // secret number has been found
				System.out.println("CONGRATULATIONS, YOU GUESSED IT!");
				continuePlaying = "n"; // end the program
				userGaveUp = false;
			}
			
		} while(continuePlaying.equalsIgnoreCase("y"));
		
		if(userGaveUp) // display an encouraging message if user quits
			System.out.println("Thanks for playing, better luck next time!");
		
		
	}

}
