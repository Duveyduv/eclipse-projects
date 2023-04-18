package cosc2425lab10sp23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaces 

{
	
	
	// Field of String list
	public List<String> list = new ArrayList<>();
	
	
	
	// Constructor adding our strings
	public FunctionalInterfaces() 
	
	{
	
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
		list.add("fig");
		
	}
	
	
	// filterStrings method that filters upon our list.
	public List<String> filterStrings(Predicate<String> filterD)
	
	{
		
		List<String> filteredList = new ArrayList<>();
		
		
		for ( String stringWord : list )
			
		{
			
			if ( filterD.test(stringWord) )
				
			{
				
				filteredList.add(stringWord);
				
			}
			
		}
		
		return filteredList;
		
	}
	
	// converts each string to uppercase.
	public List<String> convertToUpperCase(Function<String, String> convertD)
	
	{
		
		List<String> convertedList = new ArrayList<>();
		
		for ( String stringWord : list)
			
		{
			
			stringWord.toUpperCase();
			convertedList.add(convertD.apply(stringWord));
			
		}
		
		return convertedList;
		
	}
	
	// returns a random string.
	public String getRandomString(Supplier<String> supplieD)
	
	{
		
		return supplieD.get();
		
		
	}
	
	// prints all strings.
	public void printStrings(Consumer<String> consumeD)
	
	{
		
		for (String stringWord : list)
			
		{
			
			consumeD.accept(stringWord);
			
		}
		
		
			
	}

}
