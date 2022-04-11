package Exercise;

import java.util.Scanner;

public class ifstate 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("Name? ");
		String Name = input.nextLine();
		
		System.out.println("grade? ");
		int grade = input.nextInt();
		
		
		if(Name.equals("yo"))
		{
			System.out.println("ok");
				if (grade == 10) 
				{
					System.out.println("u got no maidens? if ur me");	
				}
				else
				{
					System.out.print("urmom");
				}
		}
		else
		{
			System.out.println("Noob");
		}
		
	}

}
