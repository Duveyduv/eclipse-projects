package asg6sp23;

public class Mage extends Character 

{	
	// Extending Character class and new field
    private int intelligence;

    
    // Constructor inheriting Character class fields
    public Mage(String name, int health, int mana, int intelligence) 
    
    {
    
    	super(name, health, mana);
        this.intelligence = intelligence;
    
    }

    // Setters and getters
    public int getIntelligence() 
    
    {
        
    	return intelligence;
    
    }

    public void setIntelligence(int intelligence) 
    
    {
        
    	this.intelligence = intelligence;
    
    }
    
    
    // Fireball spell attack
    public void fireballSpell(Character target) 
    
    {
        
    	System.out.println(this.getName() + " cast a fireball spell at " + target.getName());
        target.setHealth(target.getHealth() - 10);

    }

    // Overriding Character toString
    @Override
    public String toString() 
    
    {
        
    	return "Mage " + super.toString() + ", Intelligence: " + this.intelligence;
    
    }

}

