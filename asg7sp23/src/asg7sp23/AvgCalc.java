package asg7sp23;

public class AvgCalc 

{
	// array field
	private double[] arrayNums;
	
	
	// constructor
	public AvgCalc(double[] arrayNums) throws IllegalArgumentException
	
	{
		
		this.arrayNums = arrayNums;
		
		for (double num : arrayNums)
			
		{
			// setting requirements if it is less than 0 or greater than 200, throws exception.
			if (num < 0 || num > 199) 
			
			{
				
				throw new IllegalArgumentException("Input array contains invalid value");
			
			}
			
			// if value is not a number, throws an exception.
			if (Double.isNaN(num))
				
			{
				
				throw new IllegalArgumentException("Input array is not a number.");
				
			}
	                
		}
		
	}
	
	// returns average of values in array
	public double avgNums()
	
	{
		// accumulator
		double sum = 0;
		
		// looping through entirety of array and adding all values together
		for (double num : arrayNums)
			
		{
			
			sum += num;
			
		}
		
		// divide values by the length of the array for average of nums.
		return sum / arrayNums.length;
		
	}
	
}
