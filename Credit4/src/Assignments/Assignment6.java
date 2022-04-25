package Assignments;

import java.util.Scanner;
/*
Program: Assignment6.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assignment6 
{
	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);//calls in Scanner
		 
		 String fName;		  
		 System.out.println("What is your first name? ");
		 fName = input.nextLine();//allows user to put in input   
		       
		 String lName;		  
		 System.out.println("What is your last name? ");
		 lName = input.nextLine();//allows user to put in input 
		 
		 String grade;		  
		 System.out.println("What grade are you in? ");
		 grade = input.nextLine();//allows user to put in input
		    
		 String school;		  
		 System.out.println("What school do you attend? ");
		 school = input.nextLine();//allows user to put in input  
		 
		 String hobby;		  
		 System.out.println("What is your favourite hobby? ");
		 hobby = input.nextLine();//allows user to put in input
		 
		 System.out.println("Hello, your name is "+fName+lName+", you are in Grade "+grade+" at "+school+". Your favourite hobby is "+hobby);//Outputs the answers from the input taken from the user
	}

}
/*Screen Dump


What is your first name? 
What is your last name? 
What grade are you in?
What school do you attend? 
What is your favourite hobby? 


"Hello, your name is Cosmo Kramer, you are
currently in grade 10 at Crescent Heights HS. Your
favourite hobby is swimming."		      		    		      
*/