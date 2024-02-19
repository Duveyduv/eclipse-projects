package test;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import change.ChangeMaker;
import change.ChangeMakerImpl_Dove;

public class ChangeMakerTestCases_STARTER_Dove
{
	//Student note (ask me about this) -
	//The following debugging switch is not typically found in Test Cases:
	final static boolean DEBUGGING = false;
	
	final static int DESIRED_TIMEOUT_IN_MILLISECONDS = (3)*1000;
	final static int TIMEOUT_USED_FOR_DEBUGGING_IN_MILLISECONDS = (10*((60)*1000));
	final static int TIMEOUT_IN_MILLISECONDS = (DEBUGGING ? TIMEOUT_USED_FOR_DEBUGGING_IN_MILLISECONDS : DESIRED_TIMEOUT_IN_MILLISECONDS);
	
	//Student note (ask me about this) -
	//The following constructor is deprecated...
	@SuppressWarnings("deprecation")
	@Rule
	public Timeout timeoutForAllTestMethods = new Timeout(TIMEOUT_IN_MILLISECONDS);
	
	protected static ChangeMaker changeMaker_STUDENT;
	
	protected static String TEST_GOAL_MESSAGE;
	
	@Retention(value=RUNTIME)
	@Target(value=METHOD)
	public @interface Points {
		int value();
	}
	
	private static Set<Integer> getUSCoinDenominationSet()
	{
		return getDenominationSet(new Integer[]{1, 5, 10, 25, 100});
	}

	private static Set<Integer> getDenominationSet(Integer[] values)
	{
		Set<Integer> denominationSet = new HashSet<Integer>(Arrays.asList(values));
		assert denominationSet.size() == values.length : "The Integer array values has duplicates! : values = " + getPrettyString(values);
		//STUDENT: add check for null

		return denominationSet;
	}
	
	private static String getPrettyString(Set<Integer> set)
	{
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		Collections.reverse(list);
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(int i = 0; i < list.size(); i++)
		{
			sb.append(list.get(i));
			if(i < list.size() - 1)
			{
				sb.append(", ");
			}
		}
		sb.append("}");
		return sb.toString();
	}
	
