package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.IntegerUtils_Dove;

public class IntegerUtilsTests_isPrime_5_JUNIT_SEPARATED
{
	@Test
	private static void test_isPrime_Negative_3()
	{
		int input = -3;
		boolean expectedRV = false;	//Expected Return Value
		boolean actualRV = IntegerUtils_Dove.isPrime(input);	//Actual Return Value
		String failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assertEquals(failureMessage, expectedRV, actualRV);
	}

	@Test
	private static void test_isPrime_1()
	{
		int input = 1;
		boolean expectedRV = false;	//Expected Return Value
		boolean actualRV = IntegerUtils_Dove.isPrime(input);	//Actual Return Value
		String failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assertEquals(failureMessage, expectedRV, actualRV);
	}

	@Test
	private static void test_isPrime_5()
	{
		int input = 5;
		boolean expectedRV = true;	//Expected Return Value
		boolean actualRV = IntegerUtils_Dove.isPrime(input);	//Actual Return Value
		String failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		assertEquals(failureMessage, expectedRV, actualRV);
	}
}
