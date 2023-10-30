package utils;

import java.util.Set;

public class tester {
	
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
		// bizzare isEven(-2) -> False
		// extreme isEven(0) -> True
	}
	
	public static boolean isOdd(int k)
	
	{
		// if k divided by 2 has a remainder of 1, then it's odd.
		if ( k % 2 == 1 )
		
		{
			
			return true;
		
		}
		
		else
		
		{
			
			return false;
		
		}
		
		// straightforward isOdd(2) -> False
		// bizzare isOdd(-3) -> True
		// extreme isOdd(0) -> False
		
	}
	
	public static int getGreatestConstrainedMultiple(int k, int maximum)
	
	{
		
		int outP = maximum / k;
		
		return outP * k;
		
	}
	
	public static int greatestCommonFactor(int m, int n)
	
	{
			// this is the Euclidian method that i've learned in algorithms.
			// if the second value is 0, then the greatest common factor is the first value.
		   if ( n == 0 ) 
		   
		   {
			   
			   return m;
			   
		   }
		   
		   if ( n < 0 || m < 0)
			   
		   {
			   
			   throw new RuntimeException("Inputs cannot be negativ!");
			   
		   }
		   
		   // else return m % n
		   return greatestCommonFactor(n, m % n);
		   
			// straightforward greatestCommonFactor(10, 15) -> 5
			// bizzare greatestCommonFactor(10, 0) -> 10
			// extreme greatestCommonFactor(-32, 256) -> 
			
	}
	
	public static boolean isPrime(int k)
	
	{
		if( k <= 1 )
        
		{
            
			return false;
            
		}
		
		for( int i = 2; i < k ; i++)
      	
		{
		
			   
			if( k % i  == 0 )
			
			{
				
				return false;
				
			}
               
        	   
      	
		}
       
		return true;
		
	}
	
	public static int reverse(int k)
	
	{
		
		k = Math.abs(k);
		
		String valueOfK = String.valueOf(k);
		
		String[] intsInStringList = valueOfK.split("");
		
		String[] reversedList = new String[intsInStringList.length];
		
		for (int i = intsInStringList.length; i > 0; i--)
			
		{
			
			reversedList[intsInStringList.length - i] = intsInStringList[i-1];
			
		}
		
		
		
		
		String valueReversed = String.join("", reversedList);
		
		int value = Integer.parseInt(valueReversed);
		
		return value;
		

		
	
	}
	
	public static boolean isSorted(int[] intArray)
	
	{
		
		// second position of intArray
		
		
		for (int i = 0; i < intArray.length - 1; i++)
			
		{
			
			// if intArray[0++] is less than intArray[1]
			if (intArray[i] > intArray[i + 1])
				
			{
				// then intArray is not sorted
				return false;
				
			}
			
			
		}
		
		// if the conditional statement never executes, then the array must be sorted!
		return true;
		
		
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
		// bizarre getMaximum({-2, -2, -1, -2}) -> -1
		// extreme getMaximum({10}) -> 10
		
	}
	
	public static int getMinimum(int[] intArray)
	
	{
		// minVal is the first pos in Array
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
		
	}
	
	public static int getSmallestIndexOfMatch(int[] intArray, int target)
	
	{
		final int notFound = -1;
		
		for (int i = 0; i < intArray.length; i++)
		
		{
			
			if ( intArray[i] == target)
			
			{
			
				return i;
			
			}
			
			
		}
		
		return notFound;
		
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
			
			return Integer.parseInt(singleDigit);
			
		}
		
		if (k < 0)
			
		{
			
			throw new RuntimeException("Please do not enter a negative number");
			
		}
		
		
///////////////////////////////////////////////////////////////////////
		
		// we take a new list with the length of the original,
		// and parse each string into the new list as an integer, so our new list is an
		// array of integers from the parameters
		
		int[] lengthOfStringList = new int[kIntoStringList.length];
		
		for (int i = 0; i < kIntoStringList.length; i++)
		
		{
			// puts each string number into our new list as an integer type
			lengthOfStringList[i] = Integer.parseInt(kIntoStringList[i]);
			
		}
		
		
///////////////////////////////////////////////////////////////////////
		
		// create sum to hold our values we are adding together, 
		// and return the value if it's total sum is less than 9.
		// if it's greater, we recursively call our method to perform the same process until
		// the conditional logic never executes and we only return a single digit sum.
		
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
		
	}
	
	
	public static void main(String args[]) {
		
		int[] myArray = new int[] {2, 2, 2, 3, 10};
		
		Set<Integer> intSet = Set.<Integer>of(10);
		
		int MAX_VALUE = 2147483647;
		
		System.out.println(isEven(-2));
		System.out.println(isOdd(-3));
		System.out.println(getGreatestConstrainedMultiple(3, 100));
		System.out.println(greatestCommonFactor(32, 256));
		System.out.println(isPrime(5));
		System.out.println(reverse(123));
		System.out.println(isSorted(myArray));
		System.out.println(getMinimum(myArray));
		System.out.println(getSmallestIndexOfMatch(myArray, 2));
		System.out.println(sumthing(123));
		System.out.println(getMaximum(intSet));
		
		
	}

}
