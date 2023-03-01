package cosc03lab5sp23Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import cosc03lab5sp23.Calculator;


public class TestCase {
	
	
	// new object of calc
	Calculator calc = new Calculator();
	
	// defining our datasets
	float a = 4;
	float b = 2;
	
	float c = (float)4.5;
	float d = (float)2.25;
	
	float e = (float)2.25;
	float f = (float)4.5;
	
	
	
	/* testing all methods from calculator class, and then assertEquals these values
	 * with the object of calculator's methods.
	 * 
	*/
	
	@Test
	public void expValAdd() 
	
	{
		
		
		assertEquals(a+b, calc.add(a, b));
		assertEquals(c+d, calc.add(c, d));
		assertEquals(e+f, calc.add(e, f));
		
		
	}
	
	@Test
	public void expValSub()
	
	{
		
		
		assertEquals(a-b, calc.subtract(a, b));
		assertEquals(c-d, calc.subtract(c, d));
		assertEquals(e-f, calc.subtract(e, f));
		
		
	}
	
	@Test
	public void expValMulti()
	
	{
		
		
		assertEquals(a*b, calc.multiply(a, b));
		assertEquals(c*d, calc.multiply(c, d));
		assertEquals(e*f, calc.multiply(e, f));

		
		
	}
	
	
	@Test
	public void expValDiv()
	
	{
		
		
		assertEquals(a/b, calc.divide(a, b));
		assertEquals(c/d, calc.divide(c, d));
		assertEquals(e/f, calc.divide(e, f));

		
		
	}
	
	
	@Test
	public void expValboolCheck()
	
	{
		
		assertEquals(a==b, calc.boolCheck(a, b));
		assertEquals(c==d, calc.boolCheck(c, d));
		assertEquals(e==f, calc.boolCheck(e, f));
		
		
	}
	
	

	

}
