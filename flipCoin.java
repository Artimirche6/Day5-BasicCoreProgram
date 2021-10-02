public class flipCoin
{
	
	public static void main(String args[])
	{
		
		int times = Integer.parseInt(args[0]);
		System.out.println("The number of times to Flip Coin : "+times);
		
		int head = 0, tail = 0;
		
		for(int i=0; i < times; i++)
		{
			
			int flip = (int) (Math.random()*10)%2;
			System.out.println("Value of flip : "+flip);
		
			if(flip == 1)
			{
				System.out.println("Head");
				head += 1;
				System.out.println("No of Head : "+head);
			}
			else
			{
				System.out.println("Tail");
				tail += 1;
				System.out.println("No of Tail : "+tail);
			}
		

		}

		
		int headPer = (head*100)/times;
		System.out.println("Percentage of Head : "+headPer);
		
		int tailPer = (tail*100)/times;
		System.out.println("Percentage of Tail : "+tailPer);
		
		
				
	}
	
	
}
