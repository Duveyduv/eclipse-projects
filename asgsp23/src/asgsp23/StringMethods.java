package asgsp23;

public class StringMethods 

{
	// field creating string for input
	private String stringInput;
	
	// constructor taking in string
	public StringMethods(String stringInput) 
	
	{
       
		this.stringInput = stringInput;
    
	}
	
	// first method counting vowels
	public int numVowels() 
	
	{
		
		int total = 0;
		
		String vowels = "AEIOUaeiou";
		
		for (int i = 0; i < stringInput.length(); i++) 
		
		{
			
			if (vowels.indexOf(stringInput.charAt(i)) != -1)
				
			{
				
				total ++;
				
				
			}
			
		}
		
		return total;
		
	}
	
	// second method counting consonants
	public int numConsonants() 
	
	{
        
		int total = 0;
        
        String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        
        for (int i = 0; i < stringInput.length(); i++) 
        
        {
            
        	if (consonants.indexOf(stringInput.charAt(i)) != -1) 
        	
        	{
                
        		total++;
            
        	}
        }
        
        return total;
    
	}
	
	// third method counting whitespaces
    public int numWhiteSpaces() 
    
    {
        
    	int total = 0;
        
    	for (int i = 0; i < stringInput.length(); i++) 
    	
    	{
            
    		if (Character.isWhitespace(stringInput.charAt(i))) 
    		
    		{
                
    			total++;
            
    		}
        
    	}
        
    	return total;
	
    }
    
    // fourth method counting symbols
    public int numSymbols() 
    
    {
        
    	int total = 0;
        
    	for (int i = 0; i < stringInput.length(); i++) 
    	
    	{
            
    		if (!Character.isLetterOrDigit(stringInput.charAt(i)) && !Character.isWhitespace(stringInput.charAt(i))) 
    		
    		{
            
    			total++;
            
    		}
        
    	}
        
    	return total;
    }
    
    // fifth method reversing a string
    public static String reverseString(String str) 
    
    {
        
    	String newString = "";
    	
    	char ch;
    	
    	for (int i = 0; i < str.length(); i++)
    		
    	{
    		
    		ch = str.charAt(i);
    		
    		newString = ch + newString;
    	
    	}
    	
    	return newString;
    
    }
    
    // toString method
    public String toString() 
    
    {
        
    	return "StringMethods{" + "inputString = '" + stringInput + '\'' + '}';
    
    }
    
    

}
