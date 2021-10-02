public class factorOfNum
{
	public static void main(String[] args)
	{
		System.out.println("FACTORS");
		
		int number = Integer.parseInt(args[0]);
		
		for(int i=1; i <= number; i++)
		{	
			if(number % i == 0)
			{ 
				if(isPrime(i))
				{
					System.out.println("Prime Factor : "+i);
		
				}
			}
				
		}

	}
	

	public static boolean isPrime(int num)
	{
			
		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				return false;
			}

		}
		
		return true;
			
	}
	
}
