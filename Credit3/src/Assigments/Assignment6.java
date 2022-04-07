package Assigments;

import java.util.Scanner;

public class Assignment6 {
	/*
	Program: Assignment6.java          Date: 4/7/2022


	Author: Luqman Ajani
	School: CHHS
	Course: Computer Science 10
		 
	*/
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 String fName;		  
		 System.out.println("What is your first name? ");
		 fName = input.nextLine();   
		       
		 String lName;		  
		 System.out.println("What is your last name? ");
		 lName = input.nextLine();   
		 
		 String grade;		  
		 System.out.println("What grade are you in? ");
		 grade = input.nextLine();
		    
		 String school;		  
		 System.out.println("What school do you attend? ");
		 school = input.nextLine();  
		 
		 String hobby;		  
		 System.out.println("What is your favourite hobby? ");
		 hobby = input.nextLine();
		 
		 System.out.println("Hello, your name is "+fName+lName+", you are in Grade "+grade+" at "+school+". Your favourite hobby is "+hobby);
		 
		    /*
What is your first name? 
What is your last name? 
What grade are you in?
What school do you attend? 
What is your favourite hobby? 


"Hello, your name is Cosmo Kramer, you are
currently in grade 10 at Crescent Heights HS. Your
favourite hobby is swimming."		      		    		      
		     */

	}

}
