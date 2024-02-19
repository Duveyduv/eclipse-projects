package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import rationalnumbers.RationalNumber;
import rationalnumbers.RationalNumberImpl_Dove;
import rationalnumbers.RationalNumberUtils_Dove;

public class RationalNumberTestCases_Dove 

{
	
	@Test
	public void testConstructorAndGetValue() 
	
	{
	
		RationalNumber r1 = new RationalNumberImpl_Dove(5,25);
		System.out.print(r1.toString() + " " + r1.getValue());
		
	}
	
    @Test
    public void testEqual() 
    
    {
        RationalNumber r1 = new RationalNumberImpl_Dove(1, 2);
        RationalNumber r2 = new RationalNumberImpl_Dove(2, 4);
        assertTrue(RationalNumberUtils_Dove.equal(r1, r2));
    
    }

    @Test
    public void testAdd() 
    
    {
        
    	RationalNumber r1 = new RationalNumberImpl_Dove(1, 3);
        RationalNumber r2 = new RationalNumberImpl_Dove(2, 5);
        RationalNumber result = RationalNumberUtils_Dove.add(r1, r2);
        assertEquals(11, result.getNumerator());
        assertEquals(15, result.getDenominator());
        
    }

    @Test
    public void testSubtract() 
    
    {
    
    	RationalNumber r1 = new RationalNumberImpl_Dove(5, 7);
        RationalNumber r2 = new RationalNumberImpl_Dove(2, 3);
        RationalNumber result = RationalNumberUtils_Dove.subtract(r1, r2);
        assertEquals(1, result.getNumerator());
        assertEquals(21, result.getDenominator());
        
    }

    @Test
    public void testMultiply() 
    
    {
       
    	RationalNumber r1 = new RationalNumberImpl_Dove(3, 4);
        RationalNumber r2 = new RationalNumberImpl_Dove(2, 5);
        RationalNumber result = RationalNumberUtils_Dove.multiply(r1, r2);
        assertEquals(3, result.getNumerator());
        assertEquals(10, result.getDenominator());
        
    }

    @Test
    public void testDivide() 
    
    {
        
    	RationalNumber r1 = new RationalNumberImpl_Dove(5, 6);
        RationalNumber r2 = new RationalNumberImpl_Dove(2, 3);
        RationalNumber result = RationalNumberUtils_Dove.divide(r1, r2);
        assertEquals(5, result.getNumerator());
        assertEquals(4, result.getDenominator());
        
    }

    @Test
    public void testNegate() 
    
    {
        
    	RationalNumber r1 = new RationalNumberImpl_Dove(7, 8);
        RationalNumber result = RationalNumberUtils_Dove.negate(r1);
        assertEquals(-7, result.getNumerator());
        assertEquals(8, result.getDenominator());
        
    }
    
    @Test(expected=AssertionError.class)
    public void testDivisionByZero() 
    
    {
        
    	RationalNumber r1 = new RationalNumberImpl_Dove(5, 8);
        RationalNumber r2 = new RationalNumberImpl_Dove(0, 1);
        System.out.println(RationalNumberUtils_Dove.divide(r1, r2));
        
    }

    @Test(expected=AssertionError.class)
    public void testZeroDenominator() 
    
    {
        
    	RationalNumber r1 = new RationalNumberImpl_Dove(5, 0);
        RationalNumber r2 = new RationalNumberImpl_Dove(2, 3);
        System.out.print(RationalNumberUtils_Dove.divide(r1, r2));
        
    }
    
    @Test
    public void testNegationOfZero() 
    
    {
        
		int A = 0;
		int B = 1;
		
		
		RationalNumber expectedValue = new RationalNumberImpl_Dove(A,B);
		

		RationalNumber negatedValue = RationalNumberUtils_Dove.negate(expectedValue);
		
		boolean booleanActualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.equal(expectedValue, negatedValue);
		boolean expectEquals = true;
		
		assertEquals(expectEquals, booleanActualFirstValueEqualsSecondValue);
        
    }

    @Test
    public void testEqualRationalNumbers() 
    
    {
        
    	RationalNumber r1 = new RationalNumberImpl_Dove(3, 5);
        RationalNumber r2 = new RationalNumberImpl_Dove(6, 10);
        assertTrue(RationalNumberUtils_Dove.equal(r1, r2));
        
    }

    		
	@Test(timeout=3000)
	public void getNumerator()
	
