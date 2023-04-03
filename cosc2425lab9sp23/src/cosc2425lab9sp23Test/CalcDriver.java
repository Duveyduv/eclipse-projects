// Lab-9 – COSC 2425-03 – Professor McCurry

//  Implemented by - Brandon Dove

package cosc2425lab9sp23Test;
import java.util.Scanner;
import cosc2425lab9sp23.Calculator;

public class CalcDriver 

{
	
	
	public static void main(String[] args) 
	
	
	{
		// Instantiation of Calculator and a Scanner object
		Calculator myCalc = new Calculator();
		Scanner input = new Scanner(System.in);
		
		
		// Variables
		float a = 0;
		float b = 0;
		int choice = 0;
		
		
		// Booleans
		boolean checkNumbers1 = false;
		boolean checkNumbers2 = false;
		
		
		// Main while loop 
		while(!checkNumbers1 || checkNumbers2)
			
		{
		
				// Checking if both values are valid.
				System.out.println("Enter first number: ");
				a = input.nextFloat();
				
				if (a < 0)
					
				{
					
					throw new ArithmeticException();
					
					
				}
				
				
				System.out.println("Enter second number: ");
				b = input.nextFloat();
				
				if (b < 0)
					
				{
					
					throw new ArithmeticException();
						
				}
					
					// Menu 
					System.out.println("\nSelect an option:");				
					System.out.println("1. Add two numbers");
					System.out.println("2. Subtract two numbers");
					System.out.println("3. Multiply two numbers");
					System.out.println("4. Divide two numbers");
					System.out.println("5. Check if two numbers are equal");
					System.out.println("6. Enter new numbers");
					System.out.println("7. Exit the program\n");
					
					
					choice = input.nextInt();
					
					
					// Switch cases with try and catches for exceptions.
					switch(choice)
					
					{
					
							case 1:
								
								try 
								
								{
									
									System.out.println("\n" + myCalc.add(a, b));
									break;
									
								}
								
								catch(ArithmeticException e)
								
								{
									
									System.out.println(e.getMessage());
										
								}
							
							case 2:
								
								try 
								
								{
									
									System.out.println("\n" + myCalc.subtract(a, b));
									break;
										
								}
								
								catch(ArithmeticException e)
								
								{
									
									System.out.println(e.getMessage());
										
								}
								
							case 3:
								
								try 
								
								{
									
									System.out.println("\n" + myCalc.multiply(a, b));
									break;
										
								}
								
								catch(ArithmeticException e)
								
								{
									
									System.out.println(e.getMessage());
										
								}
								
							case 4:
								
								try 
								
								{
									
									if (b == 0)
										
									{
										System.out.println("divide by zero is an error\n");
										throw new ArithmeticException();
										
									}
									
									
									System.out.println("\n" + myCalc.divide(a, b));
									break;
										
								}
								
								catch(ArithmeticException e)
								
								{
									
									break;
										
								}
							
							case 5:
								
								try 
								
								{
									
									System.out.println("\n" + myCalc.boolCheck(a, b));
									break;
									
										
								}
								
								catch(ArithmeticException e)
								
								{
									
									System.out.println(e.getMessage());
										
								}
								
							case 6:
								
								break;
								
							case 7:
								
								// Close program.
								System.exit(0);
								input.close();

								
						}
					
					}
				
				}
			
			}
