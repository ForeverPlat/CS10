package Assignments;

import java.util.Scanner;
/*
Program: Assignment15.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
	 
*/
public class Assigment15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = (int)(Math.random()*10+1);
		int b = (int)(Math.random()*10+1);
		int op = (int)(Math.random()*4+1);//(*, +, -, /)
		
		if (op == 1) 
		{
			System.out.print("What is "+a + "*" +b+" = ");
			int ans = input.nextInt();
			if (ans == (a*b)) 
			{
				System.out.println("You got it right! Congratulations!!");
			}
		}
		else if (op == 2) 
		{
			System.out.print("What is "+a + "+" +b+" = ");
			int ans = input.nextInt();
			if (ans == (a+b)) 
			{
				System.out.println("You got it right! Congratulations!!");
			}
			else
			{
				System.out.println("You are wrong");
			}
		}
		else if (op == 3) 
		{
			System.out.print("What is "+a + "-" +b+" = ");
			int ans = input.nextInt();
			if (ans == (a-b)) 
			{
				System.out.println("You got it right! Congratulations!!");
			}
			else
			{
				System.out.println("You are wrong");
			}
		}
		else if (op == 4) 
		{
			System.out.print("What is "+a + "/" +b+" = ");
			int ans = input.nextInt();
			if (ans == (a/b)) 
			{
				System.out.println("You got it right! Congratulations!!");
			}
			else
			{
				System.out.println("You are wrong");
			}
		}
	}

}
/*Screen Dump
What is 6+4 = 10
You got it right! Congratulations!!
*/