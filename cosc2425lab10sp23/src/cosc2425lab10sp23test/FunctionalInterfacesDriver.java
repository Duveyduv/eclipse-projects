package cosc2425lab10sp23test;

import java.util.function.*;
import java.util.random.*;

import cosc2425lab10sp23.FunctionalInterfaces;

public class FunctionalInterfacesDriver 

{
	
	public static void main(String[] args)
	
	{
		
		// instantiating our class.
		FunctionalInterfaces interFace = new FunctionalInterfaces();
		
		
		// Doing our functional requirements for our methods within our class.
		Predicate<String> isA = str -> str.contains("a");
		
		Function<String, String> convertEd = String::toUpperCase;
		
		Supplier<String> randomIze = () -> interFace.list.get((int) (Math.random() * interFace.list.size()));
		
		Consumer<String> printS = System.out::println;
		
		
		// Calling our methods and printing them.
		System.out.print(interFace.filterStrings(isA) + "\n");
		
		System.out.print(interFace.convertToUpperCase(convertEd) + "\n");
		
		System.out.print(interFace.getRandomString(randomIze) + "\n");
		
		interFace.printStrings(printS);
		
	}
	
}
