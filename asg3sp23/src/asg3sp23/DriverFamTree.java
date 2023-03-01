package asg3sp23;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverFamTree

{

	public static void main(String[] args)

	{	
		
		// Creating an ArrayList of Person objects

    	ArrayList<Person> peopleList = new ArrayList<Person>();
   
    	
        Scanner myScanner = new Scanner(System.in);
        
        
        /* Created a boolean so that we can run through a switch case tree
        *  so that we don't have to use a bunch of if-else statements.
        *  The boolean will be set to true once case 3 is selected.
        */
        
        boolean exitProgram = false;
        
        
        // Our while loop will allow the user to be prompted until they request to do so on case 3

        while (!exitProgram)

        {
        	
        	// Prompting user for options and scanning it as an integer input.
        	
            System.out.println("\nWhat would you like to do? \n");
            System.out.println("1. Create a new person");
            System.out.println("2. View information about a person");
            System.out.println("3. Exit program \n");

            int option = myScanner.nextInt();
            
            myScanner.nextLine();

            

            switch (option)

            {
            	case 1:


            		System.out.println("\nEnter a person's name: ");
            		String name = myScanner.nextLine();
            		System.out.println("Enter the mother's name: ");
            		String mother = myScanner.nextLine();
            		System.out.println("Enter the father's name: ");
            		String father = myScanner.nextLine();
            		
            		// Took the inputs and put them into a new instance of the Person object.

            		Person newPerson = new Person(name, mother, father);
            		peopleList.add(newPerson);
            		
            		
            		
            		
            		// Here is where I add the instantiation of newPerson into the ArrayList of Persons.
            		
            		
            		break;

            		

            	case 2:
            		
            		/* For the information case, I take in a string to input and compare it to the person's
            		 * name, and output all the desired information. I still cannot seem to
            		 * retrieve the children from this.
            		 */
            		
                	System.out.println("\nEnter a person's name: ");
                	
                	String searchFor = myScanner.nextLine();

                	for (Person i : peopleList)
                		
                	{

                		if (i.getName().equals(searchFor))

                		{
                			// if name equals input, output toString with name, mother, father, children.
                			
                			System.out.println(i.toString());
                				
                		}
       
                	}
                	
                	break;

                	
            
            	case 3:
            		
            		// End while loop and exit program.
            		
            		System.out.println("\nProgram is now exiting");
            		exitProgram = true;
            
            }     
           

        }
        
        myScanner.close();

	}


}