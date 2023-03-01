package cosc242503lab4sp23;


public class ArrayExamples {
	
	// Checking length of array, returning index value, and each value in array

	public static void printArray(int[] array)
	
	{
		
		for (int i = 0; i < array.length; i++)
			
		{
			
			System.out.println("[" +i+ "]: " + array[i]);
			
			
		}
		
		
		
	}
	
	
	// Sets every index position = to 0 as it increments through it.
	
	public static void resetArray(int[] array)
	
	
	{
		
		for (int i = 0; i < array.length; i++)
			
			
		{
			
			array[i] = 0;
			
			
		}
		
		
		
	}
	
	
	// Total is set to 0, for each element in array, add it to total, then divide and return by length of array 


	public static float findAvgForLoop(int[] array)
	
	
	{
		
		float total = 0;
		
		
		for (int element : array) 
		
		
		{
			
			
			total += element;
			
			
			
		}
		
		return total / array.length;

		
		
	}
	
	
	// Adds value that is input into method to each value in their index positions
	
	public static void increaseByValue(int [] array, int value)
	
	
	{
		
		
		
		for (int i = 0; i < array.length; i++)
			
			
		{
			
			
			array[i] += value;
			
			
		}
		
		System.out.println(array);
		
		
	}
	
	/* Set a temp variable = to the first value in the list, the first value in the list is now equal to the second
	   Lastly, the second position is now set to the first.
	*/
	
	public static void swapArrayValues(int [] list, int loc1, int loc2)
	
	
	{
		
		
		int temp = 0;
		
		for (int i = 0; i < list.length; i++);
		
		
		{
			
			temp = list[loc1];
			
			list[loc1] = list[loc2];
			
			list[loc2] = temp;
			
			
			
		}
		
		System.out.println(list);
		
	}
	

}
