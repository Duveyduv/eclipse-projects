package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SomeSetMechanics_Examples
{
	private static Set<Integer> getFirstTenIntegersSet()
	{
		Set<Integer> integerSet = new HashSet<Integer>();
		assert integerSet.size() == 0;
		
		for(int i = 1; i <= 10; i++)
		{
			integerSet.add(i);
		}
		assert integerSet.size() == 10;
		
		//add them again:
		for(int i = 1; i <= 10; i++)
		{
			integerSet.add(i);
			//notice that the size of integerSet does not change:
			assert integerSet.size() == 10;
		}
		
		assert integerSet.contains(1);
		assert integerSet.contains(2);
		assert integerSet.contains(3);
		assert integerSet.contains(4);
		assert integerSet.contains(5);
		assert integerSet.contains(6);
		assert integerSet.contains(7);
		assert integerSet.contains(8);
		assert integerSet.contains(9);
		assert integerSet.contains(10);
		
		//just for fun:
		integerSet.remove(3);
		assert integerSet.size() == 9;
		integerSet.add(3);
		assert integerSet.size() == 10;
		
		return integerSet;
	}
	
	//This could be made more generic, but don't worry about that now:
	private static String toStringSetElements(Set<Integer> integerSet)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		List<Integer> integerList = new ArrayList<Integer>(integerSet);
		assert integerList.size() == integerSet.size();
		
		for(int i = 0; i < integerList.size(); i++)
		{
			Integer element = integerList.get(i);
			sb.append(element);
			boolean processingLastElement = (i == integerList.size() - 1);
			if(!processingLastElement) sb.append(",");
		}
		sb.append("}");
		
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		Set<Integer> firstTenIntegers = getFirstTenIntegersSet();
		String stringRepresentation = toStringSetElements(firstTenIntegers);
		System.out.println(stringRepresentation);
	}
}
