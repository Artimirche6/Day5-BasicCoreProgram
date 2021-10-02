public class quotientRemainder
{
	public static void main(String[] args)
	{
		System.out.println("Quotient Remainder");
		
		int dividend = Integer.parseInt(args[0]);
		System.out.println("Dividend : "+dividend);
		
		int divisor = Integer.parseInt(args[1]);
		System.out.println("Divisior : "+divisor);
	    
		
		float quotient = (float) dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
			
	}
}
