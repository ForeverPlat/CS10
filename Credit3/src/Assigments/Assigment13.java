package Assigments;

import java.text.NumberFormat;
import java.util.Scanner;


public class Assigment13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat dc = NumberFormat.getCurrencyInstance();
		
		System.out.println("Enter the number of copies to be printed: ");
		int num = input.nextInt();
		
		if (num >= 0 && 99 >= num) 
		{
			System.out.println("Price per copy: $0.30");
			double num1 = (num*0.30);	
			System.out.println("Total cost is: "+dc.format(num1));
		}
		else if (num >= 100 && 499 >= num) 
		{
			System.out.println("Price per copy: $0.28");
			double num2 = (num*0.28);		
			System.out.println("Total cost is: "+num2);
		}
		else if (num >= 500 && 749 >= num) 
		{
			System.out.println("Price per copy: $0.27");
			double num3 = (num*0.27);		
			System.out.println("Total cost is: "+num3);
		}
		else if (num >= 750 && 1000 >= num) 
		{
			System.out.println("Price per copy: $0.26");
			double num4 = (num*0.26);		
			System.out.println("Total cost is: "+num4);
		}
		else if (num > 1000) 
		{
			System.out.println("Price per copy: $0.25");
			double num5 = (num*0.25);
			System.out.println("Total cost is: "+num5);
		}
	}
/*
Enter the number of copies to be printed: 1001
Price per copy is: $0.25
Total cost is: $250.25


0 – 99 $0.30 per copy
100 – 499 $0.28 per copy
500 – 749 $0.27 per copy
750 – 1000 $0.26 per copy
Over 1000 $0.25 per copy
 */
}
