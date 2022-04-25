package Assignments;

import java.util.Scanner;
/*
Program: DivAndMod.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class DivAndMod 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//calls in scanner

		System.out.print("Enter an integer: ");
		int int1 = input.nextInt();//gets user input
		
		System.out.print("Enter a second integer: ");
		int int2 = input.nextInt();//gets user input

		if (int2==0)
		{
			System.out.println("You can't divide it by zero: ");
			System.exit(0);//Stops the program
		}
		
		int ans1 = (int1/int2);//gets first digit	
		int ans2 = (int1%int2);//gets remainder
		
		System.out.println("\n" + int1+"/"+int2+ "=" +ans1 );
		System.out.println("\n" + int1+"%"+int2+ "="+ ans2 );
	}
}
/*Screen Dump
Enter an integer: 63
Enter a second integer: 12

63/12=5

63%12=3
*/