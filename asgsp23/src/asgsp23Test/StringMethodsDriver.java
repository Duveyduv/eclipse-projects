package asgsp23Test;

import java.util.Scanner;
import asgsp23.StringMethods;

public class StringMethodsDriver 

{
    
	public static void main(String[] args) 
	
	{
        
		// creating a scanner and intializing a string
		Scanner scanner = new Scanner(System.in);
        
		String inputString;
		
		StringMethods stringMethod = null;
		
		boolean exitProgram = false;
		
		// while loop for our program.
		while (!exitProgram) 
		
		{
            
			System.out.println("\nEnter a string:\n");
            
			inputString = scanner.nextLine();
            
			stringMethod = new StringMethods(inputString);
			
				// menu and creating object of StringMethods that takes in input
				System.out.println("\nSelect an option:\n");
				System.out.println("1. Count the number of vowels in the string\n");
				System.out.println("2. Count the number of consonants in the string\n");
				System.out.println("3. Count both the vowels and consonants in the string\n");
				System.out.println("4. Count the number of white spaces in the string\n");
				System.out.println("5. Count the number of symbols in the string\n");
				System.out.println("6. Display its contents backward\n");
				System.out.println("7. Enter another string\n");
				System.out.println("8. Exit the program\n");
				
            
				int choice = scanner.nextInt();
            
				scanner.nextLine();
				
				// switch case for our options of the menu and checking each method of StringMethods
				switch (choice)
            
				{
            
					case 1:
                
						System.out.println("\nVowels: " + stringMethod.numVowels());
						break;
            
					case 2:
                
						System.out.println("\nConsonants: " + stringMethod.numConsonants());
						break;
            
					case 3:
                
						System.out.println("\nVowels: " + stringMethod.numVowels());
						System.out.println("Consonants: " + stringMethod.numConsonants());
						break;
            
					case 4:
                
						System.out.println("\nWhite Spaces: " + stringMethod.numWhiteSpaces());
						break;
            
					case 5:
                
						System.out.println("\nSymbols: " + stringMethod.numSymbols());
						break;
            
					case 6:
                
						System.out.println("\nThe string you entered was: " + inputString);
						System.out.println("\nThe string reversed is: " + StringMethods.reverseString(inputString));
						break;
            
					case 7:
						
						// this case allows us to break back to beginning of program for new input.
						break;
            
					case 8:
						
						// end program.
						System.out.println("\nProgram is now exiting...\n");
						scanner.close();
						System.exit(0);
						break;
          		
			}
				
		}
            	
    }
		
}	
		