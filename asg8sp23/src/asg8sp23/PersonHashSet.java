package asg8sp23;

import java.util.HashSet;

public class PersonHashSet 

{

	private HashSet<String> names;

    // constructor
    public PersonHashSet() 
    
    {
    
    	names = new HashSet<String>();
    
    }

    // add a name to the HashSet
    public void addName(String name) 
    
    {
    
    	names.add(name);
    
    }

    // remove a name from the HashSet
    public void removeName(String name) 
    
    {
    
    	names.remove(name);
    
    }

    // get all names in the HashSet
    public HashSet<String> getAllNames() 
    
    {
    
    	return names;
    
    }
}
