package Assigments;

import java.util.Scanner;

public class Assignment4 {
	/*

	Program: Assignment4.java          Date: 4/6/2022


	Author: Luqman Ajani
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) {
		  Scanner myObj = new Scanner(System.in);		  
		    
		    System.out.println("Enter the diameter of the pizza in inches: "); 
		    int pizzaSize = myObj.nextInt();   
		       
		    System.out.println("The cost of making the pizza is: " + (0.05*pizzaSize*pizzaSize+1.75));

	}

}
