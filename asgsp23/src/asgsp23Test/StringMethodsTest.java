package asgsp23Test;

import org.junit.jupiter.api.Test;

import asgsp23.StringMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringMethodsTest 

{
	
	//Each Test tests for the required methods in the main class.
	
    @Test
    public void testVowels() 
    
    {
        // three objects for each input string
    	StringMethods stringMethods1 = new StringMethods("OMG, this party is lit!!");
    	StringMethods stringMethods2 = new StringMethods("Slayyy, that outfit is fire!");
    	StringMethods stringMethods3 = new StringMethods("IDK, I'm feeling kinda sus.");
    	assertEquals(5, stringMethods1.numVowels());
    	assertEquals(8, stringMethods2.numVowels());
    	assertEquals(8, stringMethods3.numVowels());
    
    }

    @Test
    public void testConsonants() 
    
    {
        
    	StringMethods stringMethods1 = new StringMethods("OMG, this party is lit!!");
    	StringMethods stringMethods2 = new StringMethods("Slayyy, that outfit is fire!");
    	StringMethods stringMethods3 = new StringMethods("IDK, I'm feeling kinda sus.");
    	assertEquals(12, stringMethods1.numConsonants());
    	assertEquals(14, stringMethods2.numConsonants());
    	assertEquals(12, stringMethods3.numConsonants());
        
    
    }

    @Test
    public void testVowelsAndConsonants() 
    
    {
        
    	StringMethods stringMethods1 = new StringMethods("OMG, this party is lit!!");
    	StringMethods stringMethods2 = new StringMethods("Slayyy, that outfit is fire!");
    	StringMethods stringMethods3 = new StringMethods("IDK, I'm feeling kinda sus.");
    	assertEquals(5, stringMethods1.numVowels());
    	assertEquals(8, stringMethods2.numVowels());
    	assertEquals(8, stringMethods3.numVowels());
    	
    	assertEquals(12, stringMethods1.numConsonants());
    	assertEquals(14, stringMethods2.numConsonants());
    	assertEquals(12, stringMethods3.numConsonants());
    
    }

    @Test
    public void testWhiteSpaces() 
    
    {
        
    	StringMethods stringMethods1 = new StringMethods("OMG, this party is lit!!");
    	StringMethods stringMethods2 = new StringMethods("Slayyy, that outfit is fire!");
    	StringMethods stringMethods3 = new StringMethods("IDK, I'm feeling kinda sus.");
   
        assertEquals(4, stringMethods1.numWhiteSpaces());
        assertEquals(4, stringMethods2.numWhiteSpaces());
        assertEquals(4, stringMethods3.numWhiteSpaces());
    
    }

    @Test
    public void testSymbols() 
    
    {
       
    	StringMethods stringMethods1 = new StringMethods("OMG, this party is lit!!");
    	StringMethods stringMethods2 = new StringMethods("Slayyy, that outfit is fire!");
    	StringMethods stringMethods3 = new StringMethods("IDK, I'm feeling kinda sus.");
        
    	assertEquals(3, stringMethods1.numSymbols());
    	assertEquals(2, stringMethods2.numSymbols());
    	assertEquals(3, stringMethods3.numSymbols());
    
    }

    @Test
    public void testReverseString() 
    
    {
        
    	assertEquals("!!til si ytrap siht ,GMO", StringMethods.reverseString("OMG, this party is lit!!"));
    	assertEquals("!erif si tiftuo taht ,yyyalS", StringMethods.reverseString("Slayyy, that outfit is fire!"));
    	assertEquals(".sus adnik gnileef m'I ,KDI", StringMethods.reverseString("IDK, I'm feeling kinda sus."));
    
    }

}
