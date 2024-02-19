package test;

import census.WordCensusImpl_Dove;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class simpletest {
	
	final List<String> wordList = Arrays.asList("hello", "bob", "bob", "ten", "two", "ten", "hello", "hello");
	final List<String> nullList = Arrays.asList(null, null, null, null, null);
	
	//WarAndPeace Scanner
	protected Scanner getWarAndPeaceScanner() throws IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("resources/WarAndPeace.txt");
		assert input != null : "input is null! : Check that the resources folder is on the classpath, the file name is correct, and the file is in the resources folder";
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
		Scanner warAndPeaceScanner = new Scanner(bufferedReader);
		warAndPeaceScanner.useDelimiter("(" + warAndPeaceScanner.delimiter().pattern() + "|[.!,?\"\'])+");
		return warAndPeaceScanner;
	}
	
	//Get WarAndPeace Lowercase List
	protected static List<String> getWordListLowercase(Scanner wordScanner)
	{
		List<String> wordList = new ArrayList<String>();
		while(wordScanner.hasNext())
		{
			wordList.add(wordScanner.next().toLowerCase());
		}
		return wordList;
	}
	
	@Test(timeout=1000)
	public void getCount() {
		
		//Fields
		WordCensusImpl_Dove wc;
		int expected;
		int actual;
		
		//Test 1
		wc = new WordCensusImpl_Dove(wordList);
		expected = 3;
		actual = wc.getCount("hello");
		assertEquals("getCount_1 -> ", expected, actual);
		
		//Test 2
		wc = new WordCensusImpl_Dove(wordList);
		expected = 2;
		actual = wc.getCount("bob");
		assertEquals("getCount_2 -> ", expected, actual);
		
		//Test 3
		wc = new WordCensusImpl_Dove(nullList);
		expected = 5;
		actual = wc.getCount(null);
		assertEquals("getCount_3 -> ", expected, actual);
	}
	
	
	@Test(timeout=1000)
	public void getDistinctWords() {
		
		//Fields
		WordCensusImpl_Dove wc;
		Set<String> expected;
		Set<String> actual;
		
		expected = new HashSet<>();
		expected.add("hello");
		expected.add("bob");
		expected.add("ten");
		expected.add("two");
		
		//Test 1
		wc = new WordCensusImpl_Dove(wordList);
		actual = wc.getDistinctWords();
		assertEquals("getDistinctWords_1 -> ", expected, actual);
		
		expected.clear();
		expected.add(null);
		
		//Test 2
		wc = new WordCensusImpl_Dove(nullList);
		actual = wc.getDistinctWords();
		assertEquals("getDistinctWords_2 -> ", expected, actual);
	}
	
	
	@Test(timeout=10000)
	public void getWordWithRank() {
		
		//Fields
		WordCensusImpl_Dove wc;
		String expected;
		String actual;
		
		//Test 1
		wc = new WordCensusImpl_Dove(wordList);
		expected = "hello";
		actual = wc.getWordWithRank(1);
		assertEquals("getWordWithRank_1 -> ", expected, actual);
		
		//Test 2
		wc = new WordCensusImpl_Dove(wordList);
		expected = "ten";
		actual = wc.getWordWithRank(3);
		assertEquals("getWordWithRank_1 -> ", expected, actual);
		
		//Test 3
		try {
			Scanner WarAndPeaceScanner = getWarAndPeaceScanner();
			List<String> WAPWordList = getWordListLowercase(WarAndPeaceScanner);
			wc = new WordCensusImpl_Dove(WAPWordList);
			expected = "the";
			actual = wc.getWordWithRank(1);
			assertEquals("getWordWithRank_1 -> ", expected, actual);
		} 
		catch(Exception e) {fail("Could not Read WarAndPeace");}
	}
}