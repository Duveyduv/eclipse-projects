package cosc2425lab8sp23;

public class Employee extends Person
// Extending our employee from Person

{
	
	String EID;
	String department;
	String email;
	boolean exempt;
	
	
	

	// Employee constructor.
	public Employee(String name, String address, String number, String eID, String department, String email, boolean exempt) 
	
	{
		
		super(name, address, number);
		EID = eID;
		this.department = department;
		this.email = email;
		this.exempt = exempt;
	}
	
	// Setters and getters
	public String getEID() 
	
	{
	
		return EID;
	
	}
	
	public void setEID(String eID) 
	
	{
		
		EID = eID;
	
	}

	public String getDepartment() 
	
	{
	
		return department;
	
	}

	public void setDepartment(String department) 
	
	{
	
		this.department = department;
	
	}

	public String getEmail() 
	
	{
	
		return email;
	
	}

	public void setEmail(String email) 
	
	{
	
		this.email = email;
	
	}

	public boolean isExempt() 
	
	{
	
		return exempt;
	
	}

	public void setExempt(boolean exempt) 
	
	{
	
		this.exempt = exempt;
	
	}
	
	// toString that is the same output as the Person class.
	@Override
	public String toString() 
	
	{
		
		return (this.getName() +" "+ this.getAddress() +" "+ this.getNumber() +" "+ this.getEID() +" "+ this.getDepartment() +" "+ this.getEID() +" "+ this.isExempt());
		
	}
	
}
