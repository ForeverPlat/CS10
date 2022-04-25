package Assignments;

import java.util.Scanner;
/*
Program: Assignment14.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assigment14 
{

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);//Calls in Scanner
		
		System.out.println("What age are you: ");
		int age = input.nextInt();//allows user input
		
		if (age <= 5)//to do the following if
		{
			System.out.println("Toddler");
		}
		else if (age <= 10)//to do the following if
		{
			System.out.println("child");
		}
		else if (age <= 12)//to do the following if
		{
			System.out.println("Preteen");
		}
		else if (age <= 18)//to do the following if
		{
			System.out.println("Teen");
		}
		else//final option
		{
			System.out.println("Adult");
		}
	}

}
/*Screen Dump
What age are you: 
5
Toddler
 */
