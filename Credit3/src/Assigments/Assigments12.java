package Assigments;

import java.util.Scanner;

public class Assigments12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a grade percentage: ");
		int grade = input.nextInt();
		
		if (grade >= 90 && 100 >= grade) 
		{
			System.out.println("The corresponding letter grade is: A+" );
		}
		else if (grade >= 80 && 89 >= grade) 
		{
			System.out.println("The corresponding letter grade is: A" );
		}
		else if (grade >= 75 && 79 >= grade) 
		{
			System.out.println("The corresponding letter grade is: B+" );
		}
		else if (grade >= 70 && 74 >= grade) 
		{
			System.out.println("The corresponding letter grade is: B" );
		}
		else if (grade >= 65 && 69 >= grade) 
		{
			System.out.println("The corresponding letter grade is: C+" );
		}
		else if (grade >= 60 && 64 >= grade) 
		{
			System.out.println("The corresponding letter grade is: C" );
		}
		else if (grade >= 55 && 59 >= grade) 
		{
			System.out.println("The corresponding letter grade is: D+" );
		}
		else if (grade >= 50 && 54 >= grade) 
		{
			System.out.println("The corresponding letter grade is: D" );
		}
		else if (grade<50) 
		{
			System.out.println("The corresponding letter grade is: F" );
		}
	}

}
/*
 90 – 100 A+
80 – 89 A
75 – 79 B+
70 – 74 B
65 – 69 C+
60 – 64 C
55 – 59 D+
50 – 54 D
Below 50 F

Enter a grade percentage: 75
The corresponding letter grade is: B+ 
 */
 