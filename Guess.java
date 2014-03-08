package p1;

//************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
//************************************************************

import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static void main(String[] args) {
        int numToGuess; // Number the user tries to guess
        int guess;      // The user's guess
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        // Randomly generate the number to guess
        numToGuess = generator.nextInt(10) + 1;
        
        // Print message asking user to enter a guess
        System.out.print("Guess a number from 1 to 10: ");
        
        // Read in guess
        guess = scan.nextInt();
        
        while (numToGuess != guess) // Keep going as long as the guess is wrong
        {
            // Print message saying guess is wrong
            System.out.print("Incorrect! Please try again: ");
            
            // Get another guess from the user
            guess = scan.nextInt();
        }
        
        // Print message saying guess is right
        System.out.println("Correct!");
        
        // Closes Scanner object
        scan.close();
    }
}