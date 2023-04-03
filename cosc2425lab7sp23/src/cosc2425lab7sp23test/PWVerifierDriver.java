package cosc2425lab7sp23test;

import cosc2425lab7sp23.PasswordVerifier;

public class PWVerifierDriver {

	public static void main(String[] args) {

		// Testing Short PW
		// setup
		String shortPW = "Abcde5#";
		// execute
		boolean shortActual = PasswordVerifier.isValid(shortPW);

		// print
		if (shortActual == false)
			System.out.println("Testing short password returned: " + shortActual + " ,provided password not valid, "
					+ "Method passed");
		else
			System.out.println("Testing short password returned: " + shortActual + " ,provided password should not be valid, "
					+ "Method failed");

		// Testing Long PW
		// setup
		String longPW = "Abcdefghijklmnp5#abcde";
		// execute
		boolean longActual = PasswordVerifier.isValid(longPW);

		// print
		if (longActual == false)
			System.out.println("Testing long password returned: " + longActual + " ,provided password not valid, "
					+ "Method passed");
		else
			System.out.println("Testing long password returned: " + longActual + " ,provided password should not be valid, "
					+ "Method failed");

		// Testing Empty PW
		// setup
		String emptyPW = "";
		// execute
		boolean emptyActual = PasswordVerifier.isValid(emptyPW);

		// print
		if (longActual == false)
			System.out.println("Testing empty password returned: " + emptyActual + " ,provided password not valid, "
					+ "Method passed");
		else
			System.out.println("Testing empty password returned: " + emptyActual + " ,provided password should not be valid, "
					+ "Method failed");

		// Testing Missing Number PW
		// setup
		String missingNumberPW = "Abcdefghijklmnp#";
		// execute
		boolean missingNumberActual = PasswordVerifier.isValid(missingNumberPW);

		// print
		if (missingNumberActual == false)
			System.out.println("Testing Missing Number password returned: " + missingNumberActual
					+ " ,provided password not valid, " + "Method passed");
		else
			System.out.println("Testing Missing Number password returned: " + missingNumberActual
					+ " ,provided password should not be valid, " + "Method failed");

		// Testing Missing Upper Case Letter PW
		// setup
		String missingUpperCaseLetterPW = "abcdefghijklmnp5#";
		// execute
		boolean missingUpperCaseLetterActual = PasswordVerifier.isValid(missingUpperCaseLetterPW);

		// print
		if (missingUpperCaseLetterActual == false)
			System.out.println("Testing Missing Upper Case Letter password returned: " + missingUpperCaseLetterActual
					+ " ,provided password not valid, " + "Method passed");
		else
			System.out.println("Testing Missing Upper Case Letter password returned: " + missingUpperCaseLetterActual
					+ " ,provided password should not valid, " + "Method failed");

		// Testing Missing Lower Case Letter PW
		// setup
		String missingLowerCaseLetterPW = "ABCDEFGHIJKLMNP5#";
		// execute
		boolean missingLowerCaseLetterActual = PasswordVerifier.isValid(missingLowerCaseLetterPW);

		// print
		if (missingLowerCaseLetterActual == false)
			System.out.println("Testing Missing Lower Case Letter password returned: " + missingLowerCaseLetterActual
					+ " ,provided password not valid, " + "Method passed");
		else
			System.out.println("Testing Missing Lower Case Letter password returned: " + missingLowerCaseLetterActual
					+ " ,provided password should not valid, " + "Method failed");

		// Symbol
		// Testing Missing Symbol PW
		// setup
		String missingSymbolPW = "aBCDEFGHIJKLMNP5";
		// execute
		boolean missingSymbolActual = PasswordVerifier.isValid(missingSymbolPW);

		// print
		if (missingSymbolActual == false)
			System.out.println("Testing Missing Symbol password returned: " + missingSymbolActual
					+ " ,provided password not valid, " + "Method passed");
		else
			System.out.println("Testing Missing Symbol password returned: " + missingSymbolActual
					+ " ,provided password should not valid, " + "Method failed");

		// Testing valid PW
		// setup
		String validPW = "aBCDEFGHIJKLMNP5#";
		// execute
		boolean actualPW = PasswordVerifier.isValid(validPW);

		// print
		if (actualPW == true)
			System.out.println("Testing Valid password returned: " + actualPW + " ,provided password valid, "
					+ "Method passed");
		else
			System.out.println("Testing Valid password returned: " + actualPW + " ,provided password not valid, "
					+ "Method failed");

	}

}
