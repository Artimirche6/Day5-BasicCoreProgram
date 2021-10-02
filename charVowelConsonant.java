public class charVowelConsonant
{
	public static void main(String[] args)
	{
		System.out.println("Vowel and Consonant");
		
		String vowels[] = {"a", "A", "e", "E", "i", "I", "o", "O", 					 "u", "U"};
		
		String ch = args[0];

		System.out.println("Character : "+ch);	

			int isVowel = 0;
		
		for (String letter:vowels) 
		{
			if (ch.equals(letter)) 
			{
				System.out.println(ch+ " is Vowel");
				isVowel = 1;
			}

			
		}
		
		if ( isVowel == 0 )
		{
			System.out.println(ch+ " is Consonant");
		}
			
    	}
}

