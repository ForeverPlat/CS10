package Assigments;

import java.util.Scanner;

public class DivAndMod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int int1 = input.nextInt();
		
		System.out.print("Enter a second integer: ");
		int int2 = input.nextInt();
		
	
		
		if (int2==0)
		{
			System.out.println("L + Ratio + Bozo ");
			System.exit(0);
		}
		
		int ans1 = (int1/int2);	
		int ans2 = (int1%int2);
		
		System.out.println("\n" + int1+"/"+int2+ "=" +ans1 );
		System.out.println("\n" + int1+"%"+int2+ "="+ ans2 );
	}

}
