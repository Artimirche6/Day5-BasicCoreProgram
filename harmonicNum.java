public class harmonicNum
{
	public static void main(String[] args)
	{
		System.out.println("Swaping Number");
		
		int number = Integer.parseInt(args[0]);
		float harmonic = 0;
		
		for (int i = 1; i < number; i++) 
		{
			harmonic += (float) 1/number;
			System.out.println(" Harmoni Number : "+harmonic);
		}
			
	}
}
