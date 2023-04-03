package cosc2425lab7sp23;

public class PasswordVerifier 

{

	// Main isValid method 	
	public static boolean isValid(String pw)
	 
	
	{
		 
		 return (lengthCase(pw) && isUpperCase(pw) && isLowerCase(pw) && isDigit(pw) && hasSymbols(pw));

	}
	
	// Checks if uppercase
	public static boolean isUpperCase(String pw)
	
	{
		
		for (char i: pw.toCharArray())
			
		{
			
			if (Character.isUpperCase(i))
				
			{
				
				return true;
				
			}
			
			
		}
		
		return false;
		
	}
	
	// Checks if lowercase
	public static boolean isLowerCase(String pw)
	
	{
		
		for (char i: pw.toCharArray())
			
		{
			
			if (Character.isLowerCase(i))
				
			{
				
				return true;
				
			}
			
			
		}
		
		return false;
		
	}
	
	// Checks if contains digit
	public static boolean isDigit(String pw)
	
	{
		
		for (char i: pw.toCharArray())
			
		{
			
			if (Character.isDigit(i))
				
			{
				
				return true;
				
			}
			
			
		}
		
		return false;
		
	}
	
	// Checks length is within the required dimensions
	public static boolean lengthCase(String pw)
	
	{
		
		 if (pw.length() >= 16 && pw.length() <= 20)
			 
		 {
			 
			 return true;
			 
		 }
		 	 
		 else 
			 
		 {
			 
			 return false;
		 }
		
	}
	
	// Checks if contains special Chars.
	public static boolean hasSymbols(String pw)
	
	{
		
		for (char i: pw.toCharArray())
			
		{
			
			if (!Character.isLetterOrDigit(i))
				
			{
				
				return true;
				
			}
			
			
		}
		
		return false;
		
	}
	
	
}
