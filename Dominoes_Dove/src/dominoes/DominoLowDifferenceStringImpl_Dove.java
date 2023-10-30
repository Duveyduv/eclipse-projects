package dominoes;

import java.util.List;

public class DominoLowDifferenceStringImpl_Dove implements Domino
{

	private String lowDifferenceString;
	private static final char LOW_DIFFERENCE_DELIMITER = '*';
	
	
	//pre: left to student
	//post: left to student

	
	public DominoLowDifferenceStringImpl_Dove(int lowPlus8TimesHigh)
	
	{
		
		int low = lowPlus8TimesHigh % 8;
		
		int high = 6;

		// i = 6, 6 <= k, high decrements
		for (int i = 0; i <= high; i++)
			
		{
			// if 3 + (8 * 6) == k == 51 ! true
			// if 3 + (8 * 5) == k == 43 should be true
			if (low + (8 * i) == lowPlus8TimesHigh)
				
			{
				
				high = i;
				
			}
			
		}
		
		int difference = high - low;
		
		this.lowDifferenceString = low + String.valueOf(LOW_DIFFERENCE_DELIMITER) + difference;
		
	}

	public static final int INDEX_OF_HIGH = 0;
	public static final int INDEX_OF_SUM = 1;
	
	
	//pre: left to student;
	//post: left to student;
	
	public DominoLowDifferenceStringImpl_Dove(List<Integer> highSum)
	
	{
		
		Object[] highSumArray = highSum.toArray();
		
		
		if (highSumArray.length == 2)
		
		{
			
			int high = (int) highSumArray[INDEX_OF_HIGH];
			int sum = (int) highSumArray[INDEX_OF_SUM];
			
			int low = sum - high;
			int difference = high - low;
			
			if (low > 6 && low < 0 && difference < 0 && difference > 6)
				
			{
				
				throw new RuntimeException("Not a valid low*difference domino.");
				
			}
			
			else
				
			{
				
				this.lowDifferenceString = low + String.valueOf(LOW_DIFFERENCE_DELIMITER) + difference;

				
			}
			
			
			
			
		}
		
		if (highSumArray.length == 3)
			
		{
			
			int high = (int) highSumArray[0];
			
		    String result = "";
		    
		    for (int i : highSum) 
		    
		    {
		        
		    	result += i;
		    	
		    }
		    
		    String ofSum = result.substring(1,2);
		    
		    int sum = Integer.parseInt(ofSum);
		    
		    int low = sum - high;
		    
		    int difference = high - low;
		    
			if (low > 6 && low < 0 && difference < 0 && difference > 6)
				
			{
				
				throw new RuntimeException("Not a valid low*difference domino.");
				
			}
			
			else
				
			{
				
				this.lowDifferenceString = low + String.valueOf(LOW_DIFFERENCE_DELIMITER) + difference;

				
			}
		    
		}
	
	}

	@Override
	public int getHighPipCount() 
	
	{
	
		String[] lowDiffArray = this.lowDifferenceString.split("");
		
		String x = lowDiffArray[0];
		
		int lowPipCount = Integer.parseInt(x);
		
		String y = this.lowDifferenceString.substring(2);
		
		int difference = Integer.parseInt(y);
		
		int highPipCount = lowPipCount + difference;

		return highPipCount;
		
	}

	@Override
	public int getLowPipCount() 
	
	{
		
		String[] lowDiffArray = this.lowDifferenceString.split("");
		
		String x = lowDiffArray[0];
		
		int lowPipCount = Integer.parseInt(x);
		
		return lowPipCount;
	
	}

}
