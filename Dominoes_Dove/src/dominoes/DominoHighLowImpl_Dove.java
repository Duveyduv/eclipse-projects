package dominoes;

import java.util.Set;

public class DominoHighLowImpl_Dove implements Domino

{

	private int highPipCount;
	private int lowPipCount;
	
	public DominoHighLowImpl_Dove(int highPipCount, int lowPipCount)
	
	{
		
		if (highPipCount <= 6 && lowPipCount <= highPipCount && highPipCount >= 0 && lowPipCount >= 0)
			
		{
			
			this.highPipCount = highPipCount;
			this.lowPipCount = lowPipCount;
			
		}
		
		else
			
		{
			
			throw new RuntimeException("Not a valid Domino");
			
		}
		
	}
	
	public static final char HIGH_LOW_STRING_SEPARATOR = ':';
	
	public static boolean isHighLowString(String str)
	
	{
		
		if (str == null)
		
		{
			
			return false;
			
		}
		
		else
		
		{
		
			String[] strArray = str.split("");
			// split the str into an array.
			
			// should be 4:3 as a str or high:low
		    
		    // Check if the string has exactly two parts and both are separated by the HIGH_LOW_STRING_SEPARATOR
		    if (strArray.length == 3 && strArray[1].equals(String.valueOf(HIGH_LOW_STRING_SEPARATOR))) 
		    
		    {
		    	       
		    	try 
		    	
		    	{
		            
		    		int highPipCount = Integer.parseInt(strArray[0]);
		            int lowPipCount = Integer.parseInt(strArray[2]);
		            
		            // Check if the parsed values are within a valid range
		            if (highPipCount <= 6 && lowPipCount <= highPipCount && highPipCount >= 0 && lowPipCount >= 0) 
		            
		            {
		               
		            	return true; // Valid high-low string
		            
		            }
		        
		    	} 
		    	
		    	catch (NumberFormatException e) 
		    	
		    	{
		            
		    		// Parsing as integers failed
		        
		    	}	
		    
		    }
		    
		    boolean notValidHighLowString = false;
		    
		    return notValidHighLowString;
		
		}
		
	}
	
	public DominoHighLowImpl_Dove(String highLowString)
	
	{
		
		String[] highLowArray = highLowString.split("");
		
		if (DominoHighLowImpl_Dove.isHighLowString(highLowString))
		
		{
			
			this.highPipCount = Integer.parseInt(highLowArray[0]);
			this.lowPipCount = Integer.parseInt(highLowArray[2]);
		 
		}
		
		else
			
		{
			
			throw new RuntimeException("Not a valid domino.");
			
		}
			
	}
	
	public static final int INDEX_OF_SUM = 0;
	public static final int INDEX_OF_DIFFERENCE = 1;
	
	public DominoHighLowImpl_Dove(int[] sumDifference) 
	
	{
        
		if (sumDifference.length < 2)
		
		{
        
			throw new IllegalArgumentException("sumDifference array must have a length of 2");
        
		}
        
        int sum = sumDifference[INDEX_OF_SUM];
        int difference = sumDifference[INDEX_OF_DIFFERENCE];
            
        if (sum < difference || sum > 12 || sum < 0 || difference < 0) 
        
        {
        
        	throw new IllegalArgumentException("Invalid sumDifference values");
        
        }
                
        else
        
        {
        
        	this.highPipCount = (sum + difference) / 2;
        	this.lowPipCount = (sum - difference) / 2;
        	
        }
           
	}
    
	//part of pre: 1 <= highLowSet.size() <= 2
	//part of pre: ! highLowSet.contains(null)
	
    public DominoHighLowImpl_Dove(Set<Integer> highLowSet) 
    
    {
    	
        Object[] highLowArray = highLowSet.toArray();
        
        if (highLowArray.length < 2) 
        
        {
            // one element in the set, or the dominoes that have equal high and lows
                    		
            	int value = (int) highLowArray[0];
                
            	if (value > 6 || value < 0)
            		
            	{
            		
            		throw new RuntimeException("Not a valid domino.");
            		
            	}
            	
            	else
            		
            	{
            		
                	this.highPipCount = value;
                    this.lowPipCount = value;
            		
            	}
	 	        
        }
        
        else
        
        {
        	
        	int high = (int) highLowArray[1];
            int low = (int) highLowArray[0];
            
            // Determine which value is higher and which is lower
            if (high <= 6 && low <= high && high >= 0 && low >= 0)
            
            {
            
            	this.highPipCount = high;
                this.lowPipCount = low;
                
            } 
            
            else 
            
            {
            	
                throw new RuntimeException("Not a valid domino.");
                
            }
        	
        }
            
     }
        
	public int getHighPipCount() 
	
	{

		return highPipCount;
		
	}
	
	public int getLowPipCount() 
	
	{

		return lowPipCount;
		
	}
	
}