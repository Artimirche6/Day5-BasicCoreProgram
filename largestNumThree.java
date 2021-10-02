public class largestNumThree
{
	public static void main(String[] args)
	{
		System.out.println("Largest Among Three");
		
		int num1 = Integer.parseInt(args[0]);
		System.out.println("Number 1 : "+num1);
		
		int num2 = Integer.parseInt(args[1]);
		System.out.println("Number 2 : "+num2);
	    
		int num3 = Integer.parseInt(args[2]);
		System.out.println("Number 3 : "+num3);
		
		if ((num1 > num2) && (num1 > num3)) 
		{
			System.out.println(num1+ " is greater than " +num2+ " and "+num3);
		} 
		else if (num2 > num3) 
		{
			System.out.println(num2+ " is greater than " +num1+ " and "+num3);
		}
		else 
		{
			System.out.println(num3+ " is greater than " +num1+ " and "+num2);
		}
		
	
	}
}
