package Assigments;

import java.util.Scanner;

public class Assigment8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three digit number:");
		int num = input.nextInt();
		String num0 = Integer.toString(num);
		char num1 = num0.charAt(0);
		char num2 = num0.charAt(1);
		char num3 = num0.charAt(2);
			
		System.out.println("The hundreds-place digit is"+num1);
		System.out.println("The tens-place digit is"+num2);
		System.out.println("The ones-place digit is:"+num3);
		
		
	}

}