	private static String getPrettyString(Integer[] integerArray)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i = 0; i < integerArray.length; i++)
		{
			sb.append(integerArray[i]);
			if(i < integerArray.length - 1)
			{
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	private static String getPrettyString(List<Integer> list)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i = 0; i < list.size(); i++)
		{
			sb.append(list.get(i));
			if(i < list.size() - 1)
			{
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	protected ChangeMaker getChangeMaker(Set<Integer> denominations)
	{
		return new ChangeMakerImpl_Dove(denominations);
	}

	@Points(value=5)
	@Test
	public void canMakeExactChange__USCoins__65()
	{
		Set<Integer> usCoinDenominationSet = getUSCoinDenominationSet();
		int valueInCents = 65;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(usCoinDenominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(usCoinDenominationSet);
		
		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		//NOTE: assertTrue() is acceptable here as well;
		//I am emphasizing *the* structure of a test case...
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__USCoins__65()
	{
		Set<Integer> usCoinDenominationSet = getUSCoinDenominationSet();
		int valueInCents = 65;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(usCoinDenominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(usCoinDenominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{0, 2, 1, 1, 0});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
	}

	@Points(value=5)
	@Test
	public void canMakeExactChange__USCoins__55()
	{
		Set<Integer> usCoinDenominationSet = getUSCoinDenominationSet();
		int valueInCents = 55;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(usCoinDenominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(usCoinDenominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
	}

	@Points(value=5)
	@Test
	public void canMakeExactChange__USCoins__10()
	{
		Set<Integer> usCoinDenominationSet = getUSCoinDenominationSet();
		int valueInCents = 10;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(usCoinDenominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(usCoinDenominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
	}

	@Points(value=5)
	@Test
	public void canMakeExactChange__USCoins__11()
	{
		Set<Integer> usCoinDenominationSet = getUSCoinDenominationSet();
		int valueInCents = 11;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(usCoinDenominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(usCoinDenominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
	}

	@Points(value=5)
	@Test
	public void canMakeExactChange__USCoins__180004()
	{
		Set<Integer> usCoinDenominationSet = getUSCoinDenominationSet();
		int valueInCents = 180004;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(usCoinDenominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(usCoinDenominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
	}

	@Points(value=5)
	@Test
	public void canMakeExactChange__32_16_8_4_2_1__0()
	{
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{32, 16, 8, 4, 2, 1});
		int valueInCents = 0;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__32_16_8_4_2_1__0()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{32, 16, 8, 4, 2, 1});
		int valueInCents = 0;
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
	
		assertEquals("Calculated changeList disagrees with expected!", changeMaker_STUDENT.getExactChange(valueInCents), actualChangeList);
	
	}
	
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__1E8_1E7_1E6_1E5_1E4_1E3_1E2_1E1_1E0__123456789()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{(int) 1e8, (int) 1e7, (int) 1e6, (int) 1e5, (int) 1e4, (int) 1e3, (int) 1e2, (int) 1e1, (int) 1e0});
		int valueInCents = 123456789;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__1E8_1E7_1E6_1E5_1E4_1E3_1E2_1E1_1E0__12345678()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{(int) 1e8, (int) 1e7, (int) 1e6, (int) 1e5, (int) 1e4, (int) 1e3, (int) 1e2, (int) 1e1, (int) 1e0});
		int valueInCents = 12345678;

		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__144_89_55_34_21_13_8_5_3_2_1__0()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1});
		int valueInCents = 0;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__144_89_55_34_21_13_8_5_3_2_1__201()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1});
		int valueInCents = 201;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__144_89_55_34_21_13_8_5_3_2_1__201()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1});
		int valueInCents = 201;

		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__16777216_2097152_262144_32768_4096_512_64_8_1__88888888()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{16777216, 2097152, 262144, 32768, 4096, 512, 64, 8, 1});
		int valueInCents = 88888888;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__16777216_2097152_262144_32768_4096_512_64_8_1__88888888()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{16777216, 2097152, 262144, 32768, 4096, 512, 64, 8, 1});
		int valueInCents = 88888888;

		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{5, 2, 3, 0, 5, 3, 0, 7, 0});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
		
	}

	@Points(value=5)
	@Test
	public void calculateValueOfChangeList__537824_38416_2744_196_14_1__0_0_0_0_0_0()
	
	{
		
		List<Integer> changeList = Arrays.asList(0, 0, 0, 0, 0, 0); // our change list
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{537824, 38416, 2744, 196, 14, 1}); // denomination set
		int valueOfChangeList = 0; // the value of our change list is 0
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); // actual change list is getting the exact value of our change list
	
		assertEquals(valueOfChangeList, actualChangeListValue); // our value of change list should equal our actual change list value
		
	}
	
	@Points(value=5)
	@Test
	public void calculateValueOfChangeList__144_89_55_34_21_13_8_5_3_2_1__0_0_0_0_0_0_0_3_2_1_0()
	
	{
		
		List<Integer> changeList = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 3, 2, 1, 0); // our change list
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1}); // denomination set
		int valueOfChangeList = 23; 
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); // actual change list is getting the exact value of our change list
	
		assertEquals(valueOfChangeList, actualChangeListValue); // our value of change list should equal our actual change list value
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__8000_400_20_1__492()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{8000, 400, 20, 1});
		int valueInCents = 429;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__8000_400_20_1__492()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{8000, 400, 20, 1});
		int valueInCents = 429;
			
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{0, 1, 1, 9});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
		
	}
	
	@Points(value=5)
	@Test
	public void calculateValueOfChangeList__USCoinSet__0_0_0_0_28()
	{
		
		List<Integer> usChangeList = Arrays.asList(0, 0, 0, 0, 28); // our change list
		Set<Integer> usDenominationSet = getDenominationSet(new Integer[]{100, 25, 10, 5, 1}); // denomination set
		int valueOfChangeList = 28;
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(usDenominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(usDenominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(usChangeList); // actual change list is getting the exact value of our change list
	
		assertEquals(valueOfChangeList, actualChangeListValue); // our value of change list should equal our actual change list value
		
	}
	
	//////////////////////////////// MY TEST CASES /////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void calculateValueOfChangeList__NegativeSet__0_Neg2_Neg3()
	{
		
		List<Integer> changeList = Arrays.asList(0, -2, -3); // our change list
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{-1, -2, -3}); // denomination set
		int valueOfChangeList = 13; // the value of our change list is 13
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); // actual change list is getting the exact value of our change list
	
		assertEquals(valueOfChangeList, actualChangeListValue); // our value of change list should equal our actual change list value
		
	}
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void calculateValueOfChangeList__0SETNULL__0_0_0_0()
	{
		
		List<Integer> changeList = Arrays.asList(0, 0, null, 0);
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{0});
		int valueOfChangeList = 0;
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); 
	
		assertEquals(valueOfChangeList, actualChangeListValue);
		
	}
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void calculateValueOfChangeList__USCoinSet__null()
	{
		
		List<Integer> changeList = null;
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{100, 25, 10, 5, 1});
		String valueOfChangeList = null;
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); 
	
		assertEquals("null is nuclear broccoli", valueOfChangeList, actualChangeListValue);
		
	}
	
	@Points(value=5)
	@Test
	public void calculateValueOfChangeList__USCoinSet__0_1_0_1_0()
	{
		
		List<Integer> changeList = Arrays.asList(0, 1, 0, 1, 0);
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{100, 25, 10, 5, 1});
		int valueOfChangeList = 30;
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); 
	
		assertEquals(valueOfChangeList, actualChangeListValue);
		
	}
	
	@Points(value=5)
	@Test
	public void calculateValueOfChangeList__USCoinSet__1_1_1_1_1()
	{
		
		List<Integer> changeList = Arrays.asList(1, 1, 1, 1, 1);
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{100, 25, 10, 5, 1});
		int valueOfChangeList = 141;
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); 
	
		assertEquals(valueOfChangeList, actualChangeListValue);
		
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__USCoinSet__1_1_1_1_1()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{100, 25, 10, 5, 1});
		int valueInCents = 141;
			
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{1, 1, 1, 1, 1});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__10__10()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{10});
		int valueInCents = 10;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__10__1()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{1});
		int valueInCents = 10;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void canMakeExactChange__0__1()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{0});
		int valueInCents = 1;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = false;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker shouldn't be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__MAX_INT__MAX_INT()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{2147483647});
		int valueInCents = 2147483647;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void canMakeExactChange__MIN_INT__MIN_INT()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{-2147483647});
		int valueInCents = -2147483647;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__9_8_7_6_5__99()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{9, 8, 7, 6, 5});
		int valueInCents = 99;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void getExactChange__123_456_789_101112__12345()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{123, 445, 789, 101112});
		int valueInCents = 1234;
			
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{0, 1, 1, 0});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__144_89_55_34_21_13_8_5_3_2_1__375()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1});
		int valueInCents = 375;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__108_12()
	{
		
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{108});
		int valueInCents = 12;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = true;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
		
	}
	
	@Points(value=5)
	@Test
	public void calculateValueOfChangeList__3_2_1__2_0_0()
	{
		
		List<Integer> changeList = Arrays.asList(2, 0, 0);
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{3, 2, 1});
		int valueOfChangeList = 6;
	
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueOfChangeList + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	
		int actualChangeListValue = changeMaker_STUDENT.calculateValueOfChangeList(changeList); 
	
		assertEquals(valueOfChangeList, actualChangeListValue);
		
	}
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void getExactChange__11_7__10()
	{
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{11,7});
		int valueInCents = 10;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{1,0});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
	}
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__11_7__9()
	{
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{11,7});
		int valueInCents = 9;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = false;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
	}
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void getExactChange__11_7__9()
	{
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{11,7});
		int valueInCents = 9;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{1,0});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
	}
	
	
	@Points(value=5)
	@Test
	public void canMakeExactChange__11_7__8()
	{
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{11,7});
		int valueInCents = 8;
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".canMakeExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);

		boolean expected = false;
		boolean actual = changeMaker_STUDENT.canMakeExactChange(valueInCents);

		assertEquals("ChangeMaker should be able to make change for " + valueInCents, expected, actual);
	}
	
	@Points(value=5)
	@Test(expected=AssertionError.class)
	public void getExactChange__11_7__8()
	{
		Set<Integer> denominationSet = getDenominationSet(new Integer[]{11,7});
		int valueInCents = 8;
		
		TEST_GOAL_MESSAGE = "Test " + getPrettyString(denominationSet) + ".getExactChange(" + valueInCents + ")";
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> actualChangeList = changeMaker_STUDENT.getExactChange(valueInCents);
		List<Integer> expectedChangeList = Arrays.asList(new Integer[]{1,0});
		
		assertEquals("Calculated changeList disagrees with expected!", expectedChangeList, actualChangeList);
	}
	
}
