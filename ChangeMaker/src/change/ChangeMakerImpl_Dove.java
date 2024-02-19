package change;

import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class ChangeMakerImpl_Dove implements ChangeMaker

{	
	
	private Set<Integer> denominations;

	//part of pre: i <= 0 ==> !denominations.contains(i)
	//part of pre: does not contain or is null
	//part of pre: does not contain negatives
	//part of pre: does not contain 0
	public ChangeMakerImpl_Dove(Set<Integer> denominations)
	
	{
		
		assert denominations != null;
		assert denominations.contains(null) == false;
		assert denominations.contains(0) == false;
		assert containsNegative_Set(denominations) == false;
		
		this.denominations = denominations;
				
	}
	
	//part of pre: returns a sorted descending list of our denominations
	public List<Integer> getDenominations()
	
	{
		
		int denoms = denominations.size();
		
		List<Integer> denominationsAsList = new ArrayList<Integer>(denoms);
		
		for (Integer x : denominations)
			
		{
			
			denominationsAsList.add(x);
		
		}
        
		Collections.sort(denominationsAsList);
		
		Collections.reverse(denominationsAsList);
				
		return denominationsAsList;
		
	}
	
	//part of pre: valueInCents > 0, and less than max int
	public boolean canMakeExactChange(int valueInCents)
	
	{
		
		assert valueInCents >= 0 && valueInCents <= Integer.MAX_VALUE;
		
		List<Integer> denominations = getDenominations();
		
		Integer[] denominationsAsArray = (Integer[])denominations.toArray(new Integer[denominations.size()]);
		// convert my list to an array

		boolean canMakeChange = true;
		
		if (denominationsAsArray.length == 1)
		// if the value in the list 	
		{
			
			valueInCents = denominationsAsArray[0] % valueInCents;
		
		}
		
		for (int i = 0; i < denominationsAsArray.length; i++)
			
		{
			
			while (valueInCents >= denominationsAsArray[i])
			
			{
	
				valueInCents %= denominationsAsArray[i];
				
			}
			
		}
		
		if (valueInCents != 0)
			
		{
			
			return false;
			
		}
		
		else
			
			return canMakeChange;
	
	}
	
	//part of pre: changelist != null, doesn't contain null, nor is negative
	public int calculateValueOfChangeList(List<Integer> changeList)
	
	{
		
		assert changeList != null;
		assert changeList.contains(null) == false;
		assert containsNegative_List(changeList) == false;
	
		int finalChange = 0;
		
		Integer[] changeListToArray = (Integer[])changeList.toArray(new Integer[changeList.size()]);
		
		List<Integer> denominations = getDenominations();
		
		Integer[] denominationsToArray = (Integer[])denominations.toArray(new Integer[denominations.size()]);

		
		for (int i = 0; i <= changeListToArray.length - 1; i++)
			
		{
			
			finalChange += changeListToArray[i] * denominationsToArray[i];
			
		}
		
		return finalChange;

	}
	
	//part of pre: boolean of can make change should return true for us to continue, else, assertion error.
	//part of pre: valueInCents > 0 and less than max int
	public List<Integer> getExactChange(int valueInCents)
	
	{
		
		assert valueInCents >= 0 && valueInCents < Integer.MAX_VALUE;
		assert canMakeExactChange(valueInCents);
		// do not continue unless we can make exact change
		
		List<Integer> denominations = getDenominations();
		
		Integer[] denominationsToArray = (Integer[])denominations.toArray(new Integer[denominations.size()]);
		
        List<Integer> changeList = new ArrayList<>();
        // new list so that we can add our calculated values into it

        for (int index = 0; index <= denominationsToArray.length - 1; index++)
        
        {
            // i.e. number of coins = 141 // 100 == 1
        	int numberOfCoins = (int) Math.floor(valueInCents / denominationsToArray[index]);
        	changeList.add(numberOfCoins); // add that value
        	valueInCents -= (numberOfCoins * denominationsToArray[index]); // new valueincents = valueincents - numberofcoins * current value in denominations
       	
        }

        return changeList;
			
    }
	
	public String toString()
	
	{
			
		return "Denominations of the change maker: " + getDenominations();
		
	}
	
	//////////////////////////////////////// HELPER METHODS //////////////////////////////////////
	
	private boolean containsNegative_List(List<Integer> list)
	
	{
		
		Integer[] checkingList = (Integer[])list.toArray(new Integer[list.size()]);
		
		boolean containsNeg = false;
		
		for (int i = 0; i <= checkingList.length - 1; i++)
			
		{
			
			if (checkingList[i] < 0)
				
			{
				
				containsNeg = true;
				
			}
			
		}
		
		return containsNeg;
		
	}
	
	private boolean containsNegative_Set(Set<Integer> set)
	
	{
		
		Integer[] checkingSet = (Integer[])set.toArray(new Integer[set.size()]);
		
		boolean containsNeg = false;
		
		for (int i = 0; i <= checkingSet.length - 1; i++)
			
		{
			
			if (checkingSet[i] < 0)
				
			{
				
				containsNeg = true;
				
			}
		
		}
		
		return containsNeg;
		
	}

}