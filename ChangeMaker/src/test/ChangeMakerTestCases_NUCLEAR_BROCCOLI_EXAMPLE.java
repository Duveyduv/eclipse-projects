package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import change.ChangeMaker;
import change.ChangeMakerImpl_Dove;

public class ChangeMakerTestCases_NUCLEAR_BROCCOLI_EXAMPLE

{
	protected static ChangeMaker changeMaker_STUDENT;
	
	protected ChangeMaker getChangeMaker(Set<Integer> denominations)
	
	{
	
		return new ChangeMakerImpl_Dove(denominations);
	
	}
	
	@Test(expected=AssertionError.class)
	public void callConstructorWithNull()
	
	{
		Set<Integer> denominationSet = null;
		
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	}
	
	@Test(expected=AssertionError.class)
	public void callConstructorWithNeg()
	
	{
		Integer[] values = new Integer[]{-32, 16, -8, 4, -2, -1};
		
		Set<Integer> denominationSet = new HashSet<Integer>(Arrays.asList(values));
	
		changeMaker_STUDENT = getChangeMaker(denominationSet);
	}
	
	@Test(expected=AssertionError.class)
	public void calculateValueOfChangeList__NEGATIVE_LIST_WITH_NULL()
	
	{
		
		Integer[] values = new Integer[]{100, 25, 10, 5, 1};
		
		Set<Integer> denominationSet = new HashSet<Integer>(Arrays.asList(values));
		
		changeMaker_STUDENT = getChangeMaker(denominationSet);
		
		List<Integer> changeList = Arrays.asList(new Integer[]{-1, 0, -2, 1, null});
		
		changeMaker_STUDENT.calculateValueOfChangeList(changeList);
		
	}
	
}
