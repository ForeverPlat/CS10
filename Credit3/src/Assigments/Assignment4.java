package Assigments;

import java.util.Scanner;
/*

Program: Assignment4.java          Date: 4/21/2022


Author: Luqman Ajani
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment4 
{

	public static void main(String[] args) 
	{
		  Scanner myObj = new Scanner(System.in);//Making the Scanner variable myObj		  
		    
		    System.out.println("Enter the diameter of the pizza in inches: "); 
		    int pizzaSize = myObj.nextInt();//Allowing user to input
		       
		    System.out.println("The cost of making the pizza is: $" + (0.05*pizzaSize*pizzaSize+1.75));//Calculating the cost of pizza

	}

}
/*Screen Dump

Enter the diameter of the pizza in inches: 
10
The cost of making the pizza is: $6.75		

 */