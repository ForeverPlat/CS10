package Exercise;

public class JavaIfElse 
{

	public static void main(String[] args) 
	{
		int x = 50;
		int y = 10;
		if(x > y) 
		{
			System.out.println("Hello World");
		}
		
		
		int a = 50;
		int b = 50;
		if(a == b) 
		{
		  System.out.println("Hello World");
		}
		
		
		int c = 50;
		int d = 50;
		if
		 (c == d) 
		{
		  System.out.println("Yes");
		} 
		else
		 {
		  System.out.println("No");
		}  
		
		int e = 50;
		int f = 50;
		if(e == f) 
		{
		  System.out.println("1");
		} 
		else if(e > f) 
		{
		  System.out.println("2");
		} 
		else
		 {
		  System.out.println("3");
		 }  
		int time = 20;
		String result = (time < 18)?"Good day." :"Good evening.";
		System.out.println(result); 
	}

}
