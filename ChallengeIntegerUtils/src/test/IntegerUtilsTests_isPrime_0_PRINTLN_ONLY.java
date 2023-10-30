package test;

import utils.IntegerUtils_Dove;

public class IntegerUtilsTests_isPrime_0_PRINTLN_ONLY
{
	private static void test_isPrime()
	{
		System.out.println(IntegerUtils_Dove.isPrime(-3));
		System.out.println(IntegerUtils_Dove.isPrime(1));
		System.out.println(IntegerUtils_Dove.isPrime(5));
	}
	
	public static void main(String[] args)
	{
		test_isPrime();
	}
}