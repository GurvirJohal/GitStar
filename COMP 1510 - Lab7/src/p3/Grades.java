package p3;

//************************************************************
// Grades.java
//
// Read in a sequence of grades and compute the average
// grade, the number of passing grades (at least 60)
// and the number of failing grades.
// 
//************************************************************

import java.util.Scanner;

public class Grades {
    
    //-----------------------------------------------------------------
    //Reads in and processes grades until a negative number is entered.
    //-----------------------------------------------------------------
    public static void main (String[] args) {
    
        double grade;       // A student's grade
        double sumOfGrades; // A running total of the student grades
        int numStudents;    // A count of the students
        int numPass;        // A count of the number who pass
        int numFail;        // A count of the number who fail
        
        Scanner scan = new Scanner(System.in);  // Opens Scanner object
        
        // Prints program header
        System.out.println ("\nGrade Processing Program\n");
        
        // Initializes summing and counting variables
        sumOfGrades = 0;
        numStudents = 0;
        numPass = 0;
        numFail = 0;
        
        // Reads in the first grade
        System.out.print ("Enter the first student's grade: ");
        grade = scan.nextDouble();

        //--------------------------------------------------------------
        // Collects grades from user and updates the number of students, 
        // the number of failing grades, and the number of passing 
        // students each time.
        //--------------------------------------------------------------
        while (grade >= 0) {
            sumOfGrades += grade;
            numStudents++;
            
            int x = ((grade < 60) ? numFail++ : numPass++);
            
            //Read the next grade
            System.out.print ("Enter the next grade (a negative to quit): ");
            grade = scan.nextDouble();
        }

        //-------------------------------------------------------
        // Prints class average, number of failing students, and 
        // number of passing students. Another message is printed 
        // if no student grades are entered
        //-------------------------------------------------------
        if (numStudents > 0) {
            System.out.println ("");
            System.out.println ("Grade Summary: ");
            System.out.println ("Class Average: " + sumOfGrades/numStudents);
            System.out.println ("Number of Passing Grades: " + numPass);
            System.out.println ("Number of Failing Grades: " + numFail);
        }
        else
            System.out.println ("No grades processed.");
        
        scan.close();   // Closes Scanner object
    }
}