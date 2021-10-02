public class swapNum
{
	public static void main(String[] args)
	{
		System.out.println("Swaping Number");
		
		int number1 = Integer.parseInt(args[0]);
		
		int number2 = Integer.parseInt(args[1]);

		System.out.println("Before swapping Number 1 : " +number1+" and Number 2 : " +number2);
	    
		
		int temp;
		
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		
		System.out.println("After swapping Number 1 : " +number1+" and Number 2 : " +number2);
			
	}
}
