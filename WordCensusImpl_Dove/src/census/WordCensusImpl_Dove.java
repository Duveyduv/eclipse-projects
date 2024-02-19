package census;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WordCensusImpl_Dove implements WordCensus

{

	private List<String> wordList;
	
	public WordCensusImpl_Dove(List<String> wordList)
	
	{
		// Preserving our wordList into a new arrayList
		this.wordList = new ArrayList<>(wordList);
	
	}
				 
	@Override
	public int getCount(String word) 
	
	{
	    
		if (word == null) 
		
		{
	        // Count occurrences of null in the wordList
	        return (int) wordList.stream().filter(targetWord -> targetWord == null).count();
	    
		} else 
		
		{
	        // Count occurrences of regular words equal to the specified word in the wordList
	        return (int) wordList.stream()
	                .filter(targetWord -> targetWord != null && targetWord.trim().equals(word.trim()))
	                .count();
	    
		}
	
	}
	
	@Override
	public Set<String> getDistinctWords() 
	
	{
		// A set filters the same words out making this hashset unique
		return new HashSet<>(wordList);
	
	}

	@Override
	public String getWordWithRank(int i) 
	
	{
	    // Rank cannot be less than 0
		assert (i > 0) : "i cannot be less than 0!";
		
		// Using a TreeMap for a k, v pair
	    Map<String, Integer> wordWithCountsMap = new TreeMap<>();
	    
	    for (String word : wordList) 
	    
	    {
	    	// Put each word from the filtered word list as well with their respective count
	    	wordWithCountsMap.put(word, wordWithCountsMap.getOrDefault(word, 0) + 1);
	    
	    }
	    
	    // Sort the list so the word with the biggest count is the first element of the list
	    List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordWithCountsMap.entrySet());
	    sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
	    
	    // Returning the requested word with the key
	    Map.Entry<String, Integer> entry = sortedList.get(i - 1);
	    String wordWithRank = entry.getKey();

	    return wordWithRank;
	
	}

}