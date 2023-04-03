package asg6sp23;

public class Druid extends Warrior implements WarriorAttack 

{
	// Inheriting Warrior their attacks.
	private int wisdom;

	// Constructor
    public Druid(String name, int health, int mana, int strength, int wisdom) 
    
    {
    
    	super(name, health, mana, strength);
        this.wisdom = wisdom;
    
    }
    
    // Setters and getters
    public int getWisdom() 
    
    {
    
    	return wisdom;
    
    }

    public void setWisdom(int wisdom) 
    
    {
    
    	this.wisdom = wisdom;
    
    }
    
    // Healing spell
    public void heal(Character target) 
    
    {
    
    	System.out.println(this.getName() + " cast a healing spell on " + target.getName());
        target.setHealth(target.getHealth() + 10);
    
    }
    
    // Overriding Warrior toString
    @Override
    public String toString() 
    
    {
    
    	return "Druid " + super.toString() + ", Wisdom: " + this.wisdom;
    
    }

    
    // swordAttack method
    @Override
    public void swordAttack(Character target) 
    
    {
    
    	System.out.println(this.getName() + " swings their sword at " + target.getName());
        target.setHealth(target.getHealth() - 10);

    }
}

