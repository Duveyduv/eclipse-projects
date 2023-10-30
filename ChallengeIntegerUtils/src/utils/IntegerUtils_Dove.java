package utils;

import java.util.Set;

public interface IntegerUtils_Dove

{

	public static boolean isEven(int k)

	{
		
		// if k divided by 2 has a remainder of 0, then it's even
		if (k % 2 == 0)
		
		{
		
			return true;
		
		}
		
		else
		
		{
		
			return false;
		
		}
		
		// straightforward isEven(2) -> True
		// bizarre isEven(-2) -> True
		// extreme isEven(0) -> True
		
	}
	
	public static boolean isOdd(int k)
	
	{
		
		// if k divided by 2 has a remainder of 1, then it's odd
		if ( k % 2 == 1 )
		
		{
			
			return true;
		
		}
		
		else
		
		{
			
			return false;
		
		}
		
		// straightforward isOdd(2) -> False
		// bizarre isOdd(-3) -> False
		// extreme isOdd(0) -> False
		
	}
	
	public static boolean isPrime(int k)
	
	{
	    
		boolean notPrime = false;
		
		{
	        // any number sub 1 we don't want to check if it's prime
			if(k <= 1)
	        
			{
	        
				return false;
	        
			}
	       
			// we start i at 2 because we want to check if it's even
			for(int i = 2; i <= k / 2; i++)
			
			{
		
				if( (k % i) == 0)
					
				{
					
					return notPrime;
					
				}
	              
			}
	       
			boolean isPrime = !notPrime;
			
			// so then we return true if else
			return isPrime;
	    
		}
		
		// straightforward isPrime(2) -> True
		// bizarre isPrime(45) -> False
		// extreme isPrime(0) -> False
		
	}
	
	public static int greatestCommonFactor(int m, int n)
	
	{
		   // this is the Euclidean method that i've learned in algorithms
		   // if the second value is 0, then the greatest common factor is the first value
		   if ( n == 0 ) 
		   
		   {
			   
			   return m;
			   
		   }
		   
		   if ( n < 0 || m < 0)
			   
		   {
			   // basically if n & m are both less than 0, then we don't want to check if there is a GCF
			   throw new RuntimeException("Inputs cannot be negative!");
			   
		   }
		   
		   // else return m % n
		   return greatestCommonFactor(n, m % n);
		   
			// straightforward greatestCommonFactor(10, 15) -> 5
			// bizarre greatestCommonFactor(10, 0) -> 10
			// extreme greatestCommonFactor(-32, 256) -> nuclear broccoli
			
	}
	
	public static int getGreatestConstrainedMultiple(int k, int maximum)
	
	{
		
		int outP = maximum / k;
		
		// return that value multiplied by k to get the greatest value within the max range
		return outP * k;
		
		// straightforward getGreatestConstrainedMultiple(10, 789) -> 780
		// bizarre getGreatestConstrainedMultiple(0, 0) -> 0
		// extreme getGreatestConstrainedMultiple(MIN_VALUE, MAX_VALUE) -> nuclear broccoli
		
	}
	
	public static int getIntegerH(int h_q_3, int h_r_5)
	
	{
		
		throw new RuntimeException("Not yet implemented!");
		
	}
	
	public static int getMaximum(Set<Integer> integerSet)
	
	{
		
		// converting our integerSet to an array.
		Object[] integerArray = integerSet.toArray();
		
		// setting our maxVal to first position in array.
		int maxVal = (int) integerArray[0];
		
		for (int i = 1; i < integerArray.length; i++)
			
		{
			// if the next position in the array is greater than the first position, it's now equal to the maximum value.
			if ((int) integerArray[i] > maxVal)
				
			{
				
				maxVal = (int) integerArray[i];
				
			}
			
		}
		
		// once done iterating and checking, return our max value.
		return maxVal;
		
		// straightforward getMaximum({2, 4, 6, 8, 10}) -> 10
		// bizarre getMaximum({-2, -3, -4, -1}) -> -1
		// extreme getMaximum({10}) -> 10
		
	}
	
	public static int getMinimum(int[] intArray)
	
	{
		// minVal is the first position in Array
		int minVal = intArray[0];

		// we set i == 1 so we can compare minVal and intArray of i
		for (int i = 1; i < intArray.length; i++)
			
		{
			
			if (intArray[i] < minVal)
			
			{
				// compares and if conditions is met, sets minVal = to new minVal of array
				minVal = intArray[i];
				
			} 
			
		}
		
		// once loop iterates thru it all, return minVal
		return minVal;
		
		// straightforward getMinimum({2, 4, 6, 8, 10}) -> 2
		// bizarre getMinimum({-2, -2, -1, -2}) -> -2
		// extreme getMinimum({10}) -> 10
		
	}
	