	{
		
		//Fields
		RationalNumberImpl_Dove RNI;
		int actualRV;
		int expectedRV;
		
		//Test 1
		RNI = new RationalNumberImpl_Dove(10, 25);
		actualRV = RNI.getNumerator();
		expectedRV = 2;
		assertEquals("getNumerator_1 ->", expectedRV, actualRV);
		
		//Test 2
		RNI = new RationalNumberImpl_Dove(100, 25);
		actualRV = RNI.getNumerator();
		expectedRV = 4;
		assertEquals("getNumerator_2 ->", expectedRV, actualRV);
		
		//Test 3
		RNI = new RationalNumberImpl_Dove(-1, 25);
		actualRV = RNI.getNumerator();
		expectedRV = -1;
		assertEquals("getNumerator_3 ->", expectedRV, actualRV);
		
		//Test 4
		RNI = new RationalNumberImpl_Dove(0, 25);
		actualRV = RNI.getNumerator();
		expectedRV = 0;
		assertEquals("getNumerator_3 ->", expectedRV, actualRV);
	}
	
	
	@Test(timeout=3000)
	public void getDenominator()
	
	{
		
		//Fields
		RationalNumberImpl_Dove RNI;
		int actualRV;
		int expectedRV;
		
		//Test 1
		RNI = new RationalNumberImpl_Dove(10, 25);
		actualRV = RNI.getDenominator();
		expectedRV = 5;
		assertEquals("getDenominator_1 ->", expectedRV, actualRV);
		
		//Test 2
		RNI = new RationalNumberImpl_Dove(100, 25);
		actualRV = RNI.getDenominator();
		expectedRV = 1;
		assertEquals("getDenominator_2 ->", expectedRV, actualRV);
		
		//Test 3
		try {
			RNI = new RationalNumberImpl_Dove(25, -1);
			actualRV = RNI.getDenominator();
		} catch (AssertionError e) {System.out.println(e);} //Just to print error 
	
	}
	
	
	@Test(timeout=3000)
	public void getValue()
	
	{
		
		//Fields
		RationalNumberImpl_Dove RNI;
		Double actualRV;
		Double expectedRV;
		
		//Test 1
		RNI = new RationalNumberImpl_Dove(100, 25);
		actualRV = RNI.getValue();
		expectedRV = 4.0;
		assertEquals("getValue_1 ->", expectedRV, actualRV);
		
		//Test 2
		RNI = new RationalNumberImpl_Dove(10, 25);
		actualRV = RNI.getValue();
		expectedRV = 0.4;
		assertEquals("getValue_2 ->", expectedRV, actualRV);
	}
	
	
	RationalNumberImpl_Dove RNI_1 = new RationalNumberImpl_Dove(10, 25);
	RationalNumberImpl_Dove RNI_2 = new RationalNumberImpl_Dove(20, 25);
	RationalNumberImpl_Dove RNI_3 = new RationalNumberImpl_Dove(100, 25);
	RationalNumberImpl_Dove RNI_4 = new RationalNumberImpl_Dove(200, 25);
	RationalNumberImpl_Dove RNI_5 = new RationalNumberImpl_Dove(100, 250);
	RationalNumberImpl_Dove RNI_6 = new RationalNumberImpl_Dove(0, 250);
	

	@Test(timeout=3000)
	public void add()
	
	{
		
		//Fields
		String actualRV;
		String expectedRV;
		
		//Test 1
		actualRV = (RationalNumberUtils_Dove.add(RNI_1, RNI_2)).toString();
		expectedRV = "6/5";
		assertEquals("add_1 ->", expectedRV, actualRV);
		
		//Test 2
		actualRV = (RationalNumberUtils_Dove.add(RNI_3, RNI_4)).toString();
		expectedRV = "12/1";
		assertEquals("add_2 ->", expectedRV, actualRV);	
	}
	
	
	@Test(timeout=3000)
	public void subtract()
	
	{
		
		//Fields
		String actualRV;
		String expectedRV;
		
		//Test 1
		actualRV = (RationalNumberUtils_Dove.subtract(RNI_1, RNI_2)).toString();
		expectedRV = "-2/5";
		assertEquals("subtract_1 ->", expectedRV, actualRV);
		
		//Test 2
		actualRV = (RationalNumberUtils_Dove.subtract(RNI_3, RNI_4)).toString();
		expectedRV = "-4/1";
		assertEquals("subtract_2 ->", expectedRV, actualRV);	
	}
	
	
	@Test(timeout=3000)
	public void multiply()
	
	{
		
		//Fields
		String actualRV;
		String expectedRV;
		
		//Test 1
		actualRV = (RationalNumberUtils_Dove.multiply(RNI_1, RNI_2)).toString();
		expectedRV = "8/25";
		assertEquals("multiply_1 ->", expectedRV, actualRV);
		
		//Test 2
		actualRV = (RationalNumberUtils_Dove.multiply(RNI_3, RNI_4)).toString();
		expectedRV = "32/1";
		assertEquals("multiply_2 ->", expectedRV, actualRV);	
		
		//Test 3
		actualRV = (RationalNumberUtils_Dove.multiply(RNI_3, RNI_6)).toString();
		expectedRV = "0/1";
		assertEquals("multiply_3 ->", expectedRV, actualRV);	
	}
	
	
	@Test(timeout=3000)
	public void divide()
	
