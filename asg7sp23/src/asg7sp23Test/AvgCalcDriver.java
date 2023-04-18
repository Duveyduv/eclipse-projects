package asg7sp23Test;

import java.util.ArrayList;
import java.util.Scanner;
import asg7sp23.AvgCalc;

public class AvgCalcDriver {
	
    public static void main(String[] args) 
    
    {
        // creating an array list to use, scanner for input, and a boolean to change when done with the program.
    	ArrayList<Double> values = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        
        while (!done) 
        
        {
            
        	try 
        	
        	{
                
        		// main message that asks user for input.
        		System.out.print("Enter one or more values separated by whitespace (or 'done' to calculate average): ");
                String input = scanner.nextLine();
                
                // checks if user enters "done" then while loops ends.
                if (input.equalsIgnoreCase("done")) 
                
                {
                    
                	done = true;
                	
                } 
                
                else 
                
                {
                    // this splits the input line so we can enter multiple numbers on one line.
                	String[] tokens = input.trim().split("\\s+");
                    
                	for (String token : tokens) 
                	
                	{
                        
                		// the for loop checks each value and verifies if it's within the ranges required.
                		double value = Double.parseDouble(token);
                        
                		if (value < 0 || value > 199) 
                		
                		{
                            
                			// if not throws exception.
                			throw new IllegalArgumentException("\nValue must be less than 200 and greater than 0.\n");
                        
                		}
                        
                		// else we add values.
                		values.add(value);
                    
                	}
                
                }
            
        	} 
        	
        	catch (NumberFormatException e) 
        	
        	{
                // exception for invalid inputs
        		System.out.println("\nInvalid input. Please enter a number.\n");
            
        	} 
        	
        	catch (IllegalArgumentException e) 
        	
        	{
                
        		System.out.println(e.getMessage());
            
        	}
        
        }
        
        if (values.size() < 2) 
        
        {
            
        	// if user only enters 1 value will ask user to 
        	System.out.println("\nAt least two values are required to calculate an average.\n");
            main(args); // restart the program
        
        scanner.close();
        
        } 
        
        else 
        
        {
            // creating array for AvgCalc
        	double[] array = new double[values.size()];
            
        	// get each value
        	for (int i = 0; i < values.size(); i++) 
        	
        	{
                
        		array[i] = values.get(i);
            
        	}
            
        	// store in AvgCalc
        	AvgCalc avgCalc = new AvgCalc(array);
            
        	try 
        	
        	{
                // average the numbers with the method
        		double average = avgCalc.avgNums();
                
        		System.out.println("\nAverage: " + average);
            
        	} 
        	
        	catch (Exception e) 
        	
        	{
                
        		System.out.println(e.getMessage());
            
        	}
        
        }
    
    }

}
