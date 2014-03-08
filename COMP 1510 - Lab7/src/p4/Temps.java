package p4;

//************************************************************
// Temps.java
// 
// This program reads in a sequence of hourly temperature
// readings (beginning with midnight) and prints the maximum
// temperature (along with the hour, on a 24-hour clock, it
// occurred) and the minimum temperature (along with the hour
// it occurred).
// 
//************************************************************

import java.util.Scanner;

public class Temps {

    //--------------------------------------------------
    //Reads in a sequence of temperatures and finds the
    //maximum and minimum read in.
    //--------------------------------------------------
    public static void main (String[] args) {
    
        final int HOURS_PER_DAY = 24; // Number of hours in a day
        int temp;                     // Stores a temperature reading
        int maxTemp = -1000;          // Stores the maximum inputted temperature
        int minTemp = 1000;           // Stores the minimum inputted temperature
        int timeOfMax = 0;            // Stores the hour of highest temperature
        int timeOfMin = 0;            // Stores the hour of lowest temperature
        
        Scanner scan = new Scanner(System.in);  // Opens Scanner object
        
        // Print program heading
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour Period");
        System.out.println ();

        //----------------------------------------------
        // Asks user for input of hourly temperature. It
        // updates the max temperature and the hour that
        // it occured every time a new maximum is entered. 
        // It does the same for the minimum temperature,
        // but stores the results in other variables.
        //----------------------------------------------
        for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
            System.out.print ("Enter the temperature reading at " + hour + " hours: ");
            temp = scan.nextInt();

            if(maxTemp < temp) {
                maxTemp = temp;
                timeOfMax = hour;
            }
            
            if(minTemp > temp) {
                minTemp = temp;
                timeOfMin = hour;
            }
        }
        
        // Print the results
        System.out.println("");
        System.out.println("The maximum temperature was " + maxTemp + " at hour " + timeOfMax + ".");
        System.out.println("The minimum temperature was " + minTemp + " at hour " + timeOfMin + ".");
        
        scan.close();   // Closes Scanner object
    }
}