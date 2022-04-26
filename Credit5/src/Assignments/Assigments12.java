package Assignments;

import java.util.Scanner;
/*
Program: Assignment12.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assigments12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a grade percentage: ");
		int grade = input.nextInt();//gets user input
		
		if (grade >= 90 && 100 >= grade)//sets range 
		{
			System.out.println("The corresponding letter grade is: A+" );
		}
		else if (grade >= 80 && 89 >= grade)//sets range
		{
			System.out.println("The corresponding letter grade is: A" );
		}
		else if (grade >= 75 && 79 >= grade)//sets range 
		{
			System.out.println("The corresponding letter grade is: B+" );
		}
		else if (grade >= 70 && 74 >= grade)//sets range 
		{
			System.out.println("The corresponding letter grade is: B" );
		}
		else if (grade >= 65 && 69 >= grade)//sets range 
		{
			System.out.println("The corresponding letter grade is: C+" );
		}
		else if (grade >= 60 && 64 >= grade)//sets range 
		{
			System.out.println("The corresponding letter grade is: C" );
		}
		else if (grade >= 55 && 59 >= grade)//sets range 
		{
			System.out.println("The corresponding letter grade is: D+" );
		}
		else if (grade >= 50 && 54 >= grade)//sets range 
		{
			System.out.println("The corresponding letter grade is: D" );
		}
		else if (grade<50)//sets range 
		{
			System.out.println("The corresponding letter grade is: F" );
		}
	}

}
/*Screen Dump
Enter a grade percentage: 
90
The corresponding letter grade is: A+
*/