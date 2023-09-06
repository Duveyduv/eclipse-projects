package asg8sp23;

import java.util.LinkedHashMap;

public class PersonLinkedHashMap 

{

	private LinkedHashMap<String, Integer> people;

    // constructor
    public PersonLinkedHashMap() 
    
    {
    
    	people = new LinkedHashMap<String, Integer>();
    
    }

    // add a person to the LinkedHashMap
    public void addPerson(String name, int age) 
    
    {
    
    	people.put(name, age);
    
    }

    // remove a person from the LinkedHashMap
    public void removePerson(String name) 
    
    {
    
    	people.remove(name);
    
    }

    // get the age of a person from the LinkedHashMap using the name
    public int getAge(String name) 
    
    {
    
    	return people.get(name);
    
    }

    // get all people in the LinkedHashMap
    public LinkedHashMap<String, Integer> getAllPeople() 
    
    {
    
    	return people;
    
    }

}
