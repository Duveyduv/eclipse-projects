package cosc2425lab8sp23;

public class Person 

{
	// Initializing fields
	String name;
	String address;
	String number;
	
	public Person(String name, String address, String number)
	
	{
		// Constructor with fields.
		this.name = name;
		this.address = address;
		this.number = number;
				
	}

	// Setters and getters for fields.
	public String getName() 
	{
		
		return name;
	
	}

	public void setName(String name) 
	
	{
	
		this.name = name;
	
	}

	public String getAddress() 
	
	{
	
		return address;
	
	}

	public void setAddress(String address) 
	
	{
	
		this.address = address;
	
	}

	public String getNumber() 
	
	{
	
		return number;
	
	}

	public void setNumber(String number) 
	
	{
	
		this.number = number;
	
	}

	//toString that just returns our name, address, and number.
	@Override
	public String toString() 
	
	{
		
		return name + " " + address + " "  + number;
	
	}
	
}
