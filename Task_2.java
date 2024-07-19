package ProdegyInfoTechInternship;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
 	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int lowerBound = 1;
	        int upperBound = 100;
	        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

	        int attempts = 0;
	        int userGuess;

	        System.out.println("*Welcome*");
	        System.out.println(
	                "You have to guess a selected number between " + lowerBound + " and " + upperBound + "..");

	        do {
	            System.out.print("Enter your guess: ");
	            userGuess = scanner.nextInt();
	            attempts++;

	            if (userGuess < randomNumber) {
	                System.out.println("No! Try again.Guess larger number than this'");
	            } else if (userGuess > randomNumber) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	            }

	        } while (userGuess != randomNumber);

	        scanner.close();
	    }
	}
