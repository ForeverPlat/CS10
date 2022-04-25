package Assignments;

import java.util.Scanner;
/*
Program: Assignment17.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assignment17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		System.out.println("What is your GPA (Type -1 if you want to quit.): ");
		double gpa = input.nextDouble();
		 
		if (gpa == -1) 
		{
			System.exit(0);
	
			System.out.println("Thank you for using ourprogram, have a great day!");
		}
		while (gpa != -1) 
		{
			if (gpa >= 3.65 && 3.8 >= gpa)
			{
				System.out.println("magna cum laude");			
			}
			else if (gpa >= 3.8)
			{
				System.out.println("summa cum laude");
			}
			else if (gpa < 3.65)
			{
				System.out.println("Sorry, at this you did not qualify for an honors distinction.”");
			}
			System.out.println("What is your GPA (Type -1 if you want to quit.): ");
			gpa = input.nextDouble();
			if (gpa == -1) 
			{
				System.out.println("Thank you for using our program, have a great day!");	
			}
			
		}
		
	}

}
/*Screen Dump
What is your GPA (Type -1 if you want to quit.): 
2
Sorry, at this you did not qualify for an honors distinction.”
What is your GPA (Type -1 if you want to quit.): 
3.68
magna cum laude
What is your GPA (Type -1 if you want to quit.): 
4
summa cum laude
What is your GPA (Type -1 if you want to quit.): 
-1
Thank you for using our program, have a great day!
*/
