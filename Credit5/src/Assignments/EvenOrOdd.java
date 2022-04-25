package Assignments;
/*
Program: EvenOrOdd.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
import java.util.Scanner;

public class EvenOrOdd 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);//calls in scanner
		
		System.out.println("Please enter an integer: ");
		int int1 = input.nextInt();//asks user for input
		
		int int2 = (int1/2);//finds even
		int ans1 = (int1/int2);//finds odd
		
		if(ans1 == 1)
		{
			System.out.println("The integer " +int1+" is odd");
		}
		else 
		{	
			System.out.print("The integer " +int1+" is even");
		}			
	}
}
/*Screen Dump
Please enter an integer: 
32
The integer 32 is even
*/
 