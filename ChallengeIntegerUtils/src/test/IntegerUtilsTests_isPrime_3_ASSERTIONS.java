package test;

import utils.IntegerUtils_Dove;

public class IntegerUtilsTests_isPrime_3_ASSERTIONS
{
	private static void test_isPrime()
	{
		int input = -3;
		boolean expectedRV = false;	//Expected Return Value
		boolean actualRV = IntegerUtils_Dove.isPrime(input);	//Actual Return Value
		String failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assert actualRV == expectedRV : failureMessage;
		
		input = 1;
		expectedRV = false;
		actualRV = IntegerUtils_Dove.isPrime(input);
		failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assert actualRV == expectedRV : failureMessage;
		
		input = 5;
		expectedRV = true;
		actualRV = IntegerUtils_Dove.isPrime(input);
		failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assert actualRV == expectedRV : failureMessage;
	
		assert false : "Passed all tests (with assertions on)!";
		System.out.println("You do not have assertions enabled in your Run Configuration!");
	}
	
	public static void main(String[] args)
	{
		test_isPrime();
	}
}
