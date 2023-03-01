package asg3sp23;

import java.util.ArrayList;

public class Person 

{
	//Creating fields and setting children as an ArrayList of Person.
    
	private String name;
    private String mother;
    private String father;
    private ArrayList<Person> children;
    
    
    
    
    // Null constructor for just one person.
    
    public Person(String name)
    
    {
    	
    	this.name = name;
    	this.mother = null;
    	this.father = null;
    	
    }
    
    
    
    // Main constructor
    
    public Person(String name, String mother, String father)
    
    {
    	
    	this.name = name;
    	this.mother = mother;
    	this.father = father;
    	this.children = new ArrayList<Person>();
    	
    }
    
    
    
    // Setters and getters

	public String getName() 
	
	{
		return name;
	}
	
	

	public void setName(String name) 
	
	{
		this.name = name;
		
	}



	public String getMother() 
	
	{
		return mother;
		
	}



	public void setMother(String mother) 
	
	{
		this.mother = mother;
	
	}



	public String getFather() 
	
	{
		return father;
	
	}



	public void setFather(String father) 
	
	{
		this.father = father;
	
	}



	public ArrayList<Person> getChildren() 
	
	{
		return children;
	
	}
	
	
	// Here I was attempting to add a child to my children array.

	public void setChildren(Person child) 
	
	{
		
		this.children.add(child);
	
	}


    public String toString() 
    
    {
        return this.name + "'s Mother: " + this.mother + ", Father: " + this.father + ", Children: " + this.getChildren();
    

    }

    
}