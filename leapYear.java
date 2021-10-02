public class leapYear
{
	public static void main(String[] args)
	{
		System.out.println("LEAP YEAR PROGRAM!!!");
		
		int year = Integer.parseInt(args[0]);
		System.out.println("Year : "+year);
		
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.println("Year is a leap year : "+year);
		}
		else
		{
			System.out.println("Year is not a leap year : "+year);
		}
		
		
	}
}
