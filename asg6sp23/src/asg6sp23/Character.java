package asg6sp23;

public class Character 

{
	// Fields
	String name;
	int health;
	int mana;
	
	// Constructor
	public Character(String name, int health, int mana) 
	
	{
		
		this.name = name;
		this.health = health;
		this.mana = mana;
		
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


	public int getHealth() 
	
	{
	
		return health;
	
	}


	public void setHealth(int health) 
	
	{
	
		this.health = health;
	
	}


	public int getMana() 
	
	{
	
		return mana;
	
	}


	public void setMana(int mana) 
	
	{
	
		this.mana = mana;
	
	}
	
	// Main base attack for abstract class
	public void attack(Character target)
	
	{
		
		System.out.println(name + " attacked " + target.getName());
        target.setHealth(target.getHealth() - 10);
			
	}


	// Base toString for Character
	@Override
	public String toString() 
	
	{
	
		return "Character: " + name + ", Health: " + health + " Mana: " + mana;
	
	}
	
}