	{
		
		//Fields
		String actualRV;
		String expectedRV;
		
		//Test 1
		actualRV = (RationalNumberUtils_Dove.divide(RNI_1, RNI_2)).toString();
		expectedRV = "1/2";
		assertEquals("divide_1 ->", expectedRV, actualRV);
		
		//Test 2
		actualRV = (RationalNumberUtils_Dove.divide(RNI_3, RNI_4)).toString();
		expectedRV = "1/2";
		assertEquals("divide_2 ->", expectedRV, actualRV);	
	}
	
	
	@Test(timeout=3000)
	public void negate()
	
	{
		
		//Fields
		String actualRV;
		String expectedRV;
		
		//Test 1
		actualRV = (RationalNumberUtils_Dove.negate(RNI_1)).toString();
		expectedRV = "-2/5";
		assertEquals("negate_1 ->", expectedRV, actualRV);
		
		//Test 2
		actualRV = (RationalNumberUtils_Dove.negate(RNI_4)).toString();
		expectedRV = "-8/1";
		assertEquals("negate_2 ->", expectedRV, actualRV);	
	}
	
	
	@Test(timeout=3000)
	public void equals()
	
	{
		
		//Fields
		boolean actualRV;
		boolean expectedRV;
		
		//Test 1
		actualRV = RationalNumberUtils_Dove.equal(RNI_1, RNI_2);
		expectedRV = false;
		assertEquals("equals_1 ->", expectedRV, actualRV);
		
		//Test 2
		actualRV = RationalNumberUtils_Dove.equal(RNI_1, RNI_5);
		expectedRV = true;
		assertEquals("equals_2 ->", expectedRV, actualRV);	
	}
	

	@Test
	public void constructorTestGetNumerator3__4() 
	
