package asg6sp23;

public class Warrior extends Character 

{
	
	// Extending from base Character class and new field
    private int strength;

    // Main constructor inheriting base fields
    public Warrior(String name, int health, int mana, int strength) 
    
    {
    
    	super(name, health, mana);
        this.strength = strength;
    
    }

    // Setters and getters
    public int getStrength() 
    
    {
        
    	return strength;
    
    }

    public void setStrength(int strength) 
    
    {
        
    	this.strength = strength;
    
    }

    // Sword attack method
    public void swordAttack(Character target) 
    
    {
        
    	System.out.println(this.getName() + " swung at " + target.getName());
        target.setHealth(target.getHealth() - 10);

    
    }

    // toString overriding Character's toString
    @Override
    public String toString() 
    
    {
        
    	return "Warrior " + super.toString() + ", Strength: " + this.strength;
    
    }

}

