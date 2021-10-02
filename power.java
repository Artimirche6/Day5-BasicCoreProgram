public class power
{
	public static void main(String[] args)
	{
		System.out.println("Power of 2");
		
		int power = Integer.parseInt(args[0]);
		System.out.println("Power raised till : "+power);
	    
		while( power > 0 && power < 31)
		{
		
			for(int i=0; i <= power; i++)
			{
				int table = (int) Math.pow(2, i);
				System.out.println(" 2 power " +i+ " is " +table);
			}
			
			break;
		}
		
		
		
	}
}
