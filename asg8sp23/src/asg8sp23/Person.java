package asg8sp23;

public class Person 

{

	private String name;
    private int age;
    private String city;

    // constructors
    public Person(String name, int age, String city) 
    
    {
    
    	this.name = name;
        this.age = age;
        this.city = city;
        
    }

    // getters and setters
    public String getName() 
    
    {
    
    	return name;
    
    }

    public void setName(String name) 
    
    {
    
    	this.name = name;
    
    }

    public int getAge() 
    
    {
    
    	return age;
    
    }

    public void setAge(int age) 
    
    {
    
    	this.age = age;
    
    }

    public String getCity() 
    
    {
    
    	return city;
    
    }

    public void setCity(String city) 
    
    {
    
    	this.city = city;
    
    }

    // toString method
    public String toString() 
    
    {
    
    	return name + ", " + age + ", " + city;
    
    }

}