	public static boolean isSorted(int[] intArray)
	
	{
				
		for (int i = 0; i < intArray.length - 1; i++)
			
		{
			
			// if intArray[0++] is less than intArray[1 + next position]
			if (intArray[i] > intArray[i + 1])
				
			{
				// then intArray is not sorted
				return false;
				
			}
			
		}
		
		// if the conditional statement never executes, then the array must be sorted!
		return true;
		
		// straightforward isSorted({2, 4, 6, 8, 10}) -> True
		// bizarre isSorted({-2, -2, -1, -2}) -> False
		// extreme isSorted({7}) -> True
		
	}
	
	public static int getSmallestIndexOfMatch(int[] intArray, int target)
	
	{
		
		// if target isn't found
		final int notFound = -1;
		
		for (int i = 0; i < intArray.length; i++)
		
		{
			// if i == target number, return the index position of intArray
			if ( intArray[i] == target)
			
			{
				
				return i;
			
			}
			
		}
		
		// else we return our notFound variable
		return notFound;
		
		// straightforward getSmallestIndexOfMatch({2, 4, 6, 8, 10) -> True
		// bizarre getSmallestIndexOfMatch({-2, -2, -1, -2}) -> False
		// extreme getSmallestIndexOfMatch({7}) -> True
		
	}
	
	public static int reverse(int k)
	
	{
		
		// convert our input integer to a string
		String valueOfK = String.valueOf(k);
		
		// split the string representation into a string array
		String[] intsInStringList = valueOfK.split("");
		
		// create a new list that will hold our values that have the length of the first list
		// our new list's length needs to equal our old lists length
		String[] reversedList = new String[intsInStringList.length];
		
		
		// iterating over the length of our value in the list, i > 0, and i decrements the length
		for (int i = intsInStringList.length; i > 0; i--)
			
		{
			
			// our new list has the first position of the last value, and as i decrements,
			// we get our new list filled with our values backwards i.e. [1,2,3,4] = [4,3,2,1]
			reversedList[intsInStringList.length - i] = intsInStringList[i - 1];
			
		}
		
		// join our values as a string from the list so now we have "4321"
		String valueReversed = String.join("",reversedList);
		
		// parsing our string as an integer and returning it
		
		int reversedInt = Integer.parseInt(valueReversed);
		
		return reversedInt;
		
		// straightforward reverse(123) -> 321
		// bizarre reverse(999999) -> 999999
		// extreme reverse(MAX_VALUE) -> nuclear broccoli
	
	}
		
	public static int sumthing(long k) 
	
	{
		
		// converts long type into string, put it in a string array, and checks if
		// the length of the array is less than one (if it's a single digit) and returns
		// the single digit
		
		String valueOfK = String.valueOf(k);
		
		String[] kIntoStringList = valueOfK.split("");
		
		if (kIntoStringList.length < 1)
		
		{
			
			String singleDigit = String.join("",kIntoStringList);
			
			int ifIsSingleDigit = Integer.parseInt(singleDigit);
			
			return ifIsSingleDigit;
			
		}
		
		if (k < 0)
			
		{
			
			throw new RuntimeException("Please do not enter a negative number");
			
		}
		
		// we take a new list with the length of the original,
		// and parse each string into the new list as an integer, so our new list is an
		// array of integers from the parameters
		
		int[] lengthOfStringList = new int[kIntoStringList.length];
		
		for (int i = 0; i < kIntoStringList.length; i++)
		
		{
			// puts each string number into our new list as an integer type
			lengthOfStringList[i] = Integer.parseInt(kIntoStringList[i]);
			
		}
		
		// create sum to hold our values we are adding together, 
		// and return the value if it's total sum is less than 10.
		// if it's greater, we recursively call our method to perform the same process until
		// the conditional logic never executes and we only return sum.
		
		int sum = 0;
		
		for (int i = 0; i < lengthOfStringList.length; i++)
			
		{
			
			sum += lengthOfStringList[i];
		
		}
		
		if (sum > 9)
			
		{
			
			return sumthing(sum);
			
		}
		
		return sum;
		
		// straightforward sumthing(123) -> 6
		// bizarre sumthing(999999) -> 9
		// extreme sumthing(MAX_VALUE) -> 1
		
	}

}
