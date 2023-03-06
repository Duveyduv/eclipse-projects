package lab6sp23Test;

import lab6sp23.PropertyDetails;

public class Lab6Driver

{
	
	public static void main(String[] args) 
	
	{
		// instantiating the objects.
		PropertyDetails DATA1 = new PropertyDetails(78.7, 72.86, "RWA1");
		//PropertyDetails DATA2 = new PropertyDetails(78.7, 72.86, "RWA1");

		//PropertyDetails DATA2 = new PropertyDetails(59.8, 53.93, "RYT0");
		//PropertyDetails DATA2 = new PropertyDetails(78.7, 72.86, "RYT0");
		PropertyDetails DATA2 = new PropertyDetails(59.8, 53.93, "RWA1");

		
		System.out.println(DATA1 + "\n");
		
		System.out.println(DATA2);
		
		System.out.println("\nThe two properties are being compared." + "\n");
		
		// compares if the data equals the other's data.
		System.out.printf("DATA1 equals DATA2: " + (DATA1.equals(DATA2)));
				
		// compares dimensions of both objects and outputs if they're equivalent or not.
		if (DATA1.compDimens(DATA2))
			
		{
			
			System.out.println("The two properties have the same dimensions.");
			
		}
		
		else
			
			System.out.println("\nThe two properties do not have the same dimensions.");
	
	}

}
