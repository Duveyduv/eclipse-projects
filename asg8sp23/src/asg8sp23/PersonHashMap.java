package asg8sp23;

import java.util.HashMap;

public class PersonHashMap 

{

	private HashMap<String, Person> people;

    // constructor
    public PersonHashMap() 
    
    {
    
    	people = new HashMap<String, Person>();
    
    }

    // add a person to the HashMap
    public void addPerson(String key, Person person) 
    
    {
    
    	people.put(key, person);
    
    }

    // remove a person from the HashMap
    public void removePerson(String key) 
    
    {
    
    	people.remove(key);
    
    }

    // get a person from the HashMap using the key
    public Person getPerson(String key) 
    
    {
    
    	return people.get(key);
    
    }

    // get all people in the HashMap
    public HashMap<String, Person> getAllPeople() 
    
    {
    
    	return people;
    
    }

}
