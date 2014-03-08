package p1;

//************************************************************
// Rock.java
//
// Computer plays Rock, Paper, Scissors with the user.
//
//************************************************************

import java.util.Scanner;
import java.util.Random;

public class Rock {
    
    public static void main(String[] args) {
        
    String personPlay;        // User's play -- "R", "P", or "S"
    String computerPlay = ""; // Computer's play -- "R", "P", or "S"
    int computerInt;          // Random number used to determine computer's play
    
    Scanner scan = new Scanner(System.in); // Opens a Scanner object
    Random generator = new Random();       // Opens a Random object
    
    //Get player's play -- note that this is stored as a string
    System.out.print("What is your play? (R, P, or S): ");
    personPlay = scan.next();
    
    //Make player's play uppercase for ease of comparison
    personPlay = personPlay.toUpperCase();
    
    //Generate computer's play
    computerInt = generator.nextInt(3);
    
    //Translate computer's randomly generated play to string
    switch (computerInt) {
    case 0:
        computerPlay = "R";
        break;
    case 1:
        computerPlay = "P";
        break;
    case 2:
        computerPlay = "S";
        break;
    }
    
    //Print computer's play
    System.out.println("The computer played " + computerPlay + "\n");
    
    //See who won. Use nested ifs instead of &&.
    if (personPlay.equals(computerPlay))
        System.out.println("It's a tie!");
    else if (personPlay.equals("R")) {
        if (computerPlay.equals("S"))
            System.out.println("Rock crushes scissors. You win!!");
        else if (computerPlay.equals("P"))
            System.out.println("Paper covers rock. You lose!!");
    }
    else if (personPlay.equals("P")) {
        if (computerPlay.equals("R"))
            System.out.println("Paper covers rock. You win!!");
        else if (computerPlay.equals("S"))
            System.out.println("Scissors cuts paper. You lose!!");
    }
    else if (personPlay.equals("S")) {
        if (computerPlay.equals("P"))
            System.out.println("Scissors cuts paper. You win!!");
        else if (computerPlay.equals("R"))
            System.out.println("Rock crushes scissors. You lose!!");
    }
    
    scan.close();   // Closes Scanner object
    
    }
    
}