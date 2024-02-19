package test;

import org.junit.Test;
import static org.junit.Assert.*;

import encryption.VigenereCipher_Dove;

public class helperMethodTests 

{
	
	///////////////// TESTING getPosInMatrixEntry
	
	@Test
	public void testingGetPosInMatrixEntry() 
	
	{
		
		assertEquals(0, VigenereCipher_Dove.getPosInMatrixEntry('A')  );
	
	}
	
	@Test
	public void testingGetPosInMatrixEntry2() 
	
	{
		
		assertEquals(25, VigenereCipher_Dove.getPosInMatrixEntry('Z') );
	
	}	
	
	@Test
	public void testingGetPosInMatrixEntry3() 
	
	{	
	
		assertEquals(1, VigenereCipher_Dove.getPosInMatrixEntry('B') );
	
	}
	
	
	
	///////////////// TESTING getPosInMatrixRow
	
	@Test
	public void testingGetPosInMatrixRow() 
	
	{
	
		assertEquals(0, VigenereCipher_Dove.getPosInMatrixRow('a')  );
	
	}
	
	@Test
	public void testingGetPosInMatrixRow2() 
	
	{
	
		assertEquals(25, VigenereCipher_Dove.getPosInMatrixRow('z') );
	
	}
	
	@Test
	public void testingGetPosInMatrixRow3() 
	
	{
	
		assertEquals(1, VigenereCipher_Dove.getPosInMatrixRow('b') );
	
	}
	
	
	
	///////////////// TESTING getColumn
	
	@Test
	public void testingGetColumn() 

	{
	
		assertEquals('z', VigenereCipher_Dove.getColumn('b', 'A') );
	
	}
	
	@Test
	public void testingGetColumn2() 
	
	{
	
		assertEquals('z', VigenereCipher_Dove.getColumn('z', 'Y') );
	
	}
	
	@Test
	public void testingGetColumn3() 
	
	{
	
		assertEquals('l', VigenereCipher_Dove.getColumn('l', 'W') );
	
	}
	
	@Test
	public void testingGetColumn4() 
	
	{
	
		assertEquals('a', VigenereCipher_Dove.getColumn('a', 'A') );
	
	}

	@Test
	public void testingGetColumn5() 
	
	{
	
		assertEquals('a', VigenereCipher_Dove.getColumn('a', 'A') );
	
	}
	
	
	
	///////////////// TESTING MAIN ENCRYPTION AND DECRYPTION
	
	@Test(timeout=3000)
	public void cryptoagainEncryptionTest()
	
	{
		
		String key = "diehard";
		String encryptedMessage = "eqgfcch".toUpperCase();
		String plainText = "bicycle";
	

		String actual = VigenereCipher_Dove.encrypt(plainText, key);
		String testFailureMessage = "Expected = \"" + encryptedMessage.toUpperCase() + "\" Actual = \"" + actual + "\"";
		assertEquals(testFailureMessage, encryptedMessage.toUpperCase(), actual);
	
	}
	
	@Test(timeout=3000)
	public void carEncryptionTest()
	
	{
		
		String key = "diehard";
		String encryptedMessage = "fiv".toUpperCase();
		String plainText = "car";
	

		String actual = VigenereCipher_Dove.encrypt(plainText, key);
		String testFailureMessage = "Expected = \"" + encryptedMessage.toUpperCase() + "\" Actual = \"" + actual + "\"";
		assertEquals(testFailureMessage, encryptedMessage.toUpperCase(), actual);
	
	}
	
	@Test(timeout=3000)
	public void carDecryptionTest()
	{
		
		String key = "diehard";
		String plainText = "car";
		String encryptedMessage = "fiv".toUpperCase();
		
	
		String actual = VigenereCipher_Dove.decrypt(encryptedMessage, key);
		String testFailureMessage = "Expected = \"" + plainText + "\" Actual = \"" + actual + "\"";
		assertEquals(testFailureMessage, plainText, actual);
		
	}
	
	@Test(timeout=3000)
	public void carEncryptionTest3()
	
	{
		
		String key = "chaos";
		String encryptedMessage = "";
		String plainText = "";
	

		String actual = VigenereCipher_Dove.encrypt(plainText, key);
		String testFailureMessage = "Expected = \"" + encryptedMessage + "\" Actual = \"" + actual + "\"";
		assertEquals(testFailureMessage, encryptedMessage, actual);
	
	}
		
}
