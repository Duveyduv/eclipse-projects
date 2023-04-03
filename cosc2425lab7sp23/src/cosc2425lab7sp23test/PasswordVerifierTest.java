package cosc2425lab7sp23test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import cosc2425lab7sp23.PasswordVerifier;

class PasswordVerifierTest {

	@Test
	public void validatePassword_ShortPW() {
		// setup
		String shortPW = "Abcde5#";
		// execute
		boolean shortActual = PasswordVerifier.isValid(shortPW);
		// assert
		assertFalse("Testing Password if pw is to short", shortActual);

	}

	@Test
	public void validatePassword_longPW() {
		// setup
		String longPW = "Abcdefghijklmnp5#abcde";
		// execute
		boolean longActual = PasswordVerifier.isValid(longPW);
		// assert
		assertFalse("Testing Password less than twenty characters", longActual);
	}

	@Test
	public void validatePassword_EmptyPW() {
		// setup
		String emptyPW = "";

		// execute
		boolean emptyActual = PasswordVerifier.isValid(emptyPW);

		// assert
		assertFalse("Testing Password wont accept empty string", emptyActual);
	}

	@Test
	public void validatePassword_MissingNumber() {
		// setup
		String missingNumberPW = "Abcdefghijklmnp#";

		// execute
		boolean missingNumberActual = PasswordVerifier.isValid(missingNumberPW);

		// assert
		assertFalse("Testing Password missing a number", missingNumberActual);
	}

	@Test
	public void validatePassword_MissingUpperCaseLetter() {
		// setup
		String missingUpperCaseLetterPW = "abcdefghijklmnp5#";

		// execute
		boolean missingUpperCaseLetterActual = PasswordVerifier.isValid(missingUpperCaseLetterPW);

		// assert
		assertFalse("Testing Password missing an upper case", missingUpperCaseLetterActual);
	}

	@Test
	public void validatePassword_Missing_LowerCaseLetter() {
		// setup
		String missingLowerCaseLetterPW = "ABCDEFGHIJKLMNP5#";

		// execute
		boolean missingLowerCaseLetterActual = PasswordVerifier.isValid(missingLowerCaseLetterPW);

		// assert
		assertFalse("Testing Password missing a lower case", missingLowerCaseLetterActual);
	}

	@Test
	public void validatePassword_Missing_Symbol() {
		// setup
		String missingSymbolPW = "aBCDEFGHIJKLMNP5";

		// execute
		boolean missingSymbolActual = PasswordVerifier.isValid(missingSymbolPW);

		// assert
		assertFalse("Testing Password missing a symbol", missingSymbolActual);
	}

	@Test
	public void validatePassword_ValidPW() {
		// setup
		String validPW = "aBCDEFGHIJKLMNP5#";

		// execute
		boolean validActual = PasswordVerifier.isValid(validPW);

		// assert
		assertTrue("Testing a valid Password", validActual);
	}

}
