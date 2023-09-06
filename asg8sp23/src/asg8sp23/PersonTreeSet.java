package asg8sp23;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonTreeSet 

{

	private TreeSet<Person> people;

    // constructor with comparator
    public PersonTreeSet() 
    
    {
    
    	people = new TreeSet<Person>(new AgeComparator());
    
    }

    // add a person to the TreeSet
    public void addPerson(Person person) 
    
    {
    
    	people.add(person);
    
    }

    // remove a person from the TreeSet
    public void removePerson(Person person) 
    
    {
    
    	people.remove(person);
    
    }

    // get all people in the TreeSet
    public TreeSet<Person> getAllPeople() 
    
    {
    
    	return people;
    
    }

    // Comparator for sorting by age
    private class AgeComparator implements Comparator<Person> 
    
    {
    
    	public int compare(Person p1, Person p2) 
    	
    	{
        
    		return p1.getAge() - p2.getAge();
        
    	}
    
    }

}
