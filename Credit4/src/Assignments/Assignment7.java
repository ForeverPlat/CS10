package Assignments;

import java.util.Scanner;
/*
Program: Assignment7.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assignment7 
{
	public static void main(String[] args) 
	{
		 Scanner userInput = new Scanner(System.in);//calls in scanner
		 
		 System.out.println("Enter the change in cents: ");
		 int change = userInput.nextInt();//Takes user input
		 
		 
		 int quarters = change / 25;//finds number of quarters
		 int dimes = ((change % 25)/10);//finds number of dimes 
		 int nickels = ((change % 25)%10)/5;//finds number of nickels
		 		  


		 System.out.println("The minimum number of coins is: " +(quarters+dimes+nickels));
		 System.out.println("Quarter: " + quarters);
		 System.out.println("Dimes: "+dimes);
		 System.out.println("Nickels: "+nickels);
		 
	}

}

/*Screen Dump
 
Enter the change in cents: 
225
The minimum number of coins is: 9
Quarter: 9
Dimes: 0
Nickels: 0 
*/
