package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.IntegerUtils_Dove;

public class IntegerUtilsTests_isPrime_6_JUNIT
{
	@Test
	private static void test_isPrime()
	{
		int input = -3;
		boolean expectedRV = false;	//Expected Return Value
		boolean actualRV = IntegerUtils_Dove.isPrime(input);	//Actual Return Value
		String failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assertEquals(failureMessage, expectedRV, actualRV);
		
		input = 1;
		expectedRV = false;
		failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assertEquals(failureMessage, expectedRV, actualRV);
		
		input = 5;
		expectedRV = true;
		failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assertEquals(failureMessage, expectedRV, actualRV);
	}
	
	//NOTICE THE LACK OF main() method
}
