package Assignments;

import java.util.Scanner;
/*
Program: Assignment16.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assigment16 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);//calls in scanner
		int ans = (int)(Math.random()*20+1);//generates random
		
		System.out.println("Enter a number between 1 and 20: ");
		int guess = input.nextInt();//allows user input
		
		System.out.println("Computer’s Number is: "+ans);
		System.out.println("Player’s Number is: "+guess);
		
		if (guess != ans)//if the answer doesn't = the guess
		{
			System.out.println("Better luck next time.");//do this
		}
		if (guess == ans)//if the answer does = the guess 
		{
			System.out.println("Good Job.");//do this
		}

	}

}
/*Screen Dump
Enter a number between 1 and 20: 
3
Computer’s Number is: 19
Player’s Number is: 3
Better luck next time. 
*/
