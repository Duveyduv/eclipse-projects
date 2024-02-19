package rationalnumbers;


public class RationalNumberImpl_Dove implements RationalNumber 

{
    
	private int numerator;
    private int denominator;

 
    public RationalNumberImpl_Dove(int a, int b) 
    
    {
    	
    	assert b != 0: "Denominator cannot be equal to 0!";
        	
    	this.numerator = a;
        this.denominator = b;
        simplify();
        
    }
    
    // find our GCD
	public static int greatestCommonFactor(int a, int b)
	
	{
		
		   if ( b == 0 ) 
		   
		   {
			   
			   return a;
			   
		   }
		   
		   if ( b < 0 || a < 0)
			   
		   {
			   
			   throw new RuntimeException("Inputs cannot be negative!");
			   
		   }
		   
		   return greatestCommonFactor(b, a % b);
		  
	}

    private void simplify()
    
    {
        
        // Find the GCD of the numerator and denominator
        int gcd = greatestCommonFactor(Math.abs(numerator), Math.abs(denominator));

        // Reduce numerator and denominator by the GCD
        numerator /= gcd;
        denominator /= gcd;

        // Ensure the denominator is positive
        if (denominator < 0) 
        
        {
            
        	numerator = -numerator;
            denominator = -denominator;
        
        }
    
    }

    @Override
    public int getNumerator() 
    
    {
    	
        return numerator;
        
    }

    @Override
    public int getDenominator() 
    
    {
    	
        return denominator;
        
    }

    @Override
    public double getValue() 
    
    {
    	
        return (double) numerator / denominator;
        
    }
    
    @Override
    public String toString() 
    
    {
    	
		return numerator + "/" + denominator;
    		
    }
       
}