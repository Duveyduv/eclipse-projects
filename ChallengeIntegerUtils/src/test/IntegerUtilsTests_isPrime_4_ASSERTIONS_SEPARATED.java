package test;

import utils.IntegerUtils_Dove;

public class IntegerUtilsTests_isPrime_4_ASSERTIONS_SEPARATED
{
	private static void test_isPrime(int input, boolean expectedRV)
	{
		boolean actualRV = IntegerUtils_Dove.isPrime(input);	//Actual Return Value
		String failureMessage = "Expected IU.isPrime(" + input +")" + " " +
									"to be " + expectedRV + ", " +
									"instead, it was " +
									actualRV;
		String successMessage = "IU.isPrime(" + input + ")" + " = " + 
									actualRV + ", as expected";
		assert actualRV == expectedRV : failureMessage;
		System.out.println(successMessage);
	}
	
	private static void test_isPrime_Neg3()
	{
		test_isPrime(-3, false);
	}

	private static void test_isPrime_1()
	{
		test_isPrime(1, false);
	}

	private static void test_isPrime_5()
	{
		test_isPrime(5, true);
	}
	
	public static void main(String[] args)
	{
		int failureCount = 0;
		int testCount = 0;
		try {
			testCount++;
			test_isPrime_Neg3();
		}catch(Throwable throwable)
		{
			failureCount++;
			System.out.println(throwable.getMessage());
		}
		try {
			testCount++;
			test_isPrime_1();
		}catch(Throwable throwable)
		{
			failureCount++;
			System.out.println(throwable.getMessage());
		}
		try {
			testCount++;
			test_isPrime_5();
		}catch(Throwable throwable)
		{
			failureCount++;
			System.out.println(throwable.getMessage());
		}
		try {
			assert false;
			System.out.println("You do not have assertions enabled in your Run Configuration!");
		}catch(AssertionError ae)
		{
			if(failureCount == 0)
				System.out.println("ALL TESTS PASSED! : testCount = " + testCount);
			else
				System.out.println("TESTS FAILED = " + failureCount + " out of " + testCount);
		}
	}
}
