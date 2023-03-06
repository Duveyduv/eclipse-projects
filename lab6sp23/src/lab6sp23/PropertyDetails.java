package lab6sp23;

import java.util.Objects;

public class PropertyDetails 

{
	// fields
	double length;
	double width;
	String Pld;
	
	// main constructor
	public PropertyDetails (double length, double width, String Pld) 
	
	{
	
		this.length = length;
		this.width = width;
		this.Pld = Pld;
		
		
	}

	// setters and getters
	public double getLength() 
	
	{
		
		return length;
	
	}


	public void setLength(double length) 
	
	{
		
		this.length = length;
	
	}


	public double getWidth() 
	
	{
		
		return width;
	
	}


	public void setWidth(double width) 
	
	{
		
		this.width = width;
	
	}


	public String getPld() 
	
	{
		
		return Pld;
	
	}


	public void setPld(String pld) 
	
	{
		
		Pld = pld;
	
	}
	
	// area
	public double getArea(double length, double width)
	
	{
		
		return this.length * this.width;
	
	}

	// equals method that checks everything.
	public boolean equals(PropertyDetails obj) 
	
	{
		
		return obj.getLength() == this.getLength() && obj.getWidth() == this.getWidth() && obj.getPld() == this.getPld() && obj.getArea(obj.length, obj.width) == this.getArea(length, width);
	
	}
	
	// dimensions method that checks if area matches the other object's area.
	public boolean compDimens(PropertyDetails obj)
	
	{
		
		if ((this.getArea(this.length, this.width)) == obj.getArea(length, width))
				
			return true;
		
		else
			return false;
		
	}

	// to string meethod that organizes output.
	@Override
	public String toString() 
	
	{
		
		return "Property " + this.Pld + " with length " + this.getLength() + ", width " + this.width + ", and area " + this.getArea(length, width) + "."; 
		
	}

}
