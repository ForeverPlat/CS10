package Assigments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		 Scanner userInput = new Scanner(System.in);
		 
		 System.out.println("Enter the change in cents: ");
		 int change = userInput.nextInt();
		 
		 
		 int quarters = change / 25;
		 int dimes = ((change % 25)/10);
		 int nickels = ((change % 25)%10)/5;
		 		  


		 System.out.println("The minimum number of coins is: " +(quarters+dimes+nickels));
		 System.out.println("Quarter: " + quarters);
		 System.out.println("Dimes: "+dimes);
		 System.out.println("Nickels: "+nickels);
		 
	}

}
