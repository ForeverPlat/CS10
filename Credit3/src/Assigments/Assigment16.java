package Assigments;

import java.util.Scanner;

public class Assigment16 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		int ans = (int)(Math.random()*20+1);
		
		System.out.println("Enter a number between 1 and 20: ");
		int guess = input.nextInt();
		
		System.out.println("Computer’s Number is: "+ans);
		System.out.println("Player’s Number is: "+guess);
		
		if (guess != ans) 
		{
			System.out.println("Better luck next time.");
		}
		if (guess == ans) 
		{
			System.out.println("Good Job.");
		}

	}

}
