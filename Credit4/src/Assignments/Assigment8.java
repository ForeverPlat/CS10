package Assignments;

import java.util.Scanner;
/*
Program: Assignment8.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assigment8 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//calls in scanner
		
		System.out.println("Enter a three digit number:");
		int num = input.nextInt();
		String num0 = Integer.toString(num);//changes changing num to a string
		char num1 = num0.charAt(0);//gets the first place value
		char num2 = num0.charAt(1);//gets the second place value
		char num3 = num0.charAt(2);//gets the third place value
			
		System.out.println("The hundreds-place digit is"+num1);
		System.out.println("The tens-place digit is"+num2);
		System.out.println("The ones-place digit is:"+num3);		
	}
}
/*Screen Dump

Enter a three digit number:
225
The hundreds-place digit is2
The tens-place digit is2
The ones-place digit is:5

 */
 