package rationalnumbers;

public class RationalNumberUtils_Dove 

{
	
	public static boolean equal(RationalNumber r1, RationalNumber r2) 
    
    {
    	
        return r1.getNumerator() * r2.getDenominator() == r1.getDenominator() * r2.getNumerator();
       
    }

    public static RationalNumber add(RationalNumber r1, RationalNumber r2) 
    
    {
        
    	// Addition: a/b + c/d = (ad + bc)/bd
        int newNumerator = r1.getNumerator() * r2.getDenominator() + r1.getDenominator() * r2.getNumerator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumberImpl_Dove(newNumerator, newDenominator);
    
    }
    
    public static RationalNumber subtract(RationalNumber r1, RationalNumber r2) 
    
    {
     
    	// Subtraction: a/b – c/d = (ad – bc)/bd
        int newNumerator = r1.getNumerator() * r2.getDenominator() - r1.getDenominator() * r2.getNumerator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumberImpl_Dove(newNumerator, newDenominator);
        
    }
    
    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2) 
    
    {
     
    	// Multiplication: (a/b)*(c/d) = (ac/bd)
        int newNumerator = r1.getNumerator() * r2.getNumerator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumberImpl_Dove(newNumerator, newDenominator);
        
    }
    
    public static RationalNumber divide(RationalNumber r1, RationalNumber r2) 
    
    {
    	assert r2.getNumerator() != 0 : "r2 numerator cannot be 0!";
    	// Division: (a/b)/(c/d) = (ad/bc)
        int newNumerator = r1.getNumerator() * r2.getDenominator();
        int newDenominator = r1.getDenominator() * r2.getNumerator();
        return new RationalNumberImpl_Dove(newNumerator, newDenominator);
        
    }
    
    public static RationalNumber negate(RationalNumber r1) 
    
    {
    	
    	// Negation: -(a/b) = (-a/b)
        int newNumerator = r1.getNumerator() * -1;       
        return new RationalNumberImpl_Dove(newNumerator, r1.getDenominator());
        
    }
 
}