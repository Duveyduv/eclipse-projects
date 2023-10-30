package test;

import utils.IntegerUtils_Dove;

public class IntegerUtilsTests_isPrime_2_PRINTLN_ONLY_VERBOSE2
{	
	private static void test_isPrime()
	{
		int input = -3;
		boolean expectedRV = false;
		System.out.println("IU.isPrime(" + input +") = " +
							IntegerUtils_Dove.isPrime(input) + ": " +
							"should equal " + expectedRV);
		input = 1;
		expectedRV = false;
		System.out.println("IU.isPrime(" + input +") = " +
							IntegerUtils_Dove.isPrime(input) + ": " +
							"should equal " + expectedRV);
		input = 5;
		expectedRV = true;
		System.out.println("IU.isPrime(" + input +") = "
							+ IntegerUtils_Dove.isPrime(input) + ": " +
							"should equal " + expectedRV);
	}

	public static void main(String[] args)
	{
		test_isPrime();
	}
}
