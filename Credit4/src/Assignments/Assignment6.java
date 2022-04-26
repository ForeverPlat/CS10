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
		 		  
		 System.out.println("What is your first name? ");
		 String fName = input.nextLine();//allows user to put in input   
		       
		 		  
		 System.out.println("What is your last name? ");
		 String lName = input.nextLine();//allows user to put in input 
		 		  
		 System.out.println("What grade are you in? ");
		 int grade = input.nextInt();//allows user to put in input
		 input.nextLine();   	  
		 
		 System.out.println("What school do you attend? ");
		 String school = input.nextLine();//allows user to put in input  
		 		  
		 System.out.println("What is your favourite hobby? ");
		 String hobby = input.nextLine();//allows user to put in input
		 
		 System.out.println("Hello, your name is "+fName+" "+lName+", you are in Grade "+grade+" at "+school+". Your favourite hobby is "+hobby);//Outputs the answers from the input taken from the user
	}

}
/*Screen Dump

What is your first name? 
L
What is your last name? 
Aja
What grade are you in? 
99
What school do you attend? 
ok school
What is your favourite hobby? 
D:
Hello, your name is L Aja, you are in Grade 99 at ok school. Your favourite hobby is D:
		      		    		      
*/