	{
		
		RationalNumber testNumber = new RationalNumberImpl_Dove(3,4);
		
		int expectedValue = 3;
		int actualValue = testNumber.getNumerator();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetDenominator3__4() 
	
	{
		
		RationalNumber testNumber = new RationalNumberImpl_Dove(3,4);
		
		int expectedValue = 4;
		int actualValue = testNumber.getDenominator();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetValue3__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(3,4);
		
		double expectedValue = 0.75;
		double actualValue = testNumber.getValue();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetNumerator2__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(2,4);
		
		int expectedValue = 1;
		int actualValue = testNumber.getNumerator();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetDenominator2__4() 
	
	{
		
		RationalNumber testNumber = new RationalNumberImpl_Dove(2,4);
		
		int expectedValue = 2;
		int actualValue = testNumber.getDenominator();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	
	@Test(expected=AssertionError.class)
	public void constructorTestGetDenominator2__0() 
	
	{
		
		RationalNumber testNumber = new RationalNumberImpl_Dove(2,0);
		
	    assertThrows(AssertionError.class, () -> 
	    
	    {
	   
	    });
	    
	}
	
	@Test
	public void constructorTestGetNumeratorNeg2__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(-2,4);
		
		int expectedValue = -1;
		int actualValue = testNumber.getNumerator();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetDenominatorNeg2__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(-2,4);
		
		int expectedValue = 2;
		int actualValue = testNumber.getDenominator();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetNumerator0__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(0,4);
		
		int expectedValue = 0;
		int actualValue = testNumber.getNumerator();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetDenominator0__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(0,4);
		
		int expectedValue = 1;
		int actualValue = testNumber.getDenominator();
		
		assertEquals(expectedValue, actualValue);
		
	}
		
	@Test
	public void constructorTestGetValue2__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(2,4);
		
		double expectedValue = 0.5;
		double actualValue = testNumber.getValue();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetValue0__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(0,4);
		
		double expectedValue = 0;
		double actualValue = testNumber.getValue();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetToString2__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(2,4);
		
		String expectedValue = "1/2"; //make sure to use get numerator and get denominator
		String actualValue = testNumber.toString();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void constructorTestGetToString0__4() 
	
	{
	
		RationalNumber testNumber = new RationalNumberImpl_Dove(0,4);
		
		String expectedValue = "0/1"; //make sure to use get numerator and get denominator
		String actualValue = testNumber.toString();
		
		assertEquals(expectedValue, actualValue);
		
	}
		
	@Test
	public void operationsTestEqual2_4_and_1_2() 
	
	{
	
		RationalNumber firstValue2_4 = new RationalNumberImpl_Dove(2,4);
		RationalNumber secondValue1_2 = new RationalNumberImpl_Dove(1,2);
		
		boolean expectedFirstValueEqualsSecondValue = true;
		
		assertEquals(expectedFirstValueEqualsSecondValue, RationalNumberUtils_Dove.equal(firstValue2_4, secondValue1_2));
		
	}
	
	
	@Test
	public void operationsTestEqual3_4_and_1_2() 
	
	{
	
		RationalNumber firstValue2_4 = new RationalNumberImpl_Dove(3,4);
		RationalNumber secondValue1_2 = new RationalNumberImpl_Dove(1,2);
		

		boolean expectedFirstValueEqualsSecondValue = false;
		boolean actualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.equal(firstValue2_4, secondValue1_2);
	
		assertEquals(expectedFirstValueEqualsSecondValue, actualFirstValueEqualsSecondValue);

		
		
	}
	
	@Test
	public void operationsTestEqual0_4_and_0_2() {//this one is good
		RationalNumber firstValue2_4 = new RationalNumberImpl_Dove(0,4);
		RationalNumber secondValue1_2 = new RationalNumberImpl_Dove(0,2);
		

		boolean expectedFirstValueEqualsSecondValue = true;
		boolean actualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.equal(firstValue2_4, secondValue1_2);
	
		assertEquals(expectedFirstValueEqualsSecondValue, actualFirstValueEqualsSecondValue);

		
		
	}
		
	@Test
	public void operationsTestAdd() {///this one is good
		
		int A = 3;
		int B = 4;
		
		int C = 1;
		int D = 2;
		
		//adding 3/4 and 1/2 should return 5/4 = 1.25
		
		RationalNumber firstValue2_4 = new RationalNumberImpl_Dove(A,B);
		RationalNumber secondValue1_2 = new RationalNumberImpl_Dove(C,D);
		
		double expectedFirstValueAddSecondValue = ((double)((A*D)+(B*C))/(B*D));
		
		double actualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.add(firstValue2_4, secondValue1_2).getValue();
	
		assertEquals(expectedFirstValueAddSecondValue, actualFirstValueEqualsSecondValue);

	}
		
	@SuppressWarnings("deprecation")
	@Test
	public void operationsTestSubtract() 
	
	{
		
		int A = 3;
		int B = 4;
		
		int C = 1;
		int D = 2;
		
		
		
		RationalNumber firstValue2_4 = new RationalNumberImpl_Dove(A,B);
		RationalNumber secondValue1_2 = new RationalNumberImpl_Dove(C,D);
		
		
		double expectedFirstValueAddSecondValue = ((double)((A*D)-(B*C))/(B*D));
		
		double actualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.subtract(firstValue2_4, secondValue1_2).getValue();
	
		assertEquals(expectedFirstValueAddSecondValue, actualFirstValueEqualsSecondValue);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void operationsTestMultiplication() 
	
	{

		int A = 3;
		int B = 4;
		
		int C = 1;
		int D = 2;
		
		RationalNumber firstValue2_4 = new RationalNumberImpl_Dove(A,B);
		RationalNumber secondValue1_2 = new RationalNumberImpl_Dove(C,D);
		
		double expectedFirstValueAddSecondValue = ((double)((A*C))/(B*D));
		
		double actualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.multiply(firstValue2_4, secondValue1_2).getValue();
	
		assertEquals(expectedFirstValueAddSecondValue, actualFirstValueEqualsSecondValue);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void operationsTestDivision() 
	
	{
		
		int A = 3;
		int B = 4;
		
		int C = 1;
		int D = 2;
		
		
		
		RationalNumber firstValue2_4 = new RationalNumberImpl_Dove(A,B);
		RationalNumber secondValue1_2 = new RationalNumberImpl_Dove(C,D);
		
		
		double expectedFirstValueAddSecondValue = ((double)((A*D))/(B*C));
		
		double actualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.divide(firstValue2_4, secondValue1_2).getValue();
	
		assertEquals(expectedFirstValueAddSecondValue, actualFirstValueEqualsSecondValue);

	}
	
	
	@Test
	public void operationsTestNegation() 
	
	{
		
		int A = 3;
		int B = 4;
		
		int C = -3;
		int D = 4;
		
		RationalNumber firstValue3_4 = new RationalNumberImpl_Dove(A,B);
		RationalNumber expectedValueNeg3_4 = new RationalNumberImpl_Dove(C,D);
		

		RationalNumber negatedFirstValue3_4 = RationalNumberUtils_Dove.negate(firstValue3_4);
		
		boolean booleanActualFirstValueEqualsSecondValue = RationalNumberUtils_Dove.equal(negatedFirstValue3_4, expectedValueNeg3_4);
		boolean expectEquals = true;
		
		assertEquals(expectEquals, booleanActualFirstValueEqualsSecondValue);

	}

}