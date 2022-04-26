package Assignments;

import java.util.Scanner;

public class Assigments11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//calls in scanner
		
		System.out.print("Please enter any three digits: ");
		int digits = input.nextInt();//allows user input
		
		
		int num1 = digits/100;//gets the first digit
		int num2 = digits%100/10;//gets the second digit
		int num3 = digits%100%10;//gets the third digit
		
		//max
		if (num1 >= num2 && num1 >= num3)//finds the range
			System.out.println("The largest of the three digits is: "+ num1);
		else if (num2 >= num1 && num2 >= num3)//finds the range
			System.out.println( "The largest of the three digits is: "+num2);
		else
			System.out.println("The largest of the three digits is: "+ num3 );
		//min
		if (num1 <= num2 && num1 <= num3)//finds the range
			System.out.println("The smallest of the three digits is:"+ num1);
		else if (num2 <= num1 && num2 <= num3)//finds the range
			System.out.println( "The smallest of the three digits is: "+num2 );
		else
			System.out.println( "The smallest of the three digits is: "+num3 );

		System.out.println("The sum of the three digits is: " + (num1+num2+num3));
		System.out.println("The product of the three digits is: "+ (num1*num2*num3));
		System.out.println("The average of the three digits is: "+ (num1+num2+num3/3));
	}

}
/*
Please enter any three digits: 569
The largest of the three digits is: 9
The smallest of the three digits is: 5
The sum of the three digits is: 20
The product of the three digits is: 270
The average of the three digits is: 6 
 */