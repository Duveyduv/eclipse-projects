package encryption;

import java.util.Arrays;
import java.util.List;

public interface VigenereCipher_Dove

{
	
	public final static List<Character> ENGLISH_LOWERCASE_LETTERS_LIST = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
	public final static List<Character> ENGLISH_UPPERCASE_LETTERS_LIST = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
	
	public static String encrypt(String[] plainMessage, String key)

	{
			
		String emptyString = "";
	    
		for (String i: plainMessage)
	        
			emptyString += i;
		
		// convert our array into a string.
				    
		char[] plainMessageCharArray = emptyString.toCharArray();
		
		// convert that string to a char array.
		
		char[] newArray = new char[plainMessageCharArray.length];
		
		// newArray has the length of our char array.
		
		int keyIndex = 0;
		
		// keyIndex to reset to the beginning once the length of the key is reached.
		
		for (char i = 0; i < plainMessageCharArray.length; i++)
			
		{
			
			if (key.length() <= 1)
				
			{
				// if the encrypted key is only 1 char.
				newArray[i] = VigenereCipher_Dove.getMatrixEntry(plainMessageCharArray[i], key.charAt(0));
				
			}
			
			else
			
			{
				
				char keyChar = key.charAt(keyIndex % key.length());
				newArray[i] = VigenereCipher_Dove.getMatrixEntry(plainMessageCharArray[i], keyChar);
				keyIndex++;
				
			}
				
		}
		
		String encryptedMessage = String.valueOf(newArray);
		
		return encryptedMessage;

	}

	public static String encrypt(String plainText, String key)

	{
				
		char[] plainMessageCharArray = plainText.toCharArray();

		char[] newArray = new char[plainMessageCharArray.length];
		
		int keyIndex = 0;
		
		for (char i = 0; i < plainMessageCharArray.length; i++)
			
			
		{
			
			if (key.length() <= 1)
				
			{
				
				newArray[i] = VigenereCipher_Dove.getMatrixEntry(plainMessageCharArray[i], key.charAt(0));
				
			}
			
			else
			
			{
				
				char keyChar = key.charAt(keyIndex % key.length());
				newArray[i] = VigenereCipher_Dove.getMatrixEntry(plainMessageCharArray[i], keyChar);
				keyIndex++;
				
			} 
			
		}
		
		String encryptedMessage = String.valueOf(newArray);
		
		return encryptedMessage;

	} 

	public static String decrypt(String[] encryptedMessage, String key)

	{
				
		String joined = String.join(" ", encryptedMessage);
		
		// convert string array into string WITH the spaces.
					
		char[] encryptedMessageCharArray = joined.toCharArray();
		
		// convert our string to a char array.
		
		char[] newArray = new char[joined.length()];
		
		// create a new array with the length of our encrypted message.
		
		int keyIndex = 0;
		
		// key index so we can reset our key to the beginning if we extend past the length.
	
	    for (int i = 0; i < newArray.length; i++) 
	    
	    {
	        
	    	if (key.length() <= 1) 
	    	
	    	{
	            // if the key is just one letter, then we execute this method call for our new array.
	    		newArray[i] = VigenereCipher_Dove.getColumn(key.charAt(0), encryptedMessageCharArray[i]);
	        
	    	} 
	    	
	    	else 
	    	
	    	{
	            // select our current char.
	    		char currentChar = encryptedMessageCharArray[i];
	            
	            if (currentChar == ' ') 
	            
	            {
	                // only if the string has an empty char we add it back into the new array.
	            	newArray[i] = ' ';
	            
	            } 
	            
	            else 
	            
	            {
	                
	            	// keyChar is each char incrementing, but once we reach the end we reset back to the beginning of the key.
	            	// so if the keyIndex is 4, and the key length is 4, keyChar becomes 0 again and we repeat throughout the array.
	            	char keyChar = key.charAt(keyIndex % key.length());
	                newArray[i] = VigenereCipher_Dove.getColumn(keyChar, currentChar);
	                keyIndex++;
	           
	            }
	        
	    	}
	    
	    }
	    
	    String decryptedMessage = String.valueOf(newArray);
		
		return decryptedMessage;

	}

	public static String decrypt(String encryptedText, String key)
	
	{

		char[] encryptedTextCharArray = encryptedText.toCharArray();

		char[] newArray = new char[encryptedTextCharArray.length];
		
		int keyIndex = 0;
		
	    for (int i = 0; i < newArray.length; i++) 
	    
	    {
	        
	    	if (key.length() <= 1) 
	    	
	    	{
	            
	    		newArray[i] = VigenereCipher_Dove.getColumn(key.charAt(0), encryptedTextCharArray[i]);
	        
	    	} 
	    	
	    	else 
	    	
	    	{
	            
	    		char currentChar = encryptedTextCharArray[i];
	            
	            if (currentChar == ' ') 
	            
	            {
	                
	            	newArray[i] = ' ';
	            
	            } 
	            
	            else 
	            
	            {
	                
	            	char keyChar = key.charAt(keyIndex % key.length());
	                newArray[i] = VigenereCipher_Dove.getColumn(keyChar, currentChar);
	                keyIndex++;
	            
	            }
	        
	    	}
	    
	    }
		
	    String decryptedMessage = String.valueOf(newArray);
		
	    return decryptedMessage;

	}

	
	
	
	
	
	
	//////////////////////  GETTERS AND HELPER METHODS //////////////////////
	
	
	
	
	
	
	
	public static char getMatrixEntry(char row, char column)

	{

		int matrix = ((getPosInMatrixRow(row) + getPosInMatrixCol(column)) % 26);
		
		if (matrix < 0)
			
		// by adding 26 if matrix is < 0, we will return the correct matrix entry.
			
		{
			
			matrix += 26;
			
		}
		
		
		return ENGLISH_UPPERCASE_LETTERS_LIST.get(matrix);

	}

	public static char getColumn(char row, char matrixEntry)

	{

		int column = (int) ((getPosInMatrixEntry(matrixEntry) - getPosInMatrixRow(row)));
		
		if (column < 0)
			
		// by adding 26 if column is < 0, we will return the correct column.
			
		{
			
			column += 26;
			
		}
		
		return ENGLISH_LOWERCASE_LETTERS_LIST.get(column);
		
	}
	
	/// HELPER METHODS ///
	
	public static int getPosInMatrixEntry(char matrixEntry)
	
	{
		
		return ENGLISH_UPPERCASE_LETTERS_LIST.indexOf(matrixEntry);
		
	}
	
	public static int getPosInMatrixCol(char col)
	
	{
		
		return ENGLISH_LOWERCASE_LETTERS_LIST.indexOf(col);
		
	}
	
	public static int getPosInMatrixRow(char row)
	
	{
		
		return ENGLISH_LOWERCASE_LETTERS_LIST.indexOf(row);
		
	}

}