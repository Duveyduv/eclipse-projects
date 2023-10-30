package dominoes;


import java.util.HashSet;
import java.util.Set;

public class DominoHighLowSetImpl_Dove implements Domino
{
	
	private Set<Integer> highLowSet;
	
	
	public DominoHighLowSetImpl_Dove(int highPipCount, int lowPipCount)
	
	{
		
		// checks for any domino that's greater or less than the 28 valid dominos
		if (highPipCount <= 6 && lowPipCount <= highPipCount && highPipCount >= 0 && lowPipCount >= 0)
			
		{
			
			this.highLowSet = new HashSet<Integer>();
	        this.highLowSet.add(highPipCount);
	        this.highLowSet.add(lowPipCount);
			
		}

		else
			
		{
			
			throw new RuntimeException("Not a valid domino.");
			
		}
        
		
	}
	
	public static final char SUM_DIFFERENCE_DELIMITER = ',';
	public static boolean isSumDifferenceString(String str)
	
	{
		
		if (str == null)
			
		{
			
			return false;
			
		}
		
		else
		
		{
		
			String[] strArray = str.split("");
			// split the str into an array.
					
			// should be 12,0 as a str or sum:difference
		    
		    // Check if the string has exactly two parts and both are separated by the SUM_DIFFERENCE_DELIMTER
		    
			if (strArray.length == 3 && strArray[1].equals(String.valueOf(SUM_DIFFERENCE_DELIMITER)))
			
			{
		        
				try 
				
				{
					            
					int sum = Integer.parseInt(strArray[0]);
		            int difference = Integer.parseInt(strArray[2]);
		            
		            int high = (sum + difference) / 2;
		            int low = (sum - difference) / 2;
	 	            
		            // Check if the parsed values are within a valid range and are non-negative
		            if (high + low == sum && high - low == difference)
		            
		            {
		                
		            	return true;  // Valid sum-difference string
		            
		            }
		        
				} 
				
				catch (NumberFormatException e) 
				
				{
		            
					// Parsing as integers failed
		        
				}
				
			}
			
			
			// checking if sum could be 10, 11, or 12  12,0 length is 1,2,3,4
			
			if (strArray.length == 4 && strArray[2].equals(String.valueOf(SUM_DIFFERENCE_DELIMITER)))
				
			{
				
				try 
				
				{
		            
					String firstTwoCharacters = str.substring(0, 2);
					int sum = Integer.parseInt(firstTwoCharacters);
		            int difference = Integer.parseInt(strArray[3]);
		            
		            // Check if the parsed values are within a valid range and are non-negative
		            int high = (sum + difference) / 2;
		            int low = (sum - difference) / 2;
	 	            
		            // Check if the parsed values are within a valid range and are non-negative
		            if (high + low == sum && high - low == difference)
		            
		            {
		                
		            	return true;  // Valid sum-difference string
		            
		            }
		        
				} 
				
				catch (NumberFormatException e) 
				
				{
		            
					// Parsing as integers failed
		        
				}
				
			}
				
		}
		    
		    boolean notValidSumDifferenceString = false;
		    
		    return notValidSumDifferenceString;
	
	}
	
	public DominoHighLowSetImpl_Dove(String sumDifferenceString)
	
	{
		
		String[] sumDifferenceArray = sumDifferenceString.split("");
		
		
		// if the boolean evaluates to true and the length of the sumDifference is i.e. "5:1" so the length is 3...
		if (DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDifferenceString) && sumDifferenceString.length() == 3)
		
		{
			
			int sum = Integer.parseInt(sumDifferenceArray[0]);
			int difference = Integer.parseInt(sumDifferenceArray[2]);
			
			int high = (sum + difference) / 2;
			int low = (sum - difference) / 2;
			
			this.highLowSet = new HashSet<Integer>();
			this.highLowSet.add(high);
			this.highLowSet.add(low);
			
		}
		
		// does the same for above only for sums that are greater than 9, so 10, 11, and 12.
		if (DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDifferenceString) && sumDifferenceString.length() == 4)
			
		{
			
			String firstTwoCharacters = sumDifferenceString.substring(0,2);
			int sum = Integer.parseInt(firstTwoCharacters);
			int difference = Integer.parseInt(sumDifferenceArray[3]);
			
			int high = (sum + difference) / 2;
			int low = (sum - difference) / 2;
			
			this.highLowSet = new HashSet<Integer>();
			this.highLowSet.add(high);
			this.highLowSet.add(low);
		
		}
		
		else
		
		{
			
			throw new RuntimeException("Not a valid Sum,Difference string.");
			
		}
		
	}
	
	public static boolean isLowPlus8TimesHighInteger(int k)
	
	{	
	
		int low;
		int high = 6;
		
		boolean validLP8TH = false;
		
		
		low = k % 8; // i.e. if k = 43, low == 3
		
		
		// i = 6, 6 <= k, high decrements
		for (int i = 0; i <= high; i++)
			
		{
			// if 3 + (8 * 6) == k == 51 ! true
			// if 3 + (8 * 5) == k == 43 should be true
			if (low + (8 * i) == k)
				
			{
				
				
				return !validLP8TH;
				
			}
						
			
		}
	
		return validLP8TH;
		
	}
	
	public DominoHighLowSetImpl_Dove(int lowPlus8TimesHigh)
	
	{
		highLowSet = new HashSet<>();
		
		if (DominoHighLowSetImpl_Dove.isLowPlus8TimesHighInteger(lowPlus8TimesHigh))
			
		{
			
			int low;
			int highCandidate = 6;
			int high = 0;
			
			low = lowPlus8TimesHigh % 8; // i.e. if k = 43, low == 3
			
			// i = 6, 6 <= k, i increments
			for (int i = 0; i <= highCandidate; i++)
				
			{
				// if 3 + (8 * 6) == k == 51 ! true
				// if 3 + (8 * 5) == k == 43 should be true
				if (low + (8 * i) == lowPlus8TimesHigh)
					
				{
					
					high = i;
					
				}
				
			}
			
			this.highLowSet.add(low);
			this.highLowSet.add(high);
		
		}
		
	}

	@Override
	public int getHighPipCount() 
	
	{
		
		Object[] highLowArray = highLowSet.toArray();
		
		if ((int) highLowArray.length == 1)
			
		{
			
			return (int) highLowArray[0];
			
		}
		
		int highPipCount = (int) highLowArray[1];
		
		return highPipCount;
	
	}

	@Override
	public int getLowPipCount() 
	
	{
	
		Object[] highLowArray = highLowSet.toArray();
		
		if ((int) highLowArray.length == 1)
			
		{
			
			return (int) highLowArray[0];
			
		}
				
		int lowPipCount = (int) highLowArray[0];
		
		return lowPipCount;
	
	}

}
