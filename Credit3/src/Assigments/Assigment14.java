package Assigments;

import java.util.Scanner;

public class Assigment14 
{

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("What age are you: ");
		int age = input.nextInt();
		
		
		if (age <= 5)
		{
			System.out.println("Toddler");
		}
		else if (age <= 10)
		{
			System.out.println("child");
		}
		else if (age <= 12)
		{
			System.out.println("Preteen");
		}
		else if (age <= 18)
		{
			System.out.println("Teen");
		}
		else 
		{
			System.out.println("Adult");
		}
	}

}
