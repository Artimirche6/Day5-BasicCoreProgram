public class evenOddNum
{
	public static void main(String[] args)
	{
		System.out.println("Even Odd Number");
		
		int number = Integer.parseInt(args[0]);

		System.out.println("Number to Check Even or Odd : "+number);
	    
		if ( number % 2 == 0) 
		{
			System.out.println(number+ " is Even");
		}
		else
		{
			System.out.println(number+ " is odd");
		} 
		
		
	}
}
