package p2;

//************************************************************
// Dates.java
// 
// Determine whether a 2nd-millenium date entered by the user
// is valid.
// 
//************************************************************

import java.util.Scanner;

public class Dates {
    
    public static void main(String[] args) {

    int month, day, year;       // Date read in from user
    int daysInMonth = 0;        // Number of days in month read in
    boolean monthValid = false; // True if month is valid
    boolean yearValid = false;  // True if year is valid
    boolean dayValid = false;   // True if day is valid
    boolean leapYear = false;   // True if user's year is a leap year
    
    Scanner scan = new Scanner(System.in);  // Opens Scanner object
    
    // Get integer month, day, and year from user
    System.out.print("Enter the month: ");
    month = scan.nextInt();
    System.out.print("Enter the day: ");
    day = scan.nextInt();
    System.out.print("Enter the year: ");
    year = scan.nextInt();
    
    // Check to see if month is valid
    if (month >= 1 && month <= 12)
        monthValid = true;
    
    // Check to see if year is valid
    if (year >= 1000 && year <= 1999)
        yearValid = true;
    
    // Determine whether inputted year is a leap year
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0)
                leapYear = true;
            else
                leapYear = false;
        }
        else
            leapYear = true;
    }
    
    // Determine number of days in inputted month
    if(month == 1)
        daysInMonth = 31;
    else if(month == 2) {
        if(leapYear == false)
            daysInMonth = 28;
        else if(leapYear == true)
            daysInMonth = 29;
    }
    else if(month == 3)
        daysInMonth = 31;
    else if(month == 4)
        daysInMonth = 30;
    else if(month == 5)
        daysInMonth = 31;
    else if(month == 6)
        daysInMonth = 30;
    else if(month == 7)
        daysInMonth = 31;
    else if(month == 8)
        daysInMonth = 31;
    else if(month == 9)
        daysInMonth = 30;
    else if(month == 10)
        daysInMonth = 31;
    else if(month == 11)
        daysInMonth = 30;
    else if(month == 12)
        daysInMonth = 31;
    else
        daysInMonth = 0;
    
    // Use number of days in month to check to see if day is valid
    if (day >= 1 && day <= daysInMonth)
        dayValid = true;
    else
        dayValid = false;
    
    // Determine whether date is valid and print appropriate message
    if (dayValid && monthValid && yearValid) {
        System.out.print("Date is valid. ");
        if (leapYear)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
    else
        System.out.println("Date is invalid!");
        
    scan.close();   // Closes Scanner object
    
    }
